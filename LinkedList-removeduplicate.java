class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
class LinkedList{
  static  Node head;
    public static void push(int newdata){
        Node newnode=new Node(newdata);
        newnode.next=head;
        head=newnode;
       }
   
    public static void main(String[]args){
        LinkedList llist=new LinkedList();
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(3);
        llist.push(1);
        Node ans=removedup(head);
        while(ans!=null){
            System.out.println(ans.data);
            ans=ans.next;
        }
    }
    public static Node removedup(Node head){
        
       Node curr=head;
       while(curr.next!=null){
           if(curr.data==curr.next.data){
               curr.next=curr.next.next;
           }
           else{
               curr=curr.next;
           }
       }
        return head;
    } 
}
