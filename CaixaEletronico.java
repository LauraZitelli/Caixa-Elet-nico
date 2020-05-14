/* 
    Descrição do Programa: Caixa eletrônico das Ilhas Weblands, com estoque ilimitado 
    de cédulas de R$50,00 , R$10,00 , R$5,00 , R$1,00 .
*/
public class CaixaEletronico {
  //Número de cédulas de R$50,00
  static int n50 = 0;

  //Número de cédulas de R$10,00
  static int n10 = 0;

  //Número de cédulas de R$5,00
  static int n5 = 0;

  //Número de cédulas de R$1,00
  static int n1 = 0;

  /*
      Descrição do Método:

      Determina a quantidade de cada nota necessária para totalizar
      um determinado valor de retirada, de modo a minimizar a quantidade
      de cédulas entregues.

      Abastece as variáveis globais n50, n10, n5 e n1 com seu respectivo
      número de cédulas.

      Parâmetro: valor - valor a ser retirado
  */

  static void fazRetirada(int valor){ 
    
    if(valor > 0){ // Caso o valor seja positivo, faz-se a divisão das cédulas. 
      if(valor % 50 == 0){// Se o valor for divisível por 50, n50 receberá o valor da divisão da variável valor por 50 
        n50 = valor/50;
        // O novo valor total passa a ser o valor original menos a quantidade que já foi alocada em n50. Por isso fazemos (n50 * 50)
        valor = valor - (n50 * 50);
      }else{// Se o valor não for divisível por 50, a divisão terá um resto 
        n50 = valor/50;// n50 recebe o resultado da divisão 
        valor = valor % 50;// valor recebe o resto da divisão, pois é o que falta para ser distribuído pelas demais cédulas 
      }
      if(valor % 10 == 0){
        n10 = valor/10;
        valor = valor - (n10 * 10);// A lógica se repete para todas as cédulas restantes 
      }else{
        n10 = valor/10;
        valor = valor % 10;
      }
      if(valor % 5 == 0){
        n5 = valor/5;
        valor = valor - (n5 * 5);
      }else{
        n5 = valor/5;
        valor = valor % 5;
      }
      n1 = valor;

    }else if(valor == 0){
      n50 = n10 = n5 = n1 = 0;//Caso o valor seja 0, as variáveis são abastecidas com 0.
    }else{
      n50 = n10 = n5 = n1 = -1;//Caso o valor seja negativo, as variáveis são abastecidas com -1.
    }
  }
}