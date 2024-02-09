import java.util.Scanner;

public class App {
git
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double SP = 67836.43;
        double RJ = 36678.66;
        double MG = 29229.88;
        double ES = 27165.48;
        double Outros = 19849.53;

        System.out.print("Digite o estado (SP, RJ, MG, ES ou Outros): ");
        String estado = teclado.nextLine().toUpperCase();

        double totalFaturamento = SP + RJ + MG + ES + Outros;

        switch (estado) {
            case "SP":
                System.out.printf("SP: %.2f%%\n", (SP / totalFaturamento) * 100);
                break;
            case "RJ":
                System.out.printf("RJ: %.2f%%\n", (RJ / totalFaturamento) * 100);
                break;
            case "MG":
                System.out.printf("MG: %.2f%%\n", (MG / totalFaturamento) * 100);
                break;
            case "ES":
                System.out.printf("ES: %.2f%%\n", (ES / totalFaturamento) * 100);
                break;
            case "OUTROS":
                System.out.printf("Outros: %.2f%%\n", (Outros / totalFaturamento) * 100);
                break;
            default:
                System.out.println("Estado inválido. Digite SP, RJ, MG, ES ou Outros.");
        }

        teclado.close();
    }
}