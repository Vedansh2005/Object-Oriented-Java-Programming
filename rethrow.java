class rethrow{
    static void demopro()
    {
        try {
            throw new NullPointerException("demo");
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught inside demopro.");
            throw e; //rethrow the exception
        }
    }
    public static void main(String arg[])
    {
        try{
            demopro();
        }
        catch(NullPointerException e)
        {
            System.out.println("Recaught: " +e);
            System.out.println(e.getMessage());
        }
    }
}