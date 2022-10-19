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
    public int mid(){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow.data;
    }
    public static void main(String[]args){
        LinkedList llist=new LinkedList();
        llist.push(1);
        llist.push(2);
        llist.push(3);
        llist.push(4);
        llist.push(5);
        System.out.println("Middle is"+llist.mid());
    }
}
