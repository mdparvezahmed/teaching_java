public class conditionsalexp {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        int c = 10;
        // for 2 number check;
        // if (a>b) {
        // System.out.println("A is larger");
        // }
        // else{
        // System.out.println("B is larger");
        // }

        // for 3 number:
        if (a > b && a > c) {
            System.out.println("A larger");
        } else if (b > a && b > c) {
            System.out.println("B larger");
        } else {
            System.out.println("C Larger");
        }

        // ternary operator in java
        int x = 50, y = 10;
        int maximum = (x > y) ? x : y;
        System.out.println(maximum);

        String largerVariable = (x > y) ? "X is larger" : "Y is larger";
        System.out.println(largerVariable);

        // even-odd number:
        int num = 10;

        // if (num%2 == 0){
        // System.out.println("Even");

        // }else{
        // System.out.println("odd");
        // }
        if ((num & 1) == 0) {
            System.out.println("Even");

        } else {
            System.out.println("odd");
        }

    }
}
