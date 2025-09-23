/**
 *
 * @author Júlia
 */

import fatec.poo.modes.PessoaFisica;
import fatec.poo.modes.PessoaJuridica;

public class Aplic {
    public static void main(String[] args) {
        
        int atendente;
        
        PessoaFisica objPF = new PessoaFisica("Antonio Carlos", "111.111.111.-11", 2020);
        objPF.setBase(5);
        System.out.println("Nome: " + objPF.getNome());
        System.out.println("CPF: " + objPF.getCpf());
        System.out.println("Ano de Inscrição: " + objPF.getanoInscricao());
        
        PessoaJuridica objPJ = new PessoaJuridica("Maria Alice", "1234567890", 2022);
        objPJ.setTaxaIncentivo(15);
        System.out.println("Nome: " + objPJ.getNome());
        System.out.println("CGC: " + objPJ.getCgc());
        System.out.println("Ano de Inscrição: " + objPJ.getanoInscricao());
        
        System.out.println("\nEscolha um atendente: ");
        System.out.println("1 - " + objPF.getNome());
        System.out.println("2 - " + objPJ.getNome());
        
        
    }
    
}
