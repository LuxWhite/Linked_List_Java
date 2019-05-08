public class sList {
    private singyLinkedList listObj; // list object type "singly linked list".

    public sList(){
        listObj = new singyLinkedList();
    }

    public void addToFront(String info){
        listObj.insertAtFront(info);
    }

    public void displayList(){
        System.out.println("This is the list:");
        listObj.display();
    }


    public void addToBack(String info){
        listObj.insertAtBack(info);
    }


    public String removeFromFront(){
        return listObj.remove();
    }


    public void searchAndRemove(String name){
        listObj.removeWithValue(name);
    }


    public void searchNode2(String value){
        listObj.search2(value);
    }

    public void insertAtPostion(int index, String name){
        listObj.insertAtPosition(index,name);
    }

    public void removeFront(){
        listObj.removeFront();
    }

    public Node removeAtBack(){
        return listObj.removeFromBack();
    }

    public int numOfNames(){
        return listObj.count();
    }

    public void serachList(String searchValue){
        listObj.search(searchValue);
    }
}
