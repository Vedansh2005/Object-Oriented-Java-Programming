class strg{
    public static void main(String[] args) {
        String str1 = " Hello World!";
        String str2 = "Java Programming";
        String str3 = "Welcome to, the world, of Java.";
        System.out.println("Original String 1: " + str1.toUpperCase());
        System.out.println("Original String 2: " + str2.toLowerCase());
        System.out.println("Using trim(): " + str3.trim()); //trim function is used to remove leading and trailing spaces in a string
        //string compare function
        System.out.println("String 1 equals String 2: " +str1.trim().equals(str2));
        String str4 = str1.trim();
        System.out.println("String 1 after trim: " + str4);
        str4.equalsIgnoreCase(str2);
        System.out.println("str4.compareTo(str2): " + str4.compareTo(str2));
        //split function -  tokenise strings
        String[]tokens = str3.split(",");
        for(String t : tokens) {
            System.out.println("Token: " + t);

        }
        //replace function
        String str5 = "banana apple banana";
        System.out.println(str5.replace("a", "@"));
        System.out.println(str5.replace("banana", "orange"));
        System.out.println(str5.replaceFirst("banana", "orange")); //replace first occurrence
        //concat function
        System.out.println("Concatenated String: " + str1.concat(" ").concat(str2));
        //copying a string to character array
        char ch1[] = new char[str1.length()];
        str1.getChars(0, str1.length(), ch1, 0);
        char ch2[] = new char[5];
        str1.getChars(1, 6, ch2, 0); //getChars function is used to copy a substring to character array
        System.out.println("Character array: "+ new String(ch2)); 
        System.out.println(ch2.length);
        for(int i=0; i<=ch2.length; i++) {
            System.out.print(ch1[i] + " ");
        }   
    }
}