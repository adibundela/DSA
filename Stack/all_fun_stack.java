import java.util.Stack;

public class all_fun_stack {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
         
        // push element in stack
        st1.push(2);
        st1.push(3);
        st1.push(6);
        st1.push(78);
        st1.push(34);
        System.out.println(st1);
        // peak element 
        System.out.println("top most element:"+st1.peek());

        // pop

        st1.pop();
        System.out.println("top most element :"+st1.peek());

        // Search element 
        // Search function returns -1 when element is not present in stack


        System.out.println("Element is distance from top:"+st1.search(6));

        // empty()
        System.out.println(st1.empty());

        
    }
}
