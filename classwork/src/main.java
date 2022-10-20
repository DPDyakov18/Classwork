import java.util.*;
class Ma{
    String languages;
    Ma(String lang){
        languages=lang;
        System.out.println(languages+" Programming language ");
    }
}

public class main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Ma m1=new Ma("Java");
        Ma m2=new Ma("Python");
        Ma m3=new Ma("C");
    }
}
