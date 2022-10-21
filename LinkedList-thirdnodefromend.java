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
    public int thirdnodefromend(){
        Node forward=head;
        Node back=head;
        for(int i=1;i<=3;i++){
        forward=forward.next;
    }
    while(forward.next!=null){
        forward=forward.next;
        back=back.next;
    }
    return back.data;
    }
    public static void main(String[]args){
        LinkedList llist=new LinkedList();
        llist.push(1);
        llist.push(2);
        llist.push(3);
        llist.push(4);
        llist.push(5);
        llist.push(6);
       System.out.print(llist.thirdnodefromend());
    }
}
