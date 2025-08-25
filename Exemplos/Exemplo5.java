/**
 *
 * @author Júlia
 */
public class Exemplo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont = 1;
        int x = (int)(Math.random()*100);
        
        System.out.println("TABUADA DO "+ x);
        do{
           System.out.println(x +" * " + cont + " = " + cont*x);
           cont++;
        }while(cont<=10);
    }
    
}
