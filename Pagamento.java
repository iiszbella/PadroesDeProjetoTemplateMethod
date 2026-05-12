public abstract class Pagamento {

    // Template Method
    public final void processarPagamento() {
        validarDados();
        realizarTransacao();
        emitirRecibo();
    }

    protected abstract void validarDados();
    protected abstract void realizarTransacao();

    protected void emitirRecibo() {
        System.out.println("Recibo emitido com sucesso!");
    }
}
