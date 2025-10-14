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
    
    public void addFuncionario(Funcionario f){
        funcionarios[numFunc++] = f;
    }
    
    public void listaFuncionario(){
        System.out.println("\n\nSigla: " + sigla);
        System.out.println("Nome: " + nome);
        System.out.println("Qtd Funcionarios: " + numFunc);
        System.out.println("\nRegistro\t\tNome\t\tCargo");
        for(int x=0; x < numFunc; x++){
            System.out.print(funcionarios[x].getRegistro());
            System.out.print(funcionarios[x].getNome());
            System.out.print(funcionarios[x].getCargo());
        }
    }
}
