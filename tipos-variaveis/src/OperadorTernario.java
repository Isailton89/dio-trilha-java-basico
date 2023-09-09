public class OperadorTernario {
    public static void main(String[] args) {
        // classe Operadores.java
        int a, b;
        a = 6;
        b = 6;

        // EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        String resultado = "";
        if(a==b)
        resultado = "verdadeiro";
        else
        resultado = "falso";
        System.out.println("Exemplo com a estrutura IF e ELSE: " + resultado);

        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String valor = (a==b) ? "verdadeiro" : "falso";
        System.out.println("Exemplo com a estrutura booleana: " + valor);
    }
}
