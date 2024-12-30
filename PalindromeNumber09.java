//Vishal Bhaliya
//30-12-2024


import java.util.Scanner;

public class PalindromeNumber09 
{
    public static boolean isPalindrome(int x) 
    {
        int revers = 0;
        int temp = x;
        if(x < 0)
        {
            return false;
        }
        while(x != 0)
        {
            revers = (revers * 10) + (x % 10);
            x /= 10;
        }
        return revers == temp;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Number: ");
        int x = sc.nextInt();
        if(isPalindrome(x))
        {
            System.out.println(x + " is a Palindrome Number");
        }
        else
        {
            System.out.println(x + " is a not Palindrome Number");
        }
        
    }
    
}
