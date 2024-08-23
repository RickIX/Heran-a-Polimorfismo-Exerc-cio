package Ex05a11;

public class FuncionarioMedio extends FuncionarioBasico{

    private String escolaMedia;

    public FuncionarioMedio(String nome, int codigoFuncional, String escolaBasica, String escolaMedia) {
        super(nome, codigoFuncional, escolaBasica);
        this.escolaMedia = escolaMedia;
    }

    public String getEscolaMedia() {
        return escolaMedia;
    }

    public void setEscolaMedia(String escolaMedia) {
        this.escolaMedia = escolaMedia;
    }

    @Override
    public String toString() {
        return super.toString() + " \nEscola Media: " + escolaMedia;
    }

    @Override
    public double calcularRenda() {
        return super.calcularRenda()*1.50;
    }
}
