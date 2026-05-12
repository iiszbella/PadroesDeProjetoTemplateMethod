Atividade da disciplina de Padrões de Projeto – Template Method
O projeto desenvolvido aplica o padrão Template Method em um cenário de processamento de pagamentos, simulando diferentes formas de transação como cartão de crédito e Pix.
A ideia central é demonstrar como o Template Method define a estrutura de um algoritmo em uma classe abstrata, permitindo que subclasses concretas implementem etapas específicas sem alterar o fluxo geral do processo.

No modelo proposto, a classe Pagamento funciona como a base abstrata, estabelecendo o método processarPagamento() que organiza as etapas principais: validação dos dados, realização da transação e emissão do recibo.
As subclasses PagamentoCartao e PagamentoPix implementam os detalhes de cada etapa, como a validação de informações do cartão ou da chave Pix, enquanto o método de emissão de recibo permanece padronizado para todas as formas de pagamento.

Escolhi o cenário de pagamentos porque ele reflete bem a lógica do Template Method: o processo segue sempre a mesma sequência de passos, mas cada forma de pagamento possui particularidades próprias que precisam ser tratadas de maneira independente. 
Isso torna o uso do Template Method ideal para organizar fluxos repetitivos, reduzir duplicação de código e garantir que o sistema seja flexível e fácil de manter.

Diagrama UML - https://drive.google.com/file/d/1JxCDANvylkdI_AyY_Kx-La_IS_Z0HjfY/view?usp=sharing
