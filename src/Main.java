public class Main {
    public static void main (String[]args){
        sList myList = new sList();
        myList.addToFront("Rojay");
        myList.addToFront("Pam");
        myList.addToFront("Samantha");
        System.out.println("Number of persons in list: "+myList.numOfNames());
        myList.displayList();


        myList.addToBack("Bob");
        myList.displayList();

        System.out.println("removing: "+myList.removeFromFront());
        System.out.println("Number of persons in list: "+myList.numOfNames());
        myList.displayList();


       /* myList.searchAndRemove("Bob");
        myList.displayList();              there is a problem with search & Remove method.
        */

        myList.insertAtPostion(2,"Shantel");
        myList.displayList();

        myList.removeFront();
        myList.displayList();

        myList.addToFront("Roy");
        myList.addToBack("Kim");
        myList.searchNode2("Kim");
        System.out.println("Number of persons in list: "+myList.numOfNames());
        myList.displayList();

        myList.removeAtBack();
        myList.displayList();

        System.out.println("Number of persons in list: "+myList.numOfNames());

        myList.serachList("Rojay");
    }
}
