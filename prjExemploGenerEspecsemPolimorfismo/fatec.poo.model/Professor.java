package fatec.poo.model;

/**
 *
 * @author Júlia
 */
public class Professor extends Pessoa{
    private int regfuncional;
    private double salario;
    
    public Professor(int rf, String n, String dn){
        super(n, dn);
        regfuncional = rf;
    }
    
    public void setSalario(double s){
        salario = s;
    }
    
    public int getRegFuncional(){
        return(regfuncional);
    }
    
    public double getSalario(){
        return(salario);
    }
}
