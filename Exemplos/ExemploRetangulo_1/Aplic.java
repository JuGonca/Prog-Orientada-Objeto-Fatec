/**
 *
 * @author Júlia
 */
public class Aplic {
    public static void main(String[] args) {
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
        
    }
    
}
