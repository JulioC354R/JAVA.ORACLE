## Tarefas 
Crie um programa Java que modele as propriedades, os comportamentos e as interações de objetos do fliperama. Você também precisará de uma classe de teste que contenha um método principal. Use o método principal para modelar ações que orientarão o programa, como instanciar objetos e passar o cartão na máquina. Todos os campos devem ser private. Forneça o método getter e quaisquer métodos setter que sejam necessários.

Cartões
A tarja magnética nos cartões de jogos oferece um espaço de armazenamento limitado e nenhuma capacidade de computação. Os cartões armazenam informações sobre o saldo atual do cartão de crédito, o saldo de tíquetes e o número do cartão. Nenhum desses saldos pode ser negativo. Os cartões individuais não conseguem fazer cálculos, nem somas simples, nem perceber que os saldos estão ficando negativos.

Cada cartão é criado com um número de identificação inteiro exclusivo. Embora cada cartão não consiga fazer uma soma simples, ainda assim é possível fazer cálculos com propriedades que pertençam a todos os cartões.
 



Jogos
Os jogos precisam de um número específico de créditos para poderem ser jogados. Cada jogo está equipado com um leitor de cartão magnético e um monitor de LCD. Quando o cartão é passado na máquina, isso reduz o saldo de créditos, mas dá um número aleatório e não negativo de tíquetes. Imprima o número do cartão e o número de tíquetes ganhos, junto com o novo total. Imprima uma mensagem se um cartão tiver créditos insuficientes para jogar um jogo. 

Na verdade, o "Jogo dos Tíquetes Aleatórios!" é um jogo terrível. Você pode criar um jogo mais complexo, mas isso não é necessário para essa atribuição. 

Categorias de Prêmios
Cada categoria de prêmio tem um nome, um número de tíquetes obrigatórios para ganhar esse prêmio e uma contagem de quantos itens dessa categoria permanecem em um terminal. Os prêmios não sabem nada sobre o terminal a que eles pertencem.

Terminais
Cada terminal contém um leitor de cartão magnético. Um terminal aceita dinheiro, que é convertido em créditos em um cartão. O dinheiro é aceito como números inteiros. Os créditos são concedidos em uma proporção de dois créditos a cada um dólar. Os jogadores usam um terminal para verificar os saldos de seus cartões. Inclua o número do cartão nessa impressão. Todos os créditos, ou apenas uma parte deles, podem ser transferidos entre cartões. Sempre imprima os saldos de um cartão quando seus créditos ou tíquetes forem acessados por meio de um terminal. Por último, os tíquetes podem ser trocados nos terminais por prêmios. Imprima uma mensagem de erro se o cartão não tiver tíquetes suficientes ou o terminal estiver sem um tipo específico de prêmio. Imprima quando um prêmio for concedido e o número restante desse prêmio aparecer no terminal.  Um terminal oferece três categorias de prêmios. 


Método Principal
Instancie dois cartões e quaisquer outros objetos que sejam necessários para testar seu programa. 
•	Carregue os créditos em cada cartão.
•	Jogue um grupo de jogos usando dois cartões.
•	Transfira o saldo de créditos e tíquetes do Cartão 1 para o 2.
•	Solicite prêmios usando o Cartão 2.
•	Tente jogar um jogo e solicitar um prêmio usando o Cartão 1.
•	Execute quaisquer outras ações que sejam necessárias para testar seu programa.
