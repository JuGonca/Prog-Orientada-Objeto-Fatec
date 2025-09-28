package classes;

/**
 *
 * @author Júlia
 */
public class Gato extends Animal{
    private String corPelo;
    
    public Gato(String n, int i, double p, String c){
        super(n, i, p);
        corPelo = c;
    }
    
    public String getCorPelo(){
        return corPelo;
    }
    
    public void acaoArranhar(){
        System.out.println("está arranhando");
    }
    
    public void acaoMiar(){
        System.out.println("Miau miau");
    }
}
