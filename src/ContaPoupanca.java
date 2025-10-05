public class ContaPoupanca extends Contas{
    private double taxaRendimentoMensal;

    public ContaPoupanca(String numeroDaConta, String titular, double saldo, double taxaRendimentoMensal) {
        super(numeroDaConta, titular, saldo);
        this.taxaRendimentoMensal = taxaRendimentoMensal;
    }

    public double getTaxaRendimentoMensal() {
        return taxaRendimentoMensal;
    }

    public void setTaxaRendimentoMensal(double taxaRendimentoMensal) {
        this.taxaRendimentoMensal = taxaRendimentoMensal;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.printf("Taxa de rendimento mensal: %.2f%n", getTaxaRendimentoMensal());
    }

    public void mostrarDados(boolean emTaxaAnual) {
        super.mostrarDados();
        if (emTaxaAnual) {
            double taxaAnual = getTaxaRendimentoMensal() * 12;
            System.out.printf("\nTaxa de rendimento anual aproximada: %.2f%%%n", taxaAnual);
        } else {
            System.out.printf("Taxa de rendimento mensal: %.2f%%%n", getTaxaRendimentoMensal());
        }
    }
}
