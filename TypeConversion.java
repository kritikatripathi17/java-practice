import java.util.Scanner;
public class TypeConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        int num = input.nextInt();
//        System.out.println("num is: " + num);
//       type casting
        int num = (int)(17.987f);
        System.out.println("num is: " + num);
//        automatic type promotion  in expressions
//        int a  = 257;
//        byte b = (byte)a;
//        System.out.println("b is: " + b);
//        int a = 40;
//        int b = 50;
//        int c = 100;
//        int d = a*b/c;
//        System.out.println("d is: " + d);
//        int number = 'A';
//        System.out.println("こんにちは " + number);
        byte b = 86;
        char c = 'a';
        short s = 32;
        int i = 500;
        float f = 12.3f;
        double d = 12.346787;
        double result = (f*b) +(i/c)-(d-s) ;
        System.out.println((f*b)+"" +(i/c)+""+(d-s));
        System.out.println("result is: " + result);


    }
}
