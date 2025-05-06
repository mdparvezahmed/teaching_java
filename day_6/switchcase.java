import java.util.Scanner;

public class switchcase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        // System.out.println("Enter a number between 1 to 4: ");
        // number = scanner.nextInt();

        // switch (number) {
        //     case 1:
        //         System.out.println("One");
        //         break;
        //     case 2:
        //         System.out.println("two");
        //         break;
        //     case 3:
        //         System.out.println("three");
        //         break;
        //     case 4:
        //         System.out.println("four");
        //         break;
        //     default:
        //         System.out.println("wrong number");

        // }
        // String numname = "one";
        // System.out.println("Enter a number name: ");
        // numname = scanner.nextLine();


        // switch (numname) {
        //     case "one":
        //         System.out.println(1);
        //         break;

        //     case "two":
        //         System.out.println(2);
        //         break;

        //     case "three":
        //         System.out.println(3);
        //         break;

        //     case "4":
        //         System.out.println("four");
        //         break;

        //     default:
        //         System.out.println("wrong number");

        // }

        char x;
        x = scanner.next().charAt(0);

        switch (x) {
            case 'a':
                System.out.println("A for apple");
                break;
            case 'b':
                System.out.println("B for beef");
                break;
            case 'c':
                System.out.println("C for cloud");
                break;
            case 'd':
                System.out.println("D for dab");
                break;

        }
        double value;
        value = scanner.nextDouble();

        switch (value) {
            case 1.0:
                System.out.println("A for apple");
                break;
            case 1.1:
                System.out.println("B for beef");
                break;
            case 1.2:
                System.out.println("C for cloud");
                break;
            case 1.3:
                System.out.println("D for dab");
                break;
            default:
                System.out.println("default");

        }



        scanner.close();

    }
}