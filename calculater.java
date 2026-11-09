public class calculater {
    public static void main(String[] args) {

        int a = 20;
        int b = 10;
        int choice = 1;

        switch (choice) {
            case 1:
                System.out.println("Addition = " + (a + b));
                break;

            case 2:
                System.out.println("Subtraction = " + (a - b));
                break;

            case 3:
                System.out.println("Multiplication = " + (a * b));
                break;

            case 4:
                System.out.println("Division = " + (a / b));
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}
