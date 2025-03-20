// 1. Write a program to print whether a number is even or odd, also take
// input from the user.

import java.util.Scanner;

// public class first {
//     public static void CheckNum(int num){
//         if(num%2==0){
//             System.out.println("Number is even");

//         }else{
//             System.out.println("Number is odd");
//         }
//     }
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter the number:");
//         int num = in.nextInt();
//         CheckNum(num);
//     }
// }

//7. To calculate Fibonacci Series up to n numbers.

public class first {
    public static void CheckPalindrome(String str){
        String rev = "";
        for(int i = str.length()-1;i>=0;i--){
            rev += str.charAt(i);
        }
        System.out.println(rev);
        if(str.equals(rev)){
            System.out.println("String is a palindrome");

        }else{
            System.out.println("String is not a palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String:");
        String str = in.nextLine();
        System.out.println(str);
        CheckPalindrome(str);
        in.close();
    }
}