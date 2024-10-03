        
        // Time comp ---> o(n)

import java.util.Scanner;
import java.util.Stack;

public class valid_brackets 
{
    public static Boolean isvalid(String str)
    {
        char[] charrs = str.toCharArray();
        Stack<Character> stack1 = new Stack<>();
        for(char ele: charrs)
        {

            // if the element contain open bracket 

            if(ele=='['||ele=='{'||ele =='(')
            {
                stack1.push(ele);
                continue;
            }
            else if(stack1.empty())
            {
                return false;

            }
            else
            {
                 char top = stack1.pop();
                 if(top=='('&& ele !=')'){
                    return false ;
                 }
                 else if (top=='{' && ele!='}'){
                    return false;
                 }
                 else if(top=='['&& ele !=']'){
                    return false;
                 }


            }

         }
         return stack1.isEmpty();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");

        String str = sc.nextLine();

        System.out.println("Is givin string is valid ?---->9" + isvalid(str));


    }
}
