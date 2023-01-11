package pagamento;

import caixa.Checkout;
import caixa.Compra;
import impressao.HP;
import impressao.Impressora;

public class Principal {
    public static void main(String[] args) {
        // Para testar: precisamos instanciar uma operadora, uma impressora,
        // um cartão do cliente, uma compra, e finalmente instanciar um
        // checkout
        Operadora operadora = new Nubank();
        Impressora impressora  = new HP();
        Cartao cartao = new Cartao();
        cartao.setNomeDoCliente("Anderson Vieira");
        cartao.setNumeroCartao("1234.5555.5555.4434");
        Compra compra = new Compra();
        compra.setNomeCliente("Anderson Vieira");
        compra.setProduto("Mouse Microsoft Bluetooth 5665");
        compra.setValorCompra(199.99);
        //Finalizando a compra do produto
        Checkout checkout = new Checkout(operadora,impressora);
        checkout.fecharCompra(compra,cartao);

    }
}

