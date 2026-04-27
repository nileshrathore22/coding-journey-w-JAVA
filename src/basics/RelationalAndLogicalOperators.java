class RelationalAndLogicalOperators {
    public static void main(String[] args) {
        // Relational --> compares two values and return a boolean result

        int a=1;
        int b=2;
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(a!=b);

        char ch1= 'a';
        char ch2= 'b';
        System.out.println('a'+0);
        System.out.println('b'+0);
        System.out.println(ch1<=ch2);
        
        String str1="Nilesh";
        String str2="Nilesh";
        String str3= new String("Nilesh");
        System.out.println(str1==str2);
        System.out.println(str1==str3);

        //Logical Operators
        //Logical AND &&
        //Logical OR ||
        //Logical NOT !

        //Checking pass or not --> Marks>=33 age<18
        int ramMarks=35;
        int ramAge=28;
        System.out.println(ramMarks>=33 && ramAge<=18);

        //Checking eligible for job or not--> tier1 or exp 5+years
        int exp= 2;
        boolean tier1= true;
        boolean expMatch= exp>=5;
        System.out.println(tier1 || expMatch);
        System.out.println(tier1 && expMatch);

        //LOGICAL NOT --> revert bool value
        System.out.println(!(a==b));


    }
    
}
