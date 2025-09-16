package fatec.poo.model;
/**
 *
 * @author Júlia
 */
public class FuncionarioHorista extends Funcionario{
    private double valorHoraTrab;
    private int qtdHoraTrab;
    
    public FuncionarioHorista(int r, String n, String dt, double vh){
        super(r,n,dt);
        valorHoraTrab = vh;
    }
    
    public void setQtdHoriario(int qht){
        qtdHoraTrab = qht;
    }
    
    public double calcSalBruto(){
        return(valorHoraTrab * qtdHoraTrab);
    }
}
