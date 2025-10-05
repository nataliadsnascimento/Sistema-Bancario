public class Contas {
    private String numeroDaConta;
    private String titular;
    private double saldo;

    public Contas(String numeroDaConta, String titular, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumero(String newNumero) {
        this.numeroDaConta = newNumero;
    }

    public void setTitular(String newTitular) {
        this.titular = newTitular;
    }

    public void setSaldo(double newSaldo) {
        this.saldo = newSaldo;
    }

    public void mostrarDados() {
        System.out.println("======= Informações da conta =======");
        System.out.println("Número da conta: " + getNumeroDaConta());
        System.out.println("Titular: " + getTitular());
        System.out.printf("Saldo: R$ %.2f", getSaldo());
    }

    public void mostrarDados(double projecaoMensal) {
        System.out.println("======= Informações da conta com Projeção Mensal =======");
        System.out.println("Número da conta: " + getNumeroDaConta());
        System.out.println("Titular: " + getTitular());
        double saldoProjetado = saldo + (saldo * projecaoMensal / 100);
        System.out.printf("Saldo atual: R$ %.2f%n", getSaldo());
        System.out.printf("Saldo projetado (%.2f%%): R$ %.2f%n", projecaoMensal, saldoProjetado);
    }
}

