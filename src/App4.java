import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o número de dias do mês: ");
        int numDias = input.nextInt();

        double[] faturamentoDiario = new double[numDias];
        double somaFaturamento = 0;

        for (int i = 0; i < numDias; i++) {
            System.out.print("Digite o faturamento do dia " + (i + 1) + ": ");
            faturamentoDiario[i] = input.nextDouble();
            somaFaturamento += faturamentoDiario[i];
        }
        double mediaMensal = somaFaturamento / numDias;
        double maiorValor = faturamentoDiario[0];
        double menorValor = faturamentoDiario[0];
        int diasAcimaMedia = 0;

        for (double valor : faturamentoDiario) {
            if (valor > maiorValor) {
                maiorValor = valor;
            }
            if (valor < menorValor) {
                menorValor = valor;
            }
            if (valor > mediaMensal) {
                diasAcimaMedia++;
            }
        }

        System.out.println("Menor valor de faturamento: R$" + menorValor);
        System.out.println("Maior valor de faturamento: R$" + maiorValor);
        System.out.println("Dias acima da média mensal: " + diasAcimaMedia);
    }
}

