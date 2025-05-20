package view;

import model.Pagamento;
import model.CartaoCredito;
import model.Boleto;
import model.Pix;

public class Main {
    public static void main(String[] args) {
        Pagamento pagamento1 = new CartaoCredito();
        Pagamento pagamento2 = new Boleto();
        Pagamento pagamento3 = new Pix();

        double valorCompra = 100.0;

        pagamento1.processar(valorCompra);
        pagamento2.processar(valorCompra);
        pagamento3.processar(valorCompra);
    }
}
