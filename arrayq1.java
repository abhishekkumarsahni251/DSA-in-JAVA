public class arrayq1 {
    public static void main(String[] args) {

        int[] arr = {40, 10, 50, 20, 30};

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum = " + min);
    }
 
}
