public class Linked_List {
   // private ListNode head;  //Head node for list.
    private static class ListNode
    {
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String args[])
    //Creating linked list.
    // 12--> 4--> 23--> 10.
    //12 is the Head of the linked list.
    {
        ListNode head = new ListNode(12);
        ListNode secondNode = new ListNode(4);
        ListNode thirdNode = new ListNode(23);
        ListNode fourthNode = new ListNode(10);

        //Attaching the Nodes, now a "Linked List".
        head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;

        Linked_List LinkedList = new Linked_List();
        LinkedList.display(head);

        System.out.println();

        ListNode newHead = new Linked_List().insertBeginning(head,30);
        LinkedList.display(newHead);
    }
    //Methods.
    public void display(ListNode head){
        if (head==null){ // checks if the Linked List is empty.
            return;
        }
        ListNode current = head;

        while(current!=null){
            System.out.print(current.data + " points to-> ");
            current = current.next;
        }
        System.out.print(current);
    }

    //inserts new node at beginning of linked list.
    public ListNode insertBeginning(ListNode head, int data){
        ListNode newNode = new ListNode(data);
        if (head == null){
            return newNode;
        }
        newNode.next = head;
        head = newNode;
        return head; // new head with new node data at the beginning of the linked list.
    }
}
