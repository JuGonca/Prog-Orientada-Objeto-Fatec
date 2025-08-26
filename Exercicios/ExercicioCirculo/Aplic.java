import java.util.Scanner;
/**
 *
 * @author Júlia
 */
public class Aplic {
    public static void main(String[] args) {
        double medRaio;
        int opcao = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a medida do raio: ");
        medRaio = entrada.nextDouble();
        
        //instanciando objeto Circulo
        Circulo objCirculo = new Circulo();
        
        objCirculo.setRaio(medRaio);
        
        do{
            System.out.println("\n\n1-Consultar medida da área");
            System.out.println("2-Consultar medida do perímetro");
            System.out.println("3-Consultar medida da diametro");
            System.out.println("4-Encerrar");
            
            System.out.println("\n\nDigite uma opção:");
            opcao = entrada.nextInt();
            
            System.out.println("Raio: " + objCirculo.getRaio());
            
            if(opcao == 1){
                System.out.println("\nMedida da área: " + objCirculo.calcArea());
            }
            else if(opcao == 2){
                System.out.println("\nMedida do perímetro: " + objCirculo.calcPerimetro());
            }
            else if(opcao == 3){
                System.out.println("\nMedida da diagonal: " + objCirculo.calDiametro());
            }
            else if(opcao == 4){
                System.out.println("\nEncerrando...");
            }
            else{
                System.out.println("\nDigite uma opção válida.");
            }
        }while(opcao!=4);
    }   
}
