public class Node {
    public String name;
    Node next;

    public Node(){

    }


    public Node (String name){
        this.name = name;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public Node getNext() {
        return next;
    }



    public void setNext(Node next) {
        this.next = next;
    }



    public void displayNodeInformation(){
        System.out.println("Person's Name: "+name);
    }
}
