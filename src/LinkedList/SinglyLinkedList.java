package LinkedList;

public class SinglyLinkedList {
    private ListNode head;
    private static class ListNode{
        private int data; //Generic type
        private ListNode next;

        public ListNode (int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data+" ---> ");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public int length(){
        if (head == null){
            return 0;
        }
        ListNode current = head;
        int count = 0;
        while(current != head){
            count++;
            current = current.next;
        }
        return count;
    }
    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertEnd(int value){
        ListNode newNode = new ListNode(value);
        if (head == null){
            head = newNode;
            return;
        }
        ListNode current =head;
        while(null != current.next){
            current = current.next;
        }
        current.next = newNode;
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        //now we connect them together to form chain

        sll.head.next = second; //10--->1
        second.next = third;// 10--->1--->8
        third.next = fourth;// 10--->1--->8--->11--->null
        System.out.println("Inserted data in Linked List");
        sll.display();
        System.out.println("length of the Linked List");
        System.out.println("length is = "+sll.length());
        System.out.println("Inserted data in begining of the linked list");
        sll.insertFirst(11);
        sll.insertFirst(8);
        sll.insertFirst(1);
        sll.display();
        System.out.println("Insert node in the end of the Linked List");
        sll.insertEnd(11);
        sll.insertEnd(8);
        sll.insertEnd(1);
        sll.display();
    }
}
