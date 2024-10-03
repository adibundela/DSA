import java.util.Scanner;

public class fibonaki {
    static long febo(long n){
        if (n<=1){
            return n;
        }
        return febo(n-2)+febo(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nth term:");
        long n= sc.nextInt();
        System.out.print(febo(n));
    }
}
