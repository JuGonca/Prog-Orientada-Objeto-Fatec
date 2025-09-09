/**
 *
 * @author Júlia
 */
import fatec.poo.model.Cliente;
import fatec.poo.model.Instrutor;

public class Aplic {

    public static void main(String[] args) {
        Instrutor objInst = new Instrutor(1234, "José Paulo Freitas", "(55)55555-5555");
        
        objInst.setAreaAtuacao("Programação");
        
        System.out.println("Identificação: " + objInst.getIdentificacao());
        System.out.println("Nome: "+ objInst.getNome());
        System.out.println("Telefone: "+ objInst.getTelefone());
        System.out.println("Área de Atuação: " + objInst.getAreaAtuacao());
        
        
        System.out.println("\n\n");
        
        Cliente objCliente = new Cliente("222.222.222-22", "Amanda Lima", "(11)11111-1111");
        
        objCliente.setPeso(60.0);
        objCliente.setAltura(1.67);
        
        System.out.println("CPF: " + objCliente.getCpf());
        System.out.println("Nome: "+ objCliente.getNome());
        System.out.println("Telefone: "+ objCliente.getTelefone());
        System.out.println("Peso: " + objCliente.getPeso());
        System.out.println("Altura: " + objCliente.getAltura());
        
        
    }
    
}
