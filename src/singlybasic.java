package linkedlist.basic;

import linkedlist.basic.singlybasic.Node.linkedlist1;

class singlybasic {
    public static class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
    public static class linkedlist1{
        Node head=null;
        Node tail=null;

        void insertionAtEnd(int data){
        Node temp=new Node(data);
        if(head==null){
            head=temp;
        }
        else{
            tail.next=temp;
        }
        tail=temp;
    }
    void insertionAtfirst(int data){
        Node temp= new Node(data);
        if(head==null){
            head=tail=temp;
        }
        temp.next=head;
        head=temp;
    }
    /*void insertat(int idx,int data){
        Node t=new Node(data);
        Node temp=head;
        for(int i=0;i<idx;i++){
            temp=temp.next;
        }
        t.next=temp.next;
        temp.next=t;
    } */
    void deleteAtFirst(){
        if (head == null) { // Case: List is empty
            System.out.println("Linked list is empty");
        } else {
            head = head.next; // Move the head to the next node
            if (head == null) { // If the list becomes empty after deletion
                tail = null;    // Update the tail to null as well
            }
        }
    }
    void display(){
       Node temp=head;
       while(temp!=null){
        System.out.println(temp.data);
        temp=temp.next;
       }
    }
    int size(){
        Node temp=head;
        int count=0;
       while(temp!=null){
        temp=temp.next;
        count++;
       }
       return count;
    }
}
    public static void main(String[] args) {
        linkedlist1 ll =new linkedlist1();
        ll.insertionAtEnd(5);
        ll.insertionAtEnd(50);
        ll.insertionAtEnd(15);
        ll.insertionAtfirst(6);
        //ll.insertat(2,100);
        ll.deleteAtFirst();
        ll.display();
        System.out.println(ll.size());
    }
}
}
