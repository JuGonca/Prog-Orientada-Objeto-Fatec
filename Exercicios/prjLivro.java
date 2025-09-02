/**
 *
 * @author Júlia
 */
public class Livro {
    int identificacao;
    String titulo;
    boolean situacao;
    double ValMultaDiaria;
    
    public void Livro(int id, String tit){
        identificacao = id;
        titulo = tit;
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
