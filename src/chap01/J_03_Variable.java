package chap01;

public class J_03_Variable {
    public static void main(String[] args) {
        int x = 4, y = 2;
        int tmp;
        tmp = x;
        x = y;
        y = tmp;

        System.out.println("x+y");
        System.out.println(x+y);
        System.out.println(x*y);
        System.out.println(x/y);
    }
}

