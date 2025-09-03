/**
 * 
 * @author Júlia
 */
import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {
        int numeroConta;
        double saldoAtual = 0;
        
        int opcao = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o número da conta: ");
        numeroConta = entrada.nextInt();
        
        ContaCorrente novaConta = new ContaCorrente(numeroConta, saldoAtual);
        
        do{
            System.out.println("\nDigite uma opção:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Sair");
            
            opcao = entrada.nextInt();
            
            double valor;
            if(opcao == 1){
                System.out.println("\nConta: " + novaConta.getNumero());
                System.out.println("Valor a depositar: R$");
                valor = entrada.nextDouble();
                novaConta.depositar(valor);
            }
            else if(opcao == 2){
                System.out.println("\nConta: " + novaConta.getNumero());
                System.out.println("Valor a sacar: R$");
                valor = entrada.nextDouble();
                if(novaConta.getSaldo() < valor){
                    System.out.println("\nSaldo insuficiente.");
                }
                else{
                    novaConta.sacar(valor);
                    System.out.println("\nExecutado com sucesso.");
                }
            }
            else if(opcao == 3){
                System.out.println("\nConta: " + novaConta.getNumero());
                System.out.println("Saldo Atual: R$"+novaConta.getSaldo());
            }
            else{
                System.out.println("\nEncerrando...");
            }
        }while(opcao < 4);
    }
    
}
