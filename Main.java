import java.util.Scanner;

public class Main {

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Add: " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Subtract: " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Multiply: " + result);
        return result;
    }

    static int divide(int a, int b) {
        int result = a / b;
        System.out.println("Divide: " + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Exponentiation: " + result);
        return result;
    }

    static int fac(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        System.out.println("Factorial: " + result);
        return result;
    }

    static int mod(int a, int b) {
        int result = a % b;
        System.out.println("Mode: " + result);
        return result;
    }

    static int area(int a, int b) {
        int result = a * b;
        System.out.println("Area of Rectangle: " + result);
        int result2 = 2*(a + b);
        System.out.println("Perimeter of Rectangle: " + result2);
        return result;
    }


    public static void main(String[] args) {
        Scanner mec = new Scanner(System.in);
        int select;

        String menu = "1- Add\n"
                + "2- Subtract\n"
                + "3- Multiply\n"
                + "4- Divide\n"
                + "5- Exponentiation\n"
                + "6- Factorial\n"
                + "7- Mode\n"
                + "8- Rectangular Area and Perimeter Calculation\n"
                + "0- Exit\n";

        while (true) {
            System.out.println(menu);
            System.out.print("Choose a Transaction: ");
            select = mec.nextInt();

            if (select == 0) {
                break;
            }

            System.out.print("Enter First Number: ");
            int a = mec.nextInt();
            System.out.print("Enter Second Number: ");
            int b = mec.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    divide(a, b);
                    break;
                case 5:
                    power(a, b);
                    break;
                case 6:
                    fac(a);
                    break;
                case 7:
                   mod(a, b);
                    break;
                case 8:
                    area(a, b);
                    break;
            }
        }
        System.out.println("Güle Güle!");

    }
}