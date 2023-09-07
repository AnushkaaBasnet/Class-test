import java.util.Objects;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username = sc.next();
        System.out.println("Enter your password: ");
        String password = sc.next();
        if (Objects.equals(username, password)) {

            System.out.println("Choose a program");
            System.out.println("1=Calculator");
            System.out.println("2=GuessingGame");
            System.out.println("3=SI Calculator");
            System.out.println("4=Vowel or Calculator");
            int x = sc.nextInt();


            switch (x) {
                case 1 -> {
                    System.out.println("Calculator");
                    System.out.println("Enter a number");
                    System.out.println("Operations: '+', '-', '*', '/'");

                    System.out.print("Enter 1st number: ");
                    float num1 = sc.nextFloat();

                    System.out.print("Enter the operation: ");
                    char operation;
                    operation = sc.next().charAt(0);

                    System.out.print("Enter 2nd number: ");
                    float num2 = sc.nextFloat();

                    double result;


                    if (operation == '+') {
                        result = num1 + num2;
                        System.out.println("The result is " + result);
                    } else if (operation == '-') {
                        result = num1 - num2;
                        System.out.println("The result is " + result);
                    } else if (operation == '*') {
                        result = num1 * num2;
                        System.out.println("The result is " + result);
                    } else if (operation == '/') {
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.println("The result is " + result);
                        } else {
                            System.out.println("Cannot be divided by zero");

                        }
                    } else {
                        System.out.println("Invalid operation");
                    }

                }

                case 2 -> {
                    System.out.println("GuessingGame");
                    int a = 10;
                    sc = new Scanner(System.in);
                    System.out.println("Enter a number:");
                    int y = sc.nextInt();
                    if (a == y) {
                        System.out.println("Lucky");
                    } else {
                        System.out.println("Fail");
                    }
                }


                case 3 -> {

                    System.out.println("SI Calculator");
                    System.out.println("Enter principle:");
                    int P = sc.nextInt();
                    System.out.println("Enter Rate:");
                    double R = sc.nextDouble();
                    System.out.println("Enter Time:");
                    double T = sc.nextDouble();
                    double SI = (P * T * R) / 100;
                    System.out.println("The SI is :" + SI);

                }


                case 4 -> {
                    System.out.println("VorC");
                    System.out.println("Enter the letter");
                    char ch = sc.next().charAt(0);
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                        System.out.println("It is vowel");
                    } else {
                        System.out.println("It is Consonant");
                    }



                }
            }
        }
        else{
            System.out.println("Invalid Password or Username");
        }
    }
}

