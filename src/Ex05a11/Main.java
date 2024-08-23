
package Ex05a11;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Pedro", 382, new Vendedor());
        FuncionarioBasico funcionario2 = new FuncionarioBasico("Juca", 439, "Marista");
        FuncionarioMedio funcionario3 = new FuncionarioMedio("Julia", 193, "Adventista", "Santa Escola");
        FuncionarioGraduado funcionario4 = new FuncionarioGraduado("Duncan", 1268, "Tupi", "Dom Bosco", "UTFPR");


        System.out.println(funcionario1);
        System.out.println(funcionario2);
        System.out.println(funcionario3);
        System.out.println(funcionario4);
    }
}
