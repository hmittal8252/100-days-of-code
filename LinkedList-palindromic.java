class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
class LinkedList{
    static Node head;
    public static void push(int newdata)
    {
        Node newnode=new Node(newdata);
        newnode.next=head;
        head=newnode;
    }
  
    public static void main(String[]args){
        LinkedList llist=new LinkedList();
        llist.push(1);
        llist.push(2);
        llist.push(3);
        llist.push(3);
        llist.push(2);
        llist.push(1);
      Node mid=middle(head);
      
      Node ans=  reverselist(mid);
      System.out.println(llist.ispalindrome(ans,head));
      
    }
   
    public static Node middle(Node head){
     Node fast=head;
        Node slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
     public static Node reverselist(Node mid)
    {
       
        Node prev=null;
        Node curr=mid;
        Node next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;

    }
     public static boolean ispalindrome(Node ans,Node head){
        Node t1=head;
        Node t2=ans;
        while(t2!=null){
            if(t1.data!=t2.data){
                return false;
            }
                t1=t1.next;
                t2=t2.next;
     }
        return true;
    }
}
