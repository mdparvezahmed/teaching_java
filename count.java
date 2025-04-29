public class count{

    static int summation(int a, int b){
        return a+b;
    }
    public static void main(String[] args) throws InterruptedException {
        int i = 3;
        while (i !=0) {
            System.out.println(i);
            Thread.sleep(1000);
            i--;
        }
        System.out.println("Surprize............");
        System.out.println("what is something that you can do in 1 second?");
        int a = 12;
        int b = 5;
        System.out.println("the Sum Is: " + summation(a,b));
        

    }
}