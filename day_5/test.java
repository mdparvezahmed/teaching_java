import java.util.Scanner;


public class Data{
    public static void main(String[]args){
        Scanner scanner = new Scanner (System.in);
        int a,b,c;
        System.out.print("Enter a: ");
        a=scanner.nextInt();

        System.out.print("Enter b:");
        b=scanner.nextInt();System.out.print("Enter c:");
        
        c=scanner.nextInt();
        
         if(a>b){
             System.out.println("larget is A big value="+a);
         }
        //String larger=(b>c)? "c is larger": "c is larger";

       else if(b>c){
        System.out.println("largetis B big value="+b);
       }
       else{
             System.out.println("largest is C big value="+c);
         }
       
    }

}