public class ContaCorrente extends Contas {
    private double limiteChequeEspecial;

    public ContaCorrente(String numeroDaConta, String titular, double saldo, double limiteChequeEspecial) {
        super(numeroDaConta, titular, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.printf("\nLimite do cheque especial: R$ %.2f%n", getLimiteChequeEspecial());
    }

    public void mostrarDados(boolean detalharLimite) {
        super.mostrarDados();
        System.out.printf("Limite do cheque especial: R$ %.2f%n", getLimiteChequeEspecial());
        if (detalharLimite) {
            double saldoDisponivel = getSaldo() + getLimiteChequeEspecial();
            System.out.printf("Saldo disponível (saldo + limite): R$ %.2f%n", saldoDisponivel);
        }
    }
}
