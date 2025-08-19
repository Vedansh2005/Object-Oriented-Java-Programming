import java.io*;
class bufferreader
{
    public static void main(String[] args)
    {
        BufferReader br=new BufferReader(new InputStreamReader(System.in));
        System.out.println("Enter a number: ");
        String h=br.readLine();
        int k=Integer.parsenInt(h);
        System.out.println("square:"+(k*k));
    }
}