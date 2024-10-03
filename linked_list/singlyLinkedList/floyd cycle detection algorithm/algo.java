/*
 *    for dedection a cycle ---> floyds cycle detection algo
 *    basicly it is a two pointer approch 
 * 
 */
/*
 *    let Distance cover upto cycle start --->D
 *    looping part -----> k 
 *    
 *    slow pointer coverage ----> n= D+k+c(i)      , i---> i time rotate in loop
 *    fast pointer coverage ----> 2n=D+k+c(j)      . j---> j time rotate in loop
 *          by solving eq === n=c(j-i)
 *     
 *    find starting point of loop ->
 *                    2*eq(1)  => 2n= 2D+2k+c(2i)
 *                    by equate eq1,2
 *                      2D+2k+2c(i)= D+k+c(J)
 *                          D+k=c(j-2i)
 *                  let j-2i = m
 * 
 *                   ####   D = c(m)-k   ####
 * 
 * 
 * 
 */

public class algo {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public void dedectloop(Node head){
        Node slow = head;
        Node fast = head;
        int flag = 0;
        while (slow!=null&&fast!=null&&fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast) {
                flag=1;
                break;

            }
            
        }
        if (flag==1) {
            System.out.println("there are a cyle exist ");
        }
        else{
            System.out.println("There are no cyle exist in linked list ");
        }

    }

    public static void main(String[] args) {
        
    }
}
