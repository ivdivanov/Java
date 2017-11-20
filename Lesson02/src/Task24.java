import java.util.Scanner;

public class Task24 {

    public static void main(String[] args) {
        System.out.println("enter a number between 10 and 30000");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int n = num;
        //reversing number
        int rev=0,rmd;
        while(num > 0)
        {
            rmd = num % 10;
            rev = rev * 10 + rmd;
            num = num / 10;
        }
        if(rev == n)
            System.out.println(n+" is a Palindrome Number!");
        else
            System.out.println(n+" is not a Palindrome Number!");
    }
}
