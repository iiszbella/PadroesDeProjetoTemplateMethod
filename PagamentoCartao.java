public class PagamentoCartao extends Pagamento {

    @Override
    protected void validarDados() {
        System.out.println("Validando número do cartão e CVV...");
    }

    @Override
    protected void realizarTransacao() {
        System.out.println("Realizando transação via cartão de crédito.");
    }
}

