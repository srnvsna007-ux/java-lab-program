class students 
{
    int id;
    String name;
 
    // parameterconstuctor
    students(int i,String n)
    {
    this.id=i;
    this.name=n;
    }
    //overloading constuctor
     students(students a)
     {
        id=a.id;
        name=a.name;
     }
    void display()
    {
    System.out.println(id+";"+name);
    }
}
public class overloading
{
    public static void main(String[]args)
    {
        students s =new students(012, "Sankar");
        students s1 =new students(s);
        s.display();
        s1.display();
    }
}
