class strg2{
    public static void main(String[] args)
    {
        String str1="Double";
        String str2="Trouble";
        String pattern = "rouble";
        System.out.println("Capital string 1: "+str1.toUpperCase());
        System.out.println("Capital string 2: "+str2.toUpperCase());
        System.out.println("Concatenated String: " + str1.concat(" ").concat(str2));
        System.out.println(str1.replace("o", "#"));
        System.out.println(str2.replace("o", "#"));
        System.out.println(str2.substring(1,7));
        System.out.println(str2);
        System.out.println(str1.charAt(0));

    }
}