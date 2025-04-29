package src;

public class Main {
    public static void main(String[] args) {

        int [] numeros = new int [5];

        numeros[3] = 15;
        System.out.println("Tamanho" + numeros.length);

        for(int index = 0; index < 5; index++){
            System.out.println(numeros[index]);
        }
    }
}
