package pagamento;

public interface Autorizacao {
    // Só preciso saber o valor total da compra, para ele ser autorizável
    // ou não
    public double getValorCompra();
}
