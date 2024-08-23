package Ex05a11;

public class Gerente implements Comissao {
    private static final double VALOR_COMISSAO = 1500.00;

    @Override
    public void comissao() {

    }

    @Override
    public double obterComissao() {
        return VALOR_COMISSAO;
    }
}

