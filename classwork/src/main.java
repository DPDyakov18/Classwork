import java.util.*;

abstract class Fruits{
    abstract void taste();
}

class Apple extends Fruits {
    @Override
    void taste(){
        System.out.println("Sweet taste");
    }
}

public class main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Apple a = new Apple();
        a.taste();
    }
}