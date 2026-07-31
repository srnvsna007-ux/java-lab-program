import java.util.Scanner;
class students 
{
  public static void main(String[] args) 
  {
    Scanner s=new Scanner(System.in);

    System.out.println("Enter a name");
    String name= s.nextLine();

    System.out.println("Enter a rollno");
    int roll=s.nextInt();

    System.out.println("Enter a name :"+name);
    System.out.println("Enter a roll :"+roll);
    
  }
}