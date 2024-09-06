import java.util.*;

public class HappyNumber {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {

            slow = square(slow);
            fast = square(square(fast));
        } while (slow != fast);
        return slow == 1; 
    }
    public int square(int num) {
        int ans = 0;
        while(num > 0) {
            int remainder = num % 10;
            ans += remainder * remainder;
            num /= 10;
        }
        return ans;
    }
    public static void main(String[] args) {
        HappyNumber hn = new HappyNumber();
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check whether the number is happy or not :");
        int n = sc.nextInt();
        boolean x = hn.isHappy(n);
        if( x ){
            System.out.println("The number is a happy number");
        }
        else{
            System.out.println("It is not a happy number");
        }
    }
}
