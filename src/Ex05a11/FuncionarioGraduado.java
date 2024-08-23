package Ex05a11;

public class FuncionarioGraduado extends FuncionarioMedio{
    private String universidade;

    public FuncionarioGraduado(String nome, int codigoFuncional, String escolaBasica, String escolaMedia, String universidade) {
        super(nome, codigoFuncional, escolaBasica, escolaMedia);
        this.universidade = universidade;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    public String toString() {
        return super.toString() + " " +
                "\nUniversidade: " + universidade;
    }
    @Override
    public double calcularRenda() {
        return super.calcularRenda() *2;
    }
}
