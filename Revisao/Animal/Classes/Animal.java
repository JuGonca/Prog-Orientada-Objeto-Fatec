package classes;

/**
 *
 * @author Júlia
 */
public class Animal {
    private String nome;
    private int idade;
    private double peso;
    
    public Animal(String n, int i, double p){
        nome = n;
        idade = i;
        peso = p;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public void acaoComer(){
        System.out.println("está comendo");
    }
    
    public void acaoDormir(){
        System.out.println("está dormindo");
    }
}
