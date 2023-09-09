public class OperadoresRelacionais {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        boolean simOuNao = numero1 == numero2;

        if(numero1 < numero2){
            System.out.println("A nossa condição é verdadeira!");
        }

        if(numero1 == numero2){
            System.out.println("A nossa condição é verdadeira!");
        }

        System.out.println("numero1 é igual a numero2? " + simOuNao);

        simOuNao = numero1 != numero2;
        System.out.println("numero1 é diferente a numero2? " + simOuNao);

        simOuNao = numero1 > numero2;
        System.out.println("numero1 é maior que numero2? " + simOuNao);
    }
}
