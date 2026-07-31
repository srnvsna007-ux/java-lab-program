import java.util.Scanner;
class employ
{
    String name;
    double salary;

    void get( Scanner sc)
    {
       System.out.println("Enter Employee name:");
       name = sc.nextLine();

       System.out.println("Enter a salary:");
       salary = sc.nextDouble();
    }
}
class bonus extends employ
{
    double bonus;
    void bonus( Scanner sc)
    {
        System.out.println("Enter a bonus amount :");
        bonus=sc.nextDouble();
    }
    void display()
    {
        System.out.println("\n--------------employee detail------n/");
        System.out.println("name"+name);
        System.out.println("salary"+salary);
        System.out.println("bonus"+bonus);
        System.out.println("total salary"+(salary+bonus));
    }
}

public class singleinhertance 
{
        public static void main(String[]args)
        {
            Scanner sc=new Scanner(System.in);

            //object creation
            bonus b=new bonus();
            b.get(sc);
            b.bonus(sc);
            b.display();

            sc.close();
        }
}
