public class Stringhandlingdemo
{
    public static void main (String[] args)
    {
        String msg = "java core program";
        System.out.println(msg.trim());
        System.out.println(new StringBuilder(msg).reverse());
        System.out.println(msg.toUpperCase());
        System.out.println(msg.toLowerCase());
    }
}
