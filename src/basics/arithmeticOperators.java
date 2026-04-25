 class arithmeticOperators {
    public static void main(String[] args) {

        // arithmetic operators--> '+''-''*''/''%'
        int mySalary=1000;
        int bonus=500;
        int totalSalary= mySalary+bonus;
        System.out.println(totalSalary);
        int deduction=500;
        int newTotalSalary= mySalary-deduction;
        System.out.println(newTotalSalary);
        int yearSalary=totalSalary*12;
        System.out.println(yearSalary);
        int monthlySalary= yearSalary/12;
        System.out.println(monthlySalary);
        int remainder = bonus%12;
        System.out.println(remainder);
        System.out.println(Integer.MAX_VALUE);

        int a =2147483647;
        int b= a*2233;
        System.out.println(b);
        long l=2147483647*2233;
        double r= Math.pow(2,32);
        double result = l%r;
        System.out.println(result);

        int num1 =438347634;
        long long1=num1*24223;
        System.out.println(long1);

        // precedence operator '+' '-'have same precedence and '*' '/' have same
        // if same precedence occurs in expresion then always move left to right

        int num2= 10;
        int num3= 20;
        int newNumAfterOperation= num2 + num3 * num2 /num3 - num3;
        System.out.println(newNumAfterOperation);

        // compound assignment operator
        int num4= 15;
        num4= num4+15;
        System.out.println(num4);
        num4+=15;
        System.out.println(num4);
        num4*=10;
        System.out.println(num4);
        num4/=10;
        System.out.println(num4);

        byte byteValue=10;
        //byteValue=byteValue+10;--> error because java consider 10 as integer
        byteValue=(byte)(byteValue+10);//explicit casting
        byteValue+=10; // compound operator performs implicit casting internally (by compiler)
        System.out.println(byteValue);

        // pre and post increment and decrement operator
        int num6= 10;
        num6++;
        System.out.println(num6);
        ++num6;
        System.out.println(num6);
        num6--;
        System.out.println(num6);
        --num6;
        System.out.println(num6);

        int num7= num6++ + 2;
        System.out.println(num7);
        num7= ++num6 + 2;
        System.out.println(num7);

        int num8 = 1;
        int num9= num8 + ++num8;// num8 + (++num8)
        System.out.println(num9);

        double x=1.5, y=2.5, z=3.5;
        double complexCal= (x+y) * (z-y) / (x+z);
        System.out.println(complexCal);

        int c=10;
        ++c;
        System.out.println(c);
        c++;
        System.out.println(c);
        --c;
        System.out.println(c);
        c--;
        System.out.println(c);

    }
    
}
