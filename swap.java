public class swap {
   public static void main(String[] args) {
       int a = 25;
       int b = 35;
       swap(a,b);
       System.out.println(a+ " " + b);

    }
    static void swap(int a,int b){
       int temp;
        temp=a;
        a=b;
        b=temp;
        //this change will only be valid in function scope only
    }
}
