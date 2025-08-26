/**
 *
 * @author 0030482321019
 */
public class Circulo {
    private double raio;
    
    public void setRaio(double a){
        raio = a;
    }
    
    public double getRaio(){
        return raio;
    }
    
    public double calcArea(){
        return Math.pow(raio,2)*3.16;
    }
    
    public double calcPerimetro(){
        return 2*raio*3.16;
    }
    
    public double calDiametro(){
        return 2*raio;
    }
    
}
