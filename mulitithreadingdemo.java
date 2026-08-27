class Fivetable extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }
    }
}
class Threetable extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("3 x " + i + " = " + (3 * i));
        }
    }
}
class Twotable extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("2 x " + i + " = " + (2 * i));
        }
    }
}
public class mulitithreadingdemo {
    public static void main(String[] args) {
        Fivetable t1 = new Fivetable();
        Threetable t2 = new Threetable();
        Twotable t3 = new Twotable();
        t1.start();
        t2.start();
        t3.start();
    }
}