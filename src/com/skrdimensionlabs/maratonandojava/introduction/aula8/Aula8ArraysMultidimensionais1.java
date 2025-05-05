package com.skrdimensionlabs.maratonandojava.introduction.aula8;

public class Aula8ArraysMultidimensionais1 {
    public static void main(String[] args) {
        int [][] dias = new int [3][3];

        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 18;

        dias[1][0] = 8;
        dias[1][1] = 22;
        dias[1][2] = 11;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[0].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("|--------------------------|");

        for (int[] arrBase : dias){
            for(int num : arrBase){
                System.out.println(num);
            }
        }

    }
}
