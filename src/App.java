import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String userNumber1;
        String userNumber2;
        double jako;

        System.out.print("Kirjoita ensimmäinen numero: ");
        userNumber1 = scanner.nextLine();

        System.out.print("Kirjoita toinen numero: ");
        userNumber2 = scanner.nextLine();

        jako = Double.valueOf(userNumber1) / Double.valueOf(userNumber2);
        System.out.println("Jakolaskun tulos on " + jako);
    }
}

