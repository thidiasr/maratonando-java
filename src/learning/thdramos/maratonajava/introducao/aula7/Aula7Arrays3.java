package learning.thdramos.maratonajava.introducao.aula7;

public class Aula7Arrays3 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 = new int[]{5,4,3,2,1};

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = i+1;
        }

//       for (int i = 2; i < numeros.length; i++) {
//            System.out.println(numeros[i]);
//        }

//       for (int i = 0; i < numeros3.length; i++) {
//            System.out.println(numeros3[i]);
//        }

    for (int numero : numeros){
        System.out.println(numero);
    }

    }
}
