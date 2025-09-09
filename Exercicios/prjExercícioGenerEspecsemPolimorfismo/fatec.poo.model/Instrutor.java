package fatec.poo.model;


/**
 *
 * @author Júlia
 */
public class Instrutor extends Pessoa{
    private int identificacao;
    private String areaAtuacao;
    
    public Instrutor(int i, String n, String t){
        super(n,t);
        identificacao = i;
    }
    
    public void setAreaAtuacao(String a){
        areaAtuacao = a;
    }
    
    public int getIdentificacao(){
        return(identificacao);
    }
    
    public String getAreaAtuacao(){
        return(areaAtuacao);
    }
}
