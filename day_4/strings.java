public class strings {
    public static void main(String[] args) {
        String name = "sam iul";
        char space = ' ';
        System.out.println((int)space); //print the ascii value of space

        System.out.println("the length of the name is: "+name.length());
       


        //given string text convert it all into upper case;
        String names = "hasan Sam willson tasim";
        
        System.out.println(names.toUpperCase());

        //fined the index of w in the names
        String x = "sAm";

        x = x.toUpperCase();

        names = names.toUpperCase();
        System.out.println(names.indexOf(x));
        System.out.println(names.indexOf(x)+1);


        int foundinIndex = names.indexOf(x);
        System.out.println(foundinIndex);



        //concatenation
        String a = "50";
        String b = "40";
        String sum = a+b; //5040


        String firstName = "saif";
        String lastName = "hassan";
        sum = firstName+" "+lastName;

        System.out.println("fllname= "+sum);

        System.out.println(firstName.concat(lastName));

        String fullName = firstName.concat(lastName);

        System.out.println(fullName);

        fullName = String.join(" ", firstName, lastName, "hus");
        System.out.println(fullName);


        a = "30";
        b = "20";

        int num = 10;

        // int summation = num+a;//shows error
        String summation = num+a; //1030
        System.out.println(summation);

        System.out.println("He is my friend"); //He's my friend
        System.out.println("He\'s my \"friend\"");
        System.out.println("He is my\nfriend"); //new line
        System.out.println("He\tis\tmy\tfriend"); //tab print
        System.out.println("He is my friend\\brother"); // output only \

        System.out.println("He is my\b friend"); //delete one char before \b;
        













    }

}