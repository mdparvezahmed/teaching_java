import java.util.Scanner;

public class basci {
    public static void main(String[] args) {
        //update: someting ar jaigi anything print korbo.
        System.out.println("something");
        // System.out.println("hsdkjf");
        /* 
         this cod eis for testing purpose
         just printing something
         */
        //print multiplication of 5 and 6
        // System.out.println(5*6);

        // int a = 5;
        // System.out.println(a);

        int a = 6;
        float b = 5.6f;
        float x = a+b;
        double y = a+x;


        int age = 5, date = 7, monthe = 8, year = 2022;
        
        age = 100;

        System.out.println(y);
        System.out.println("Age:"+age+"\ndate:"+date+"\nmonth: "+monthe);

        final int num = 6;//constant variable
        // num = 7;


        //calculating area of circle
        final float pi = 3.1416f;

        // pi = 10.5f;
        float radius = 2.0f;
        float area = pi * radius * radius;

        System.out.println(pi);
        System.out.println("area:"+area);

        Scanner scanner = new Scanner(System.in);

        // int subject;
        // double result;
        // subject = scanner.nextInt();
        // result = scanner.nextDouble();
        // System.out.println(subject*result);

        byte pp = 5;
        short xx = 4;
        int ads = 0;
        long gg = 3434912834712934L;
        double dd = 452345.24d;


        double asdhfoasfk = 10E4;
        System.out.println(asdhfoasfk);

        boolean isRajibCute = false;

        System.out.println(isRajibCute);

        char letter = 'R';
        // char let = "R";  //shows error
        System.out.println("single_:"+letter);
        String firstName = "Rajib";
        String lastName = "mia";
        System.out.println(firstName+' '+lastName);

        


        scanner.close();







}
}