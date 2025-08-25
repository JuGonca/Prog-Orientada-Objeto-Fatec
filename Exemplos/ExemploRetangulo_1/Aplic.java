/**
 *
 * @author Júlia
 */
public class Aplic {
    public static void main(String[] args) {
        System.out.println("RETANGULO 1");

        //definição do ponteiro
        Retangulo objRet;
        
        //Instanciando Objeto
        objRet = new Retangulo();
        
        //Implementação do caso de uso
        //Montar figura geométrica Retangulo
        objRet.setAltura(5.0);
        objRet.setBase(8.0);
        
        System.out.println("Altura: " + objRet.getAltura());
        System.out.println("Base: " + objRet.getBase());
        
        //Implementação do Caso de Uso
        //Calcular Area
        System.out.println("Área do Retangulo: " + objRet.calcArea());
        
        //Implementação do Caso de Uso
        //Calcular Perímetro
        System.out.println("Perímetro do Retângulo: " + objRet.calcPerimetro());
        
        //Implementação do caso de uso
        //Calcular Diagonal Retangulo
        System.out.println("Diagonal: " + objRet.calcDiagonal());
        
        System.out.println("");
        System.out.println("RETANGULO 2");
        //Retangulo 2
        Retangulo objRet2 = new Retangulo();
        
        objRet2.setAltura(3.0);
        objRet2.setBase(4.0);
        
        System.out.println("Altura: " + objRet2.getAltura());
        System.out.println("Base: " + objRet2.getBase());
        
        //Implementação do Caso de Uso
        //Calcular Area
        System.out.println("Área do Retangulo: " + objRet2.calcArea());
        
        //Implementação do Caso de Uso
        //Calcular Perímetro
        System.out.println("Perímetro do Retângulo: " + objRet2.calcPerimetro());
        
        //Implementação do caso de uso
        //Calcular Diagonal Retangulo
        System.out.println("Diagonal: " + objRet2.calcDiagonal());
        
        
    }
    
}
