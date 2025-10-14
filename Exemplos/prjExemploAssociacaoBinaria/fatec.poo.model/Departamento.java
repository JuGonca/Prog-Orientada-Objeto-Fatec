//Classe Principal
package fatec.poo.model;

/**
 *
 * @author Júlia
 */
public class Departamento {
    private String sigla;
    private String nome;
    private Funcionario funcionarios;
    private int numFun;

    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }
    
    public void addFuncionario(funcionarios){
        
    }
    
    public void listaFuncionario(funcionarios){
    
    }
}
