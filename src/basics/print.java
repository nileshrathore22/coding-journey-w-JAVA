import java.util.Locale;
class print {
    public static void main(String[] args){
        int a=1;
        int b=2;
        String s= "Sum";
        //println--> print in the console and give new line to the next instructions
        System.out.println(a);
        System.out.println(b);
        System.out.println();
        System.out.println(s);
        //print--> print continuosuly without giving new line
        System.out.print(a);
        System.out.print(b);
        System.out.print(s+ "\n");
        System.out.println();

        System.out.println(a + b);
        System.out.println(a + b + s);
        System.out.println(s + a + b);

        //printf--> locale, format specifier
        int i=5;
        float f= 1.2f;
        String s1= "Hello World!";
        System.out.printf("%d , %.2f : %f -->%s\n",i,f,i+f,s1);
        System.out.printf("Sum of %d and %d is: %d\n",a,b,a+b);

        double number= 1234567.89;
        System.out.printf("Default locale: %,.2f%n", number);
        System.out.printf(Locale.US,"US locale: %,.2f%n", number);

    }
    
}
