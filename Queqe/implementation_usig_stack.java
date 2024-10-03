/*
 *    We have 2 stacks ----> change to queue
 *    all data  Stack 1 -----> stack2 
 *    Lets we have 4 entries --> 1,2,3,4 
 *    Stack1---> [1,2,3,4]====>Stack2 = [4,3,2,1]
 *     LIFO ,LIFO == FIFO
 *    Time complaxity
 *      1. enque --> o(1)  we have to put an element in stack 1. only
 *      2. Dequeqe --> o(N) we have to put all element into stack 2 and the pop
 *    
 */

import java.util.Stack;

public class implementation_usig_stack {
    static Stack<Integer> st1 =new Stack<>();
    static Stack<Integer> st2 = new Stack<>();

    static void enque(int data){
        st1.push(data);
    }

    static int  Deque(){
       int ele;
       if (st1.empty() &&st2.empty()){
        System.out.println("Queue is empty");
        System.exit(0);
        
       }
       // pusing element in st 2
       while (!st1.empty()) {
        st2.push(st1.pop());
       }
       ele = st2.pop();
       return ele;


    }
    public static void main(String[] args) {
       implementation_usig_stack obj = new implementation_usig_stack();
       obj.enque(3);
       obj.enque(4);
       obj.enque(1);
       obj.enque(6);
       System.out.println(st1);
       System.out.println(st2);
       System.out.println("top of st1:"+st1.peek());
       System.out.println(obj.Deque());
       

    }
}
