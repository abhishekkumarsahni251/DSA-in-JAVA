
    import java.util.Scanner;


public class arrayscanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Your numbers are:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        sc.close();
    } 
}

