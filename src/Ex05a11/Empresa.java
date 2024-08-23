package Ex05a11;

import java.util.Random;

public class Empresa {
    private Funcionario[] funcionarios;
    private static final int TOTAL_FUNCIONARIOS = 10;
    private static final double PERCENTUAL_GERENTE = 0.10;
    private static final double PERCENTUAL_SUPERVISOR = 0.20;
    private static final double PERCENTUAL_VENDEDOR = 0.70;

    public Empresa() {
        funcionarios = new Funcionario[TOTAL_FUNCIONARIOS];
        distribuirFuncionarios();
    }

    private void distribuirFuncionarios() {
        Random rand = new Random();
        int gerenteCount = (int) (TOTAL_FUNCIONARIOS * PERCENTUAL_GERENTE);
        int supervisorCount = (int) (TOTAL_FUNCIONARIOS * PERCENTUAL_SUPERVISOR);
        int vendedorCount = TOTAL_FUNCIONARIOS - gerenteCount - supervisorCount;

        for (int i = 0; i < TOTAL_FUNCIONARIOS; i++) {
            String nome = "Funcionario" + (i + 1);
            int codigo = 1000 + i;
            Comissao comissao = null;

            if (gerenteCount > 0) {
                comissao = new Gerente();
                gerenteCount--;
            } else if (supervisorCount > 0) {
                comissao = new Supervisor();
                supervisorCount--;
            } else if (vendedorCount > 0) {
                comissao = new Vendedor();
                vendedorCount--;
            }

            funcionarios[i] = new Funcionario(nome, codigo, comissao);
        }
    }

    public void calcularCustos() {
        double custoTotal = 0;
        double custoGerente = 0;
        double custoSupervisor = 0;
        double custoVendedor = 0;

        for (Funcionario func : funcionarios) {
            double rendaTotal = func.calcularRendaTotal();
            custoTotal += rendaTotal;

            if (func.getComissao() instanceof Gerente) {
                custoGerente += rendaTotal;
            } else if (func.getComissao() instanceof Supervisor) {
                custoSupervisor += rendaTotal;
            } else if (func.getComissao() instanceof Vendedor) {
                custoVendedor += rendaTotal;
            }
        }

        System.out.println("Custo Total da Empresa: R$ " + custoTotal);
        System.out.println("Custo com Gerentes: R$ " + custoGerente);
        System.out.println("Custo com Supervisores: R$ " + custoSupervisor);
        System.out.println("Custo com Vendedores: R$ " + custoVendedor);
    }

    public void imprimirFuncionarios() {
        for (Funcionario func : funcionarios) {
            System.out.println(func);
        }
    }

    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.calcularCustos();
        empresa.imprimirFuncionarios();
    }
}
