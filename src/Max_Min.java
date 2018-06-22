import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); /*creez un obiect scan numit scanner*/
        System.out.println("Introduceti numarul 1: ");
        int a = scan.nextInt(); /*citesc de la tastatura in variabila ao valoare intreaga*/
        System.out.println("Introduceti numarul 2 : ");
        int b = scan.nextInt(); /*citesc de la tastatura in variabila b o valoare de tip double*/
        int max, min;
        if (a > b) {
            max = a;
            min = b;
        }  else {
            max = b;
            min = a;
        }

        System.out.println("Numarul maxim este: " + max);
        System.out.println("Numarul minim este: " + min );


    }
}
