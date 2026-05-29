import java.util.Scanner;
public class switch_case {
    public static void main(String[]args){
        Scanner in =new Scanner(System.in);
        String fruit = in.next();
        switch (fruit) {
            case "banana" -> System.out.println("has potassium");
            case "apple" -> System.out.println("keeps doctors away");
            case "orange" -> System.out.println("has vitamin c");
            default -> System.out.println("enter valid fruit");
        }
    }
}
