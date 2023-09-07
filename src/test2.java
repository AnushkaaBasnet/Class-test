
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Username:");
        String username = sc.next();
        System.out.println("Enter your password: ");
        String password = sc.next();
        int o ;
        if (Objects.equals(username, password)) {

            System.out.println("Enter a Number");
            System.out.println("1.Calculator");
            System.out.println("2.Guessing Game");
            System.out.println("3. SI Calculator");
            System.out.println("4. Vowel or Consonant");
            o = sc.nextInt();
            if (o == 1) {

                System.out.println("Calculator");
                System.out.println("Available Operators: '+' '-' '/' '*'");
                System.out.print("Enter 1st number: ");
                float num1 = sc.nextFloat();
                System.out.print("Enter the operation: ");
                char operation = sc.next().charAt(0);
                System.out.print("Enter 2nd number: ");
                float num2 = sc.nextFloat();
                double result;
                switch (operation) {
                    case '+':
                        result = num1 + num2;
                        System.out.println("The result is " + result);
                        break;
                    case '-':
                        result = num1 - num2;
                        System.out.println("The result is " + result);
                        break;
                    case '*':
                        result = num1 * num2;
                        System.out.println("The result is " + result);
                        break;
                    case '/':
                        result = (int) num1 / num2;
                        System.out.println("The result is" + result);
                    default:
                        System.out.println("Invalid operation was entered" + "\nRerun the program");
                }

            } else if (o == 2) {
                System.out.println(" The Guessing Game");
                System.out.println("Enter a number:");
                float d = sc.nextFloat();
                Random random = new Random();
                int rk = random.nextInt(10);
                if (d == rk) {
                    System.out.println("Congratulations! You're guess is right");

                } else {
                    System.out.println("Better luck next time");
                }
            } else if (o == 3) {
                System.out.println("The SI Calculator");
                System.out.println("Enter the principle:");
                float P = sc.nextFloat();
                System.out.println("Enter the Rate:");
                double R = sc.nextDouble();
                System.out.println("Enter Time:");
                double T = sc.nextDouble();
                double SI = (P * T * R) / 100;
                System.out.println("The SI is :" + SI);

            } else if ( o==4) {
                System.out.println("Enter a letter");
                var ch = sc.next().charAt(0);
                if ( ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'||ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
                    System.out.println("It is vowel");
                } else {
                    System.out.println("It is Consonant");
                }

            }
        } else {
            System.out.println("Invalid");
        }
    }
}


