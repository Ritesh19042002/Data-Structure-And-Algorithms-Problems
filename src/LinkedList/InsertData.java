package LinkedList;


public class InsertData {
    private ListNode head;

    public static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public ListNode deleteFirst() {
        if (head == null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public void display(){
        ListNode current =head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current=current.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public void insert(int position, int value){
        ListNode node = new ListNode(value);
        if (position == 1){
            node.next = head;
            head = node;
        }else{
            ListNode previous = head;
            int count = 1;
            while (count < position-1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            node.next =current;
            previous.next = node;
        }

    }

    public static void main(String[] args) {
        InsertData ind = new InsertData();
        ind.head = new ListNode(8);
        ListNode second = new ListNode(10);
        ListNode third = new ListNode(1);

        // pointing address
        ind.head.next = second;
        second.next = third;

        System.out.println("Default Data");
        ind.display();
        System.out.println("----------------------------------------------------------------");

        ind.insert(2,7);
        System.out.println("Inserted Data");
        ind.display();
        System.out.println("----------------------------------------------------------------");

        System.out.println("Deleted first Node");
        ind.deleteFirst();
        ind.display();
    }
}
