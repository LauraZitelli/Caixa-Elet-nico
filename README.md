# Caixa-Eletronico
Exercício de Programação da aula de Introdução à Programação.

Enunciado:

1 Caixa Eletrônico
  Os caixas eletrôicos das Ilhas Weblands operam com todos os tipos de notas disponíveis, mantendo um estoque de cédulas para cada valor (B$ 50,00, B$10,00, B$5,00 e B$1,00). Os clientes do banco utilizam os caixas eletrônicos para efetuar retiradas de um certo número inteiro de Bits.
  Sua tarefa é escrever um método que, dado o valor de Bits desejado pelo cliente (passado por parâmetro), determine o número de cada uma das notas necessário para totalizar esse valor, de modo a minimizar a quantidade de cédulas entregues. Por exemplo, se o cliente deseja retirar B$50,00, basta entregar uma única nota de cinquenta Bits. Se o cliente deseja retirar B$72,00, é necessário entregar uma nota de B$50,00, duas de B$10,00 e duas de B$1,00.
  Seu método deve necessariamente ter a seguinte assinatura:
  static void fazRetirada(int valor)
  Para esse exercício, não é necessário controlar o estoque de notas. Ou seja, você pode supor que o caixa sempre tem notas suficientes para efetuar o pagamento ótimo.
  
1.1 Entrada
  A entrada é composta pelo parâmetro do método, que recebe um número inteiro positivo valor (≥ 0), indicando o valor solicitado pelo cliente.
  
1.2 Saída
  Como saída, seu método deve abastecer quatro variáveis inteiras globais, n50, n10, n5 e n1 indicando, respectivamente, o número de cédulas de B$50,00, de B$10,00, de B$5,00 e de B$1,00. Por exemplo, se a retirada for de B$25,00, n50 conterá zero, n10 conterá 2, n5 conterá 1 e n1 conterá zero.
  Para que você teste o funcionamento do método fazRetirada(), pode fazer o método main() escrever na tela o valor e a quantidade de notas dispensadas, como ilustrado abaixo.
           
  25
  n50 n10 n5 n1
   0   2  1  0
   
  Em caso de erro (ou seja, de valor < 0), cada uma das variáveis n50, n10, n5 e n1 deve
  ser abastecida com -1, como ilustrado abaixo:
  
  -25
  n50 n10 n5 n1
  -1  -1  -1 -1
