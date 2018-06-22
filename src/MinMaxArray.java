import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {
        System.out.println("Introduceti lungimea arrayului: ");
        Scanner scan = new Scanner(System.in);

        int[] arrayMinMax = new int[scan.nextInt()];
        System.out.println("Introduceti datele: ");
        for (int i = 0; i < arrayMinMax.length; i++) {
            arrayMinMax[i] = scan.nextInt();
        }

        double suma = 0;
        double media;

        for (int i = 0; i < arrayMinMax.length; i++) {
            suma += arrayMinMax[i];
        }

        System.out.println("Suma numerilor este egala cu: " + suma);

        media = suma / arrayMinMax.length;

        System.out.println("Media numerilor este egala cu: " + media);

        int max = arrayMinMax[0], min = arrayMinMax[0];

        for (int i = 0; i < arrayMinMax.length; i++) {
            if (arrayMinMax[i] > max) {
                max = arrayMinMax[i];
            }
            if (arrayMinMax[i] < min) {
                min = arrayMinMax[i];
            }
        }

        String minim = "", maxim = "";

        for (int j = 0; j < arrayMinMax.length; j++) {
            if (arrayMinMax[j] < media) {
                minim += " " + arrayMinMax[j];
            } else {
                maxim += " " + arrayMinMax[j];
            }
        }

        System.out.println("Numarul minim este: " + min);
        System.out.println("NUmarul maxim este: " + max);
        System.out.println("numerele mai mici ca media sunt:  " + minim);
        System.out.println("nemerele mai mari ca media sunt: " + maxim);
    }
}
