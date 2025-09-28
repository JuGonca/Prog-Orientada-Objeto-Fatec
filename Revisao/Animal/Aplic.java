import classes.Gato;
import classes.Cachorro;
import java.util.Scanner;
/**
 *
 * @author Júlia
 */
public class Aplic {
    public static void main(String[] args) {
        Gato objGato = new Gato("Garfield", 2, 9.5, "Laranja");
        Cachorro objDog = new Cachorro("Plutos", 3, 5.0, "Viralata");
        
        int opcao1 = 0;
        int opcao2 = 0;
        Scanner entrada = new Scanner(System.in);
                
        while(opcao1 != 3){
            
            System.out.println("Consultar Registro");
            System.out.println("Selecione um animal:");
            System.out.println("1 - Garfield");
            System.out.println("2 - Plutos");
            System.out.println("3 - Sair");
        
        opcao1 = entrada.nextInt();
            
            if(opcao1 == 1){
                System.out.println("Nome: " + objGato.getNome());
                System.out.println("Cor do pelo:" + objGato);
                System.out.println("Idade: " + objGato.getIdade());
                System.out.println("Peso: " + objGato.getPeso() + "kg");

                while(opcao2 != 5){
                    System.out.println("Escolha uma opcao:");
                    System.out.println("1 - Comer");
                    System.out.println("2 - Dormir");
                    System.out.println("3 - Arranhar");
                    System.out.println("4 - Miar");
                    System.out.println("5 - Sair");
                    
                    opcao2 = entrada.nextInt();
                    
                    if (opcao2 == 1) {
                         System.out.println("O " + objGato.getNome() + " ");
                         objGato.acaoComer();
                    }
                    else if(opcao2 == 2){
                        System.out.println("O " + objGato.getNome() + " ");
                        objGato.acaoDormir();
                    }
                    else if(opcao2 == 3){
                        System.out.println("O " + objGato.getNome() + " ");
                        objGato.acaoArranhar();
                    }
                    else if(opcao2 == 4){
                        System.out.println("O " + objGato.getNome() + " ");
                        objGato.acaoMiar();
                    }
                }
            }
            else if(opcao1 == 2){
                opcao2 = 0;
                System.out.println("Nome: " + objDog.getNome());
                System.out.println("Raça: " + objDog.getRaca());
                System.out.println("Idade: " + objDog.getIdade());
                System.out.println("Peso:" + objDog.getPeso());
                
                while(opcao2 != 5){
                    System.out.println("Escolha uma opcao:");
                    System.out.println("1 - Comer");
                    System.out.println("2 - Dormir");
                    System.out.println("3 - Correr");
                    System.out.println("4 - Latir");
                    System.out.println("5 - Sair");

                    opcao2 = entrada.nextInt();

                    if (opcao2 == 1) {
                        System.out.println("O " + objDog.getNome() + " ");
                        objDog.acaoComer();
                    }
                    else if(opcao2 == 2){
                        System.out.println("O " + objDog.getNome() + " ");
                        objDog.acaoDormir();
                    }
                    else if(opcao2 == 3){
                        System.out.println("O " + objDog.getNome() + " ");
                        objDog.acaoCorrer();
                    }
                    else if(opcao2 == 4){
                        System.out.println("O " + objDog. getNome() + " ");
                        objDog.acaoLatir();
                    }
                }
            }
        }
    }
}
