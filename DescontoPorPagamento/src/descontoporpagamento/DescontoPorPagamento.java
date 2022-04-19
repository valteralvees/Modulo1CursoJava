package descontoporpagamento;
import java.util.Scanner;
    /*Uma loja fornece desconto de 10% para pagamento a vista e de 5% para outras formas de pagamento.

Escreva um programa para receber:
- Valor da compra
- Forma de pagamento (1 = a vista; 2 = outras formas)

Mostrar:
- Valor original da compra
- Valor do desconto
- Valor a pagar*/
public class DescontoPorPagamento {
    public static void main(String[] args) {
        System.out.println("Digite o valor da compra");
        Scanner teclado = new Scanner(System.in);
        int valorcompra = teclado.nextInt();
        System.out.println("Digite a forma de pagamento, sendo 1 para A VISTA e 2 para OUTROS");
        final int ESCOLHA = teclado.nextInt();
        if (ESCOLHA == 1){
            float descontoaVista = valorcompra/100 *10;
            float valorFinal = valorcompra - descontoaVista;
            System.out.println("VALOR ORIGINAL -----R$" + valorcompra);
            System.out.println("VALOR DO DESCONTO -----R$" + descontoaVista);
            System.out.println("VALOR FINAL -----R$" + valorFinal);
        } else if (ESCOLHA ==2 ){
            float descontoaVista = valorcompra/100 *5;
            float valorFinal = valorcompra - descontoaVista;
            System.out.println("VALOR ORIGINAL -----R$" + valorcompra);
            System.out.println("VALOR DO DESCONTO -----R$" + descontoaVista);
            System.out.println("VALOR FINAL -----R$" + valorFinal);
        }
        
    }
    
}
