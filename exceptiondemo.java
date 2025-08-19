class myexception extends Exception{
    private int detail;
    myexception(int a){detail=a;}
    public String toString() {return "myexception["+detail+"]";}
}
class exceptiondemo
{
    static void compute(int a) throw myexception
    {
        System.out.println("Called compute("+a+")");
        if(a>10)
        throw new myexception(a);
        System.out.println("Normal exit");
    }
    public static void main(String args[])
    {
        try
        {
            compute(1); compute(20);
        }
        catch(myexception e) {System.out.println("Caught"+e);}
    }
}