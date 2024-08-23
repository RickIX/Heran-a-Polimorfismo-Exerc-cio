package Ex05a11;

public class Supervisor implements Comissao {
    private static final double VALOR_COMISSAO = 600.00;

    @Override
    public void comissao() {
        
    }

    @Override
    public double obterComissao() {
        return VALOR_COMISSAO;
    }
}
