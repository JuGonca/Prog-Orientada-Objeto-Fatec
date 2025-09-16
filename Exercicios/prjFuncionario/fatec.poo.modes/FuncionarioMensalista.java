package fatec.poo.model;
/**
 *
 * @author Júlia
 */
public class FuncionarioMensalista extends Funcionario{
    private double valSalMin;
    private int numSalMin;
    
    public FuncionarioMensalista(int r, String n, String dt, double sm){
        super(r, n, dt);
        valSalMin = sm;
    }
    
    public void setNumSalMin(int nm){
        numSalMin = nm;
    }
    
    public double salBruto(){
    
    }
}
