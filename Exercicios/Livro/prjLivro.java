/**
 *
 * @author Júlia
 */
public class Livro {
    int identificacao;
    String titulo;
    boolean situacao;
    double ValMultaDiaria;
    
    public Livro(int id, String tit, boolean sit, double ValMulta){
        identificacao = id;
        titulo = tit;
        situacao = sit;
        ValMultaDiaria = ValMulta;
        
    }
    
    public void setValMultaDiaria(double a){
        ValMultaDiaria = a;
    }
    
    public int getIdentificacao(){
        return identificacao;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public boolean getSituacao(){
        return situacao;
    }
    
    public void emprestar(){
        situacao = true;
    }
    
    public double devolver (int diasAtraso){
        situacao = false;
        return ValMultaDiaria * diasAtraso;
    }
    
}
