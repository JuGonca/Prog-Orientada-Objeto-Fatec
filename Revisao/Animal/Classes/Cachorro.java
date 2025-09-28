package classes;

/**
 *
 * @author Júlia
 */
public class Cachorro extends Animal{
    private String raca;
    
    public Cachorro (String n, int i, double p, String r){
        super(n, i, p);
        raca = r;
    }
    
    public String getRaca(){
        return raca;
    }
    
    public void acaoCorrer(){
        System.out.println("está correndo.");
    }
    
    public void acaoLatir(){
        System.out.println("Au au");
    }
}
