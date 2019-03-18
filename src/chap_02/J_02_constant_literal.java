package chap_02;

import com.sun.nio.sctp.AbstractNotificationHandler;

public class J_02_constant_literal {
    public static void main(String[] args) {

        final int score = 100;
//        score = 200;
        boolean power = true;
        byte b = 127;

        int oct = 010; // 8진수, 10진수로 8
        int hex = 0x10; // 16진수, 10진수로 16
        System.out.println(oct);
        System.out.println(hex); // println method는 10진수로만 출력할 수있다.
        // 접두사와 접미사는 출력못한다 -> 이렇게 하기 위해서는 printf사용해야ㅕ 한다,

        long l = 10_000_000_000L;
        float f = 3.14f;
        double d = 3.14f;
        System.out.println(10.);
        System.out.println(.10);
        System.out.println(10f);
        System.out.println(1e3);

        char ch = 'A';
        int i = 'A';

        String str = "";
        String str2 = "ABCD";
        String str3 = "123";
        String str4 = str2 + str3;

        System.out.println(i); //문자 A의 문자코드인 65가 출력이 된다.
        System.out.println(str4);
        System.out.println(""+7+7); //문자형태로써 뒤에- 나오는 7과7이 서로 합쳐져서 나온다
        System.out.println(7+7+""); // 앞의 7과 7이 서로 더해지고 이후 문자열로 14가 출력이 된다.


    }

}
