import java.util.Scanner;

public class armstrong_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = isarmstrong(n);
        System.out.println(ans);
    }
    static boolean isarmstrong(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum+=rem*rem*rem;
            n=n/10;
        }
        if(sum==original){
            return true;

        }
        return false;
    }
}
