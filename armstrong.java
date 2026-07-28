public class armstrong 
{
    public static void main(String[] args)
    {
     int n,arg,sum=0,r;
      
     n=153;
     arg=n;
     for(int i =0;i<n;i++)
     {
        while(n<0)
        {
            r=n%10;
            sum+=(r*r*r);
            n=n/10;
        }
     }
     if(arg==sum)
     {
        System.out.println("is a armstrong:"+arg);
     }
     else
     {
        System.out.println("is not a armstrong:"+arg);
     }
    }
}
