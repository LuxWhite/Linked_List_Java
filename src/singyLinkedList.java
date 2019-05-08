import java.util.NoSuchElementException;

public class singyLinkedList {
    Node head; // start of list.
    int size, index;

    public singyLinkedList(){
        head =null;
    }


    public singyLinkedList (Node head){
        this.head = null;
    }

    public boolean listIsEmpty(){
        return head == null;
    }

    public int getSize() {
        return size;
    }


    //inserts at the Front of the Linked List.
    public void insertAtFront(String data){
       Node newNode = new Node (data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }



    public void searchNode(String value){
        if (listIsEmpty()){
            throw new NoSuchElementException();
        }
        Node tempNode = head;
        while (tempNode.next != null){
            if (tempNode.name.equalsIgnoreCase(value)){
                System.out.println("Name Found: "+tempNode.name);
            }
            tempNode = tempNode.next;
        }
    }

    public void search2 (String name) {
        if (listIsEmpty()) {
            throw new NoSuchElementException();
        }
        Node n = head;
        while (n.next != null) {
            findName(name);
            n = n.next;
        }
    }



    
    public void findName(String name){
        Node n = head;
        if (n.name.equals(name)){
            System.out.println("Found: "+n.name);
        }else {
            System.out.println("Not found");
        }
    }



    //inserts at the back of the Linked List.
    public void insertAtBack(String data){
        Node newNode = new Node (data);
        if (listIsEmpty()){
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }



    //displays the Linked list.
    public void display(){
        Node current = head;
        while (current != null){
            current.displayNodeInformation();
            current = current.getNext();
        }
        System.out.println(" ");
    }



    //inserts at a given position of the Singly Linked List.
    public void insertAtPosition(int position,String name){
        Node newNode = new Node(name);
        if (position == 0){ //this would indicate the beginning of the list
            insertAtFront(name);
        }
        Node current = head;
        for (int i=0; i<position-1; i++){
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }



    //Removes from Front.
   public String remove(){
        Node current = head;
        if (!listIsEmpty()){
            head = head.next;
        }
        return current.name;
   }



    public void removeFront(){
        if (listIsEmpty()){
            return;
        }
        head = head.next;
}



public Node removeFromBack(){
        if (listIsEmpty()){
            return null;
        }
        Node n = head;
        while (n.next.next != null){
            n = n.next;
        }
        n.next =null;
        return n;
}



//Count nodes in the list.
    public int count(){
        Node n = head;
        int count = 1;
        while (n.next != null){
            count ++;
            n = n.next;
        }
        return count;
    }



    //Searches the List for value entered.
    public void search(String value){
        if (listIsEmpty()){
            return;
        }
        Node n = head;
        while (n != null){

            if (n.name.equals(value)){
                System.out.println("Found: "+value);
            }
            n = n.next;
        }
    }




    //searches for the indicated value and removes it from the list.
    public void removeWithValue(String name){
        if (listIsEmpty()) return;

            if (head.name.equals(name)){
                head = head.next;
                return;
            }
        Node current = head;
        while (current.next != null){
            if (current.next.name.equals(name)){
                current = current.next.next;
                return;
            }
            current = current.next;
        }
    }
}
