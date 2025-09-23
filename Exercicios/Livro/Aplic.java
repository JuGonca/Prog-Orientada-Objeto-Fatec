/**
 *
 * @author Júlia
 */
import java.util.Scanner;
public class Aplic {
    public static void main(String[] args){
        //variáveis
        int id;
        String titulo;
        boolean situacao;
        double multaDiaria;
        
        int opcao = 0;
        int diasAtraso;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("// Cadastro de novo Livro // ");
        System.out.println("ID: ");
        id = entrada.nextInt();
        
        System.out.println("Título: ");
        titulo = entrada.next();
        
        System.out.println("Multa Diária: ");
        multaDiaria = entrada.nextDouble();
        
        situacao = false;
        
        Livro novoLivro = new Livro(id, titulo, situacao, multaDiaria);
        
        do{
            //Opções de interação
            System.out.println("Escolha uma opção: \n");
            System.out.println("1 - Consultar Livro.");
            System.out.println("2 - Emprestar Livro.");
            System.out.println("3 - Devolver Livro.");
            System.out.println("4 - Sair.");
            
            opcao = entrada.nextInt();

            //Informa os dados e o status do livor
            if(opcao == 1){
            System.out.println("ID: " + novoLivro.getIdentificacao());
            System.out.println("Título: " + novoLivro.getTitulo());
            if (novoLivro.getSituacao() == false){
                System.out.println("Status: Disponível.");
            }
            else{
                System.out.println("Status: Indisponível.");
            }
            System.out.println("Multa Diária: " + multaDiaria);
            }
            //Empréstimo do livro.
            else if(opcao == 2){
                if(novoLivro.getSituacao() == false){
                    novoLivro.emprestar();
                    System.out.println("Status atualizado para: Indisponível");
                }
                else{
                    System.out.println("O Livro está emprestado.");
                }
            }
            //Devolução do livro
            else if(opcao == 3){
                if(novoLivro.getSituacao() == true){
                    System.out.println("Informe a quantidade de dias de atraso: ");
                    diasAtraso = entrada.nextInt();
                    //Atualiza status e calcula a multa
                    System.out.println("Status atualizado para: Disponível.");
                    System.out.println("Valor Multa: R$" + novoLivro.devolver(diasAtraso) );
                }
                else{
                    System.out.println("O Livro já está disponível");
                }
            }
            else{
                System.out.println("\nEncerrando...");
            }
        }while(opcao < 4);
       
    }
}
