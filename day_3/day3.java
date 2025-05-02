public class day3 {
    public static void main(String[] agsdfk){
        // String nums="512";
        char num = '9';
        int xy = num-48;
        // System.out.println(xy);
        
        // double a = 27;
        // double b = 5;
        float a = 27f;
        float b = 5f;

        System.out.println((int)(a/b));
        
        int x = 5;
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);

        int n = 6;
        // n+=1; // n = n+1
        // n=-3;//n = (-3)

        // n=n+5;
        // n+=5;
        // n*=3; //n = n*3;
        // n=*3;
        // n %=2;
        // n&=2;

        n<<=2;
        System.out.println(n);



        int uv = 9;
        int ux = 10;

        boolean result = uv >ux;//true
        result = uv==ux;//false
        result = uv<ux;//true
        result = uv<=ux;//ture
        result = uv>=ux;//ture

        result = uv<ux || uv==ux;//ture 0|1 = 1

        result = uv<ux && uv==ux;//false 0&1 = 0

        result = !(uv==ux); //if 1 then 0; if 0 then 1;

        System.out.println(result);











    }
}
