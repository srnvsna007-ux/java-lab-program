import java.util.ArrayList;
public class arraylist{
    public static void main(String[]args){
        ArrayList<Integer> n = new ArrayList<>();
        n.add(1);
        n.add(2);
        n.add(3);
        System.out.println(n);
        n.remove(1);
        System.out.println(n);
    }
}