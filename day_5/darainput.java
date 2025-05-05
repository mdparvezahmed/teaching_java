import java.util.Scanner;


public class darainput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x,y;
        System.err.print("Enter x: ");
        x = scanner.nextInt();

        System.err.print("Enter y: ");
        y = scanner.nextInt();

        String larger = (x>y)? "x is larger" : "y is larger";

        System.out.println(larger);
    }
}
