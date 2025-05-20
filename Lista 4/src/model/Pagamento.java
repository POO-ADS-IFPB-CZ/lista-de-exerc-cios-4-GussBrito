package model;

abstract class Pagamento{
    public abstract void processar(double valor);
}

class CartaoCredito extends Pagamento{
    @Override
    public void processar(double valor){
        double taxa = 0.05; // 5% de taxa
        double total = valor + (valor * taxa);
        System.out.println("Pagamento com cartão de credito: R$ " + total);
    }
}
class Boleto extends Pagamento{
    @Override
    public void processar(double valor){
        double desconto = 0.1; // 10% de desconto
        double total = valor -(valor * desconto);
        System.out.println("Pagamento com boleto: R$ " + total);
    }
}
class Pix extends Pagamento{
    @Override
    public void processar(double valor){
        System.out.println("Pagamento com pix: R$ " + valor + "(sem taxas)");
    }
}