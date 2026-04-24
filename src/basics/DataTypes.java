
class DataTypes{
    public static void main(String[] args){
        System.out.println("Start the roadmap of Java!");
        //integral numbers

            //byte
            byte age=126;
            System.out.println(Byte.MIN_VALUE);
            System.out.println(Byte.MAX_VALUE);
            //short
            short age1=32767;
            System.out.println(Short.MIN_VALUE);
            System.out.println(Short.MAX_VALUE);
            //int
            int age2=32768;
            System.out.println(Integer.MIN_VALUE);
            System.out.println(Integer.MAX_VALUE);
            //long
            long age3=59847594753l;
            System.out.println(Long.MIN_VALUE);
            System.out.println(Long.MAX_VALUE);

        //decimal numbers
        float mySalary=1000.3454378465634f;// precsion=7
        double yourSalary=1000.9847597457475458739485;// precision=15
        System.out.println(mySalary);
        System.out.println(yourSalary);

        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        //characters

        char initial =102;
        System.out.println(initial);
        System.out.println((int)Character.MIN_VALUE);
        System.out.println((int)Character.MAX_VALUE);
        for(char ch=0; ch<128; ch++){
            System.out.println("Ascii value: " + (int) ch + " --> Character: " + ch);
        }

        //widening conversion //implicit conversion // automatic conversion
        byte byteValue=10;// 1 byte=8 bits
        short shortValue=byteValue;// 2byte 
        int intValue= shortValue;// 4 bytes // widening coversion from short to int 
        long longValue= intValue;// 8 bytes
        float floatValue= longValue;// 4 bytes
        double doubleValue= floatValue;// 8 bytes

        System.out.println("byteValue" + byteValue);
        System.out.println("shortValue" + shortValue);
        System.out.println("intValue"+ intValue);
        System.out.println("longvalue"+ longValue);
        System.out.println("floatValue"+ floatValue);
        System.out.println("doubleValue"+ doubleValue);

        // narrowing converison // explicit conversion

        double doubleValue1= 5408.59495794875453474550948;
        float floatvalue1= (float)doubleValue1;

        System.out.println(doubleValue1);
        System.out.println(floatvalue1);

        int int1=123;
        char char1= (char)int1;
        long max= Long.MAX_VALUE;
        int max1= (int)max;
        System.out.println(int1);
        System.out.println(char1);
        System.out.println(max);
        System.out.println(max1);
        System.out.println(Integer.toBinaryString(-1));

    
    }
}