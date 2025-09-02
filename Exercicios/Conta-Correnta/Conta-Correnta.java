/**
 *
 * @author Júlia
 */
public class contaCorrente {
        private int numero;
        private double saldo;
    
    //Método construtor
    public void ContaCorrente(int numero, double saldo){
        numero = numero;
        saldo = saldo;
    }
    
    //Retorna o número da conta
    public int getNumero(){
        return numero;
    }
    
    //Retorna o saldo da conta
    public double getSaldo(){
        return saldo;
    }
    
    public void sacar(double a){
        saldo = saldo - a;
    }
    
    public void depositar(double b){
        saldo = saldo + b;
    }
  
}
