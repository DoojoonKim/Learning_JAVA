package chap_02;

public class J_01_variable {
    public static void main(String[] args) {
        int x = 4, y = 2;
        int tmp;
        tmp = x;
        x = y;
        y = tmp;

        System.out.println("x+y"  );
        System.out.println(x+y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println("x="+x );
        System.out.println("y="+y);
    }
}
