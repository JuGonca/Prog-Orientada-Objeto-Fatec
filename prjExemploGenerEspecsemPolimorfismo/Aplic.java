
import fatec.poo.model.Aluno;
import fatec.poo.model.Professor;
/**
 *
 * @author Júlia
 */
public class Aplic {
    public static void main(String[] args) {
        Aluno objAlu = new Aluno(1010, "Carlos Silveira", "15/03/1978");
        
        objAlu.setMensalidade(1500);
        
        System.out.println("Registro escolar: " + objAlu.getRegEscolar());
        System.out.println("Nome: " + objAlu.getNome());
        System.out.println("Data nascimento: " + objAlu.getDataNascimento());
        System.out.println("Mensalidade: " + objAlu.getMensalidade());
        
        
        
        Professor objProf = new Professor(222, "Ana Beatriz", "27/09/1987");
        
        objProf.setSalario(2333);
                
        System.out.println("Registro funcional: " + objProf.getRegFuncional());
        System.out.println("Nome: " + objProf.getNome());
        System.out.println("Data nascimento: " + objProf.getDataNascimento());
        System.out.println("Salario: " + objProf.getSalario());
    }    
}
