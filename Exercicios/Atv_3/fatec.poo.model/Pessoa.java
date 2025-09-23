package fatec.poo.modes;

/**
 *
 * @author Júalia
 */
abstract class Pessoa {
    protected String nome;
    protected int anoInscricao;
    protected double totalCompras;
    
    public Pessoa(String n, int ai){
        nome = n;
        anoInscricao = ai;
    }
    
    public double calcBonus(int x){
        return 0;
    }
    
    public void addCompras (double y){
        totalCompras = totalCompras + y;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getanoInscricao(){
        return anoInscricao;
    }
    
    public double getTotalCompras(){
        return totalCompras;
    }
}
