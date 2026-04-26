public class TestString {
    public static void main(String[] args) {
        String fullName="Nilesh";//heap portion--> String pool memory stored nilesh
        String address= new String("Bhilwara");
        System.out.println(fullName +" live in "+ address);

        String a= "Nilesh"; //same pool memory reference of a =reference of fullName 
        System.out.println(fullName==a); //reference equals

        String address1= new String("Bhilwara");
        System.out.println(address==address1);//heap memore reference ( address !=address1)
        String address2= "Bhilwara";
        System.out.println(address2==address1);//compares reference
        System.out.println(address2.equals(address1));// compares content value
    }
}
