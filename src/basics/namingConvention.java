class Variables {
    public static void main(String[] args) {
        //Variables naming convention rules in JAVA
        //1. Case sensitive --> use Camel Case ( snake case in python)
        //2. can be letters, digits, numbers, dollar signs or underscores
        //3. must begin with letters, underscore, or dollar sign
        //4. cannot use java keywords or reserved key words

        String fullName= "Nilesh Rathore";
        int _age= 21;
        int $Salary= 5000000;
        String company= "Google";
        String role= "Senior Software Developer";
        String location= "Seattle";

        System.out.println("Your name is : "+ fullName+ " and age is: "+ _age+ ". You worked at: "+ company +" as role of : " + role+ " in :"+ location);
    }
    
}
