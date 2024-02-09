import java.util.Scanner;

public class App5{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String minhaString = teclado.nextLine();
        String stringInvertida = inverterString(minhaString);
        System.out.println("Palavra invertida: " + stringInvertida);
    }
    public static String inverterString(String str) {
        StringBuilder resultado = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            resultado.append(str.charAt(i));
        }
        return resultado.toString();
    }
}