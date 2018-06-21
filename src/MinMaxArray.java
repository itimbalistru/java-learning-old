public class MinMaxArray {
    public static void main(String[] args) {

        int[] arrayMinMax = {10, 9, 6, 5, 2};
        int max = arrayMinMax[0], min = arrayMinMax[0];
        for (int i = 0; i < arrayMinMax.length; i++) {
            if (arrayMinMax[i] > max) {
                max = arrayMinMax[i];
            }
            if (arrayMinMax[i] < min) {
                min = arrayMinMax[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
