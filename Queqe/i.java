//   fifo,lilo type data structure
 
//   front ----->for deletion
//   rear ------>for insertion

/*
 *   ADT ---> 1.enque ,2. Deque,3.peek(),
 * 
 */


 // impliment through ll 

import java.util.LinkedList;
import java.util.Queue;

public class i {
 
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // add 
       for(int i=0; i<10 ; i++){
         q.add(i);
       }
       System.out.println(q);
       
       // to remove the element from queue(De-queue)

      q.remove();

      System.out.println(q);

      // to get the front element

      System.out.println(q.peek());

      // to print current size of the queue

      System.out.println(q.size());
      

    }
 }