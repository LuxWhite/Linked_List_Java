                                            Creating a Linked List in Java:

Head node holds the entire Linked List. each node has data and holds data adjacent to it.
each node ahs a data portion and a linked potion.

The last node of a linked List will point to "Null" signifying th end of the list.

Initially "head node" will point to null because the linked list is empty. The 1st step is to create a node that holds
some data and have that node point
to null, then have the "head" point to the node. (now head node) - any node that the head points to is "Head node".

2nd create a new node with data and have it point to null. Now have the Head node point to the second node
by having the Head node point to second node.
3rd create third node pointing to null. Have 2nd node now point to 3rd node.
4th create fourth node pointing to null.


                                    Printing Elements in a Linked List:
Create a temp node (name: current), initially this will point to a null value.

1st have current point to the "head".
2nd use a while loop to cycle through until the current node is = to null.

Algorithm:-
                current = head;
                while (current != null)
                {
                    S.O.P(current.data);
                    current = current.next;
                }


                                Inserting a node at the beginning of a linked list in Java:
1st creates a new node (newNode) containing "15" pointing to null.
2nd updates the "newNode" to point to the "head".
3rd updates the "head pointer" to point to the "newNode".
Therefore newNode will now become the new head of the linked list.

Algorithm:-

            ListNode newNode = new ListNode(15);
            newNode.next = head;
            head = newNode;

                                   Inserting a node at the end of a Linked List:

