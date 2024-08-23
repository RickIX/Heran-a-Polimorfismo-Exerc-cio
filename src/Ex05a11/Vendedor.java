package Ex05a11;

public class Vendedor implements Comissao {
    private static final double VALOR_COMISSAO = 250.00;

    @Override
    public void comissao() {
        
    }

    @Override
    public double obterComissao() {
        return VALOR_COMISSAO;
    }
}
