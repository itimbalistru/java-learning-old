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

        int max = arrayMinMax[0], min = arrayMinMax[0];
        for (int i = 0; i < arrayMinMax.length; i++) {
            if (arrayMinMax[i] > max) {
                max = arrayMinMax[i];
            }
            if (arrayMinMax[i] < min) {
                min = arrayMinMax[i];
            }
        }
        System.out.println("Numarul minim este: " + min);
        System.out.println("NUmarul maxim este: " + max);
    }
}
