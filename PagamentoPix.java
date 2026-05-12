public class PagamentoPix extends Pagamento {

    @Override
    protected void validarDados() {
        System.out.println("Validando chave Pix...");
    }

    @Override
    protected void realizarTransacao() {
        System.out.println("Realizando transação via Pix.");
    }
}
