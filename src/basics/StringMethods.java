class StringMethods {
    public static void main(String[] args) {
        //String is immutable--> can't be change 
        //Every String method returns new String
        //length() method--> return length of String
        //object method--> object.method()
        //class method or static method-->class.method;
        String name="Nilesh Rathore";
        int length=name.length();
        System.out.println(length);

        //charAt()--> return character at index
        char ch= name.charAt(5);
        System.out.println(ch);

        //equals()--> compare content value
        String fullName="Nilesh Rathore";
        System.out.println(fullName==name);//reference
        System.out.println(fullName.equals(name));//content value

        //equalsToIgnoreCase--> check content value with ignoring case
        String unstructuredName= "nIlesh RatHoRe";
        System.out.println(fullName.equals(unstructuredName));
        System.out.println(fullName.equalsIgnoreCase(unstructuredName)); //check and compare content value
         
        //compareTo()--> compare ascii value 
        String str1="remote";
        String str2="ramote";
        System.out.println('e' + 0);
        System.out.println('a' + 0);
        int asciiDiffer=str2.compareTo(str1);//compare content ascii value
        System.out.println(asciiDiffer);   
        String str3= "RemOTe";
        System.out.println(str1.compareToIgnoreCase(str3)); 

        //substring()-> return sub string of the main string
        String subString=name.substring(4);
        System.out.println(subString);
        String subString2=name.substring(4,8);//goes till endindex-1
        System.out.println(subString2);
        System.out.println(name.substring(2,name.length()));

        //upper case & lower case
        String upperName= name.toUpperCase();
        System.out.println("Upper Case: " + upperName);
        String lowerName= name.toLowerCase();
        System.out.println("Lower Case: " + lowerName);

        //trim()--> removes extra space before and after of the string
        String extraSpaceString= "    Nilesh Rathore    ";
        System.out.println("Extra space String: " + extraSpaceString);
        String trimString= extraSpaceString.trim();
        System.out.println("Trim String: "+ trimString);

        // replace()--> Replace char or string with new char or string
        String beforeMarriage= "Pragya Gandhi";
        System.out.println("Before Marriage: "+  beforeMarriage);
        String afterMarriage= beforeMarriage.replace("Gandhi", "Rathore");
        System.out.println("After Marriage: "+ afterMarriage);

        //contains()--> check string or char parameter contains in string or not . Returns boolean
        System.out.println(beforeMarriage.contains("Prag"));
        System.out.println(afterMarriage.contains("Rath"));
        System.out.println(beforeMarriage.contains("R"));

        //startsWith()--> check strings start with this or not
        //endsWith()--> check strings ends with this or not
        System.out.println(beforeMarriage.startsWith("Pragya"));
        System.out.println(beforeMarriage.startsWith("P"));
        System.out.println(afterMarriage.endsWith("ore"));

        //isEmpty()--> check string is empty or not excludes spaces
        //isBlank()--> check string is blank or not includes spaces
        String emptyWithoutSpaces="";
        String blankWithSpaces="   ";
        System.out.println(emptyWithoutSpaces.isEmpty());
        //System.out.println(emptyWithoutSpaces.isBlank());
        System.out.println(blankWithSpaces.isEmpty());
        //System.out.println(blankWithSpaces.isBlank());
        
        //indexOf--> returns the  index of the char 
        System.out.println(fullName);
        int index= fullName.indexOf('i');
        System.out.println(index);
        System.out.println(fullName.lastIndexOf('e'));
        System.out.println(fullName.indexOf("Rath"));
        System.out.println(fullName.indexOf('e',5));
        //class method
        //int to string
        int a= 234;
        String intToString= String.valueOf(a);
        System.out.println(intToString);
        
        //formatmethod
        String name1="John Banega Don";
        int age1= 21;
        String formattedString=String.format("My name is %s and age is %d.", name1, age1);
        System.out.println(formattedString);

        //subSequence--> return the string in sequence order
        // Nlh is the subsequence of Nilesh Rathore
        System.out.println(fullName);
        String subString1= fullName.subSequence(2,8);
        System.out.println(subString1);



    }
}
