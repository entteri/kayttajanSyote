import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String userNumber1;
        String userNumber2;
        int sum;   

        System.out.print("Kirjoita 1. numero: ");
        userNumber1 = scanner.nextLine();

        System.out.print("Kirjoita 2. numero: ");
        userNumber2 = scanner.nextLine();

        sum = Integer.valueOf(userNumber1) + Integer.valueOf(userNumber2);

        if (sum > 10) {
            System.out.println("Tulos on yli 10. Tulos on " + sum + ".");
        } else {
            System.out.println("Tulos on " + sum + ".");
        }
    }
}
