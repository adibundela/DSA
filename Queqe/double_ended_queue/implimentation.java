
//   no lifo or fifo
//  insertion,deletion at both end
//  collection<---Queue<---Deque<---ArrayDeque
//             /--  Stack lifo
//      Deqaue
//             \--   Queue fifo

// functions
//      1.Throws exeptation  2. return null value
//      1.a addFirst()       2.a offer-first()
//      1.a addlast()        2.b offer-last()
//      1.c removelast()     2.c polllast()
//      1.d removefirst()    2.d pollfirst()
//      1.e getfirst()       2.e peekfist()
//      1.f getlast()        2.f peeklast()

import java.util.*;
import java.util.Deque;

public class implimentation {
   public static void main(String[] args) {
    Deque<Integer> deque = new ArrayDeque<>();
    deque.addFirst(5);
    deque.addFirst(7);
    deque.addFirst(8);
    deque.addFirst(4);
    System.out.println("deque out put lool like"+deque);
    deque.removeLast();
    System.out.println("after deletation:"+deque);


   }
    
}
