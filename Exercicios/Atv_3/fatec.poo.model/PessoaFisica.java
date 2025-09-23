package fatec.poo.modes;

/**
 *
 * @author Julia
 */
public class PessoaFisica extends Pessoa{
    private String cpf;
    private double base;
    
    public PessoaFisica(String n, String c, int ai ){
        super(n, ai);
        cpf = c;
    }
    
    public double calcBonus(int anoAtual){
        if(totalCompras > 12000){
            return (anoAtual - anoInscricao) * base;
        }
        else{
            return 0;
        }
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public void setBase(double x){
        base = x;
    }
    
    public double getBase(){
        return base;
    }
}
