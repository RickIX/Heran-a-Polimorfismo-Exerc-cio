package Ex05a11;

public class FuncionarioBasico extends Funcionario{
    private String escolaBasica;


    public FuncionarioBasico(String nome, int codigoFuncional, String escolaBasica) {
        super(nome, codigoFuncional);
        this.escolaBasica = escolaBasica;
    }

    public String getEscolaBasica() {
        return escolaBasica;
    }

    public void setEscolaBasica(String escolaBasica) {
        this.escolaBasica = escolaBasica;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEscola Básica: " + escolaBasica;
    }



    @Override
    public double calcularRenda() {
        return super.calcularRenda() *1.10;
    }
}
