import java.util.Scanner;
public class evenandodd
{
    public static void main(String[] args) 
    {
         Scanner scanner = new Scanner(System.in);
                                  
        int n = scanner.nextInt();
       // int sum;
       System.out.println("odd number");
        for(int i=1;i<=n;i++)
            {
            if(i%2!=0)
             {
                System.out.println(i);
             }
            }
         System.out.println("even number");
         for(int j =1;j<=n;j++)
            {
                if(j%2==0)
                {
                    System.out.println(j);
                }
            }       
    }
 }              
              