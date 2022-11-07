import java.util.*;//tail recursion
public class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n=sc.nextInt();
        demo(n);
    }
    public static int demo(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else
        {
            System.out.println(n);
        }
        demo(n-1);
        return 0;
    }
}