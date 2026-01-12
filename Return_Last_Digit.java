import java.io.*;
import java.util.*;

class Return_Last_Digit
{


    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input1 = sc.nextInt();

        System.out.print("last digit in the number  " + " " + input1 +" "+ "is" + " " + input1%10);    }
}
