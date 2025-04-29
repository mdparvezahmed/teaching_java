import java.util.Scanner;

class test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int x = n+m;

        System.out.println("sum of two numbers is: " + x);

        scanner.close();
    }
}