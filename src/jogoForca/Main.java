package jogoForca;

import java.util.Random;
import java.util.Scanner;

public class Main extends Palavras {
    public static void main(String[] args) {


        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String str = palavras[random.nextInt(palavras.length)];

        // Converte a palavra em um array de caracteres
        char[] caracteres = str.toCharArray();
        int vidas = 5;

        // Converte a palavra em '*'
        ConvertePalavra.converte(caracteres);

        System.out.println("Tente acertar qual a palavra");
        System.out.println("Você tem " + vidas + " vidas");

        while (vidas > 0) {
            System.out.println("Palavra: " + String.valueOf(caracteres));
            System.out.print("Digite uma letra: ");
            String letraString = scanner.nextLine();
            char letra = letraString.charAt(0);

            boolean acertou = false;
            for (int y = 0; y < str.length(); y++) {
                if (letra == str.charAt(y)) {
                    caracteres[y] = letra;
                    acertou = true;
                }
            }

            if (!acertou) {
                vidas--;
                System.out.println("Letra incorreta! Vidas restantes: " + vidas);
            }

            if (String.valueOf(caracteres).equals(str)) {
                System.out.println("Parabéns! Você acertou a palavra: " + str);
                break;
            }
        }

        if (vidas == 0) {
            System.out.println("Você perdeu! A palavra era: " + str);
        }
    }
}
