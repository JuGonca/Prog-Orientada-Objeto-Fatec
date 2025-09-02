/**
 * // Terminar atividade //
 * @author Júlia
 */
import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {
        int numeroConta;
        double saldoAtual;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o número da conta: ");
        numeroConta = entrada.nextInt();
        
        contaCorrente novaConta = new contaCorrente();
        
        novaConta.getNumero();
    }
    
}
