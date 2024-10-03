public class LengthOFll {
    public static class Node  {
        int data;
        Node next;
        Node (int data){
            this.data=data;
            next=null;
        }
    }
    public int getLength(Node head){
        int count=0;
        while (head!=null) {
            count++;
            head=head.next;
        }
        return count;
    }
    public static void main(String[] args) {
        
    }
}
