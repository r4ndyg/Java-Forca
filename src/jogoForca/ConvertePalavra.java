package jogoForca;

public class ConvertePalavra {

    public static char[] converte(char[] array) {

        if (array == null) {
            return null; // Ou pode lançar uma exceção
        }

        // Itera sobre o array e substitui todos os caracteres por '*'
        for (int y = 0; y < array.length; y++) {
            array[y] = '*';
        }
        return array;
    }

}
