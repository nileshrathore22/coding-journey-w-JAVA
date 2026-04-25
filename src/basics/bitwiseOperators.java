class bitwiseOperators {
    public static void main(String[] args) {
        // operands--> byte short int long 
        //and operator &-->(*)
        int num1= 5;
        System.out.println(Integer.toBinaryString(num1));
        int num2=6;
        System.out.println(Integer.toBinaryString(num2));
        int resultAnd= num1 & num2;
        System.out.println(Integer.toBinaryString(resultAnd));
        System.out.println("And Operator: "+resultAnd);
        
        //or operator |--> (+)
        int resultOr=num1 | num2;
        System.out.println(Integer.toBinaryString(resultOr));
        System.out.println("Or Operator: "+resultOr);

        //xor operator ^
        int resultXor= num1 ^ num2;
        System.out.println(Integer.toBinaryString(resultXor));
        System.out.println("Xor operator: "+ resultXor);

        //not operator ~--> 0->1 , 1->0
        int resultNot=  ~ num2;
        System.out.println(Integer.toBinaryString(resultNot));
        System.out.println("Not operator or num2: "+ resultNot);
        int resultNot2= ~ num1;
        System.out.println(Integer.toBinaryString(resultNot2));
        System.out.println("Not operator of num1: "+ resultNot2);

        //right shift
        int resultRightShift= num1 >> 2;
        System.out.println(Integer.toBinaryString(resultRightShift));
        System.out.println(resultRightShift);

        int num3= -5;
        System.out.println(Integer.toBinaryString(num3));
        int resultRightShift1= num3 >> 2;
        System.out.println(Integer.toBinaryString(resultRightShift1));
        System.out.println(resultRightShift1);

        //left shift
        int resultLeftShift= num1 <<2;
        System.out.println(resultLeftShift);
        System.out.println(Integer.toBinaryString(resultLeftShift));

        //unsigned right shift
        int resultUnsignedRightShift= num1 >>> 2;
        System.out.println(Integer.toBinaryString(resultUnsignedRightShift));
        System.out.println(resultUnsignedRightShift);

        int num4= -5;
        System.out.println(Integer.toBinaryString(num4));
        int resultUnsignedRightShift1= num4 >>> 2;
        System.out.println(Integer.toBinaryString(resultUnsignedRightShift1));
        System.out.println(resultUnsignedRightShift1);
    }
    
}
