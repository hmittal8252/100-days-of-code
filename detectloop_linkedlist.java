class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
class LinkedList{
    Node head;
    public void push(int newdata){
        Node newnode=new Node(newdata);
        newnode.next=head;
        head=newnode;
        
    }
    public boolean loopdetect(){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
    public static void main(String[]args){
        LinkedList llist=new LinkedList();
        llist.push(1);
        llist.push(2);
        llist.push(3);
        llist.push(4);
        llist.push(5);
        llist.head.next.next.next=llist.head;
       System.out.print(llist.loopdetect());
    }
}
