class Addition extends Thread
{
    public void run()
    {
        int a=10,b=20;
        System.out.println("Addition of two numbers is: "+(a+b));
    }
}


class Subtraction extends Thread
{
    public void run()
    {
        int a=20,b=10;
        System.out.println("Subtraction of two numbers is: "+(a-b));
    }
}

class Multiplication extends Thread
{
    public void run()
    {
        int a=10,b=20;
        System.out.println("Multiplication of two numbers is: "+(a*b));
    }
}

class Division extends Thread
{
    public void run()
    {
        int a=20,b=10;
        System.out.println("Division of two numbers is: "+(a/b));
    }
}

public class Arithmerticoperationinthread {
    public static void main(String[] args) {
        Addition add = new Addition();
        Subtraction sub = new Subtraction();
        Multiplication mul = new Multiplication();
        Division div = new Division();
        add.start();
        sub.start();
        mul.start();
        div.start();
    }
}
