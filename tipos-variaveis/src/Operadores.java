public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        int numero = 5;
        String texto = "Resultado abreviado: ";

        //converte o número em negativo
        numero = - numero;
        System.out.println(numero);

        //converte o número em positivo
        numero = numero * -1;
        System.out.println(numero);

        //Incrementar +1
        // numero = numero +1;
        // System.out.println(numero);

        //Forma abreviada de Incrementar
        numero++;
        System.out.println(texto+numero);

        //Decrementar -1
        numero--;
        System.out.println(texto+numero);

        //Variável booleana
        boolean variavel = true;
        System.out.println(variavel);

        //Invertendo a variável booleana TRUE para FALSE
        variavel = !variavel;
        System.out.println(variavel);

    }
}
