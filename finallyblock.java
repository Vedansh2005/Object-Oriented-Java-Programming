class finallyblock{
    static void procA()
    {
        try{
            System.out.println("ProcA");
            throw new RuntimeException("Demo");
        }
        finally{System.out.println("Finally in procA");}
    }
    public static void main(String arg[])
    {
        try{
            procA();
        }
        catch(Exception e)
        {
            System.out.println("Exception caught ");
        }
       
    }
}