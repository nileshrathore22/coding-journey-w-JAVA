class TestStudent {
    public static void main(String[] args){
        Student student= new Student();//reference varibale--> student stores the address the new object
        student.name="Nilesh";
        student.age=21;
        student.domain="Backend";
        student.company="Google";
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.domain);
        System.out.println(student.company);

    }
    
}
