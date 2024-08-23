package Ex05a11;



public class Funcionario {
    private String nome;
    private int codigoFuncional;
    protected static final double RENDA_BASICA = 1000.00;
    private Comissao comissao;

    public Funcionario(String nome, int codigoFuncional, Comissao comissao) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.comissao = comissao;
    }

    public Funcionario(String pedro, int codigoFuncional) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setCodigoFuncional(int codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }

    public Comissao getComissao() {
        return comissao;
    }

    public void setComissao(Comissao comissao) {
        this.comissao = comissao;
    }

    public double calcularRenda() {
        return RENDA_BASICA;
    }

    public double calcularRendaTotal() {
        return calcularRenda() + (comissao != null ? comissao.obterComissao() : 0);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Comissão: R$ " + (comissao != null ? comissao.obterComissao() : 0) + ", Salário Total: R$ " + calcularRendaTotal();
    }
}
