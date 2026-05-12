import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PagamentoTest {

    @Test
    public void testPagamentoCartao() {
        Pagamento cartao = new PagamentoCartao();
        System.out.println("\n--- Teste Pagamento com Cartão ---");
        cartao.processarPagamento();

        
        assertTrue(cartao instanceof PagamentoCartao);
    }

    @Test
    public void testPagamentoPix() {
        Pagamento pix = new PagamentoPix();
        System.out.println("\n--- Teste Pagamento com Pix ---");
        pix.processarPagamento();

        assertTrue(pix instanceof PagamentoPix);
    }

    @Test
    public void testTemplateMethodFluxo() {
        Pagamento cartao = new PagamentoCartao();
        Pagamento pix = new PagamentoPix();

        System.out.println("\n--- Teste Fluxo Template Method ---");
        cartao.processarPagamento();
        pix.processarPagamento();


        assertTrue(cartao instanceof Pagamento);
        assertTrue(pix instanceof Pagamento);
    }
}

