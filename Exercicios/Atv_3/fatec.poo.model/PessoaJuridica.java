package fatec.poo.modes;

/**
 *
 * @author 0030482321019
 */
public class PessoaJuridica extends Pessoa{
    private String cgc;
    private double taxaIncentivo;
    
    public PessoaJuridica(String n, String c, int an){
        super(n, an);
        cgc = c;
    }
    
    public double calcBonus(int anoAtual){
        return (taxaIncentivo * totalCompras) * (anoAtual - anoInscricao);
    }
    
    public void setTaxaIncentivo(double valPorcentagem){
        taxaIncentivo = valPorcentagem;
    }
    
    public String getCgc(){
        return cgc;
    }
    
    public double getTaxaIncentivo(){
        return taxaIncentivo;
    }
    
}
