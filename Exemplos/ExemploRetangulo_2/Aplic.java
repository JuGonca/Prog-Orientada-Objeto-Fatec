import java.util.Scanner;
/**
 * @author Júlia
 */
public class Aplic {

    public static void main(String[] args) {
        double medAlt, medBase;
        int opcao = 0;
        //instanciação do objeto da classe scanner
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a medida da altura do Retângulo: ");
        medAlt = entrada.nextDouble();
        System.out.println("Digite a medida da base do Retângulo: ");
        medBase = entrada.nextDouble();
        
        //intanciação de um objeto da classe retangulo
        Retangulo objRet = new Retangulo();
        
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        
        do{
            System.out.println("\n\n1-Consultar medida da área");
            System.out.println("2-Consultar medida do perímetro");
            System.out.println("3-Consultar medida da diagonal");
            System.out.println("4-Encerrar");
            opcao = entrada.nextInt();
            
            if(opcao == 1){
                System.out.println("\nMedida da área: " + objRet.calcArea());
            }
            else if(opcao == 2){
                System.out.println("\nMedida do perímetro: " + objRet.calcPerimetro());
            }
            else if(opcao == 3){
                System.out.println("\nMedida da diagonal: " + objRet.calcDiagonal());
            }
            else if(opcao == 4){
                System.out.println("\nEncerrando...");
            }
            else{
                System.out.println("\nDigite uma opção válida.");
            }
        }while(opcao != 4);
    }
    
}
