public class ContaInvestimento extends Contas{
    private double taxaAdministracao;

    public ContaInvestimento(String numeroDaConta, String titular, double saldo, double taxaAdministracao) {
        super(numeroDaConta, titular, saldo);
        this.taxaAdministracao = taxaAdministracao;
    }

    public double getTaxaAdministracao() {
        return taxaAdministracao;
    }

    public void setTaxaAdministracao(double taxaAdministracao) {
        this.taxaAdministracao = taxaAdministracao;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.printf("\nTaxa de administração: %.2f%n", getTaxaAdministracao());
    }

    public void mostrarDados(boolean considerarTaxa) {
        super.mostrarDados();
        System.out.printf("\nTaxa de administração: %.2f%%%n", getTaxaAdministracao());

        if (considerarTaxa) {
            double projecaoPercentual = 10; // Exemplo: projeção de 10%
            double saldoProjetado = getSaldo() + (getSaldo() * projecaoPercentual / 100);
            double saldoLiquido = saldoProjetado - (saldoProjetado * getTaxaAdministracao() / 100);

            System.out.printf("Saldo líquido com projeção %.2f%% e taxa: R$ %.2f%n",
                    projecaoPercentual, saldoLiquido);
        }
    }
}
