public class checkarmstong 
{
 public static void main(String[] args) 
 {
  int a=10;
  int sum=0;
  int n,r;
  
  for( n=1;n<=a;n++)
  {
    while(n>0)
    {
        r=n%10;
        sum+=(r*r*r);
        n=n/10;
    }
    if(sum==n)
    {
        System.out.println("is a armstrong"+n);
    }
    sum=0;
  }
 }   
}
