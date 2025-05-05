public class doingmath {
    public static double mid(double a, double b){

        return (a+b)/2.0;

    }
    public static void main(String[] args) {

        
        int a = 5;
        int b = 10;
        int c = 10;

        double x,y;

        x = Math.max(a,b);

        x =Math.min(a, b);

        x = Math.sqrt(c);

        x = -7;
        x = Math.abs(x);
        // x = (a+b)/2;
        x = mid(a, b);
        System.out.println(x);


        double randomNum = (Math.random());
        System.out.println(randomNum);
        int random0to10 = (int)(randomNum*6);

        System.out.println(random0to10);



    }
}
