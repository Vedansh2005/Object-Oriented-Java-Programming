//Autoboxing and Auto-unboxing in Java
public class autobox {
    public static void main(String[] args) {
        int a = 5; // Primitive type
        Integer intObj = a; // Autoboxing: int to Integer
        System.out.println(intObj);
        int k=intObj; // Auto-unboxing: Integer to int
        System.out.println(k);
    }
}
//these kind of behaviour is supported by 4 wrapper classes
//Autoboxing is the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes.
//Auto-unboxing is the reverse process where the object wrapper class is converted back to the primitive type.
//Autoboxing and auto-unboxing are used to convert between primitive types and their corresponding wrapper classes automatically, allowing developers to work with objects without needing to manually convert between types.


//var arguements
class X
{
    static int sum(int ...i)
    {
        int s=0;
        for(int k:i)
        {
            s+=k;
        }
        return s;
    }
    public static void main(String[] args) {
       System.out.println(Var_ArgsExample.sum(1,1,1,1,1)); // Output: 6
       System.out.println(Var_ArgsExample.sum(1,1,1));    // Output
    }
}
//End of unit 1 :)