package data_structures.linked_list;

public class LinkedListApplication {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        System.out.println("linked list is empty: " + linkedList.isEmpty());
        linkedList.addNode(3);
        linkedList.addNode(4);
        linkedList.addNode(5);
        linkedList.addNode(6);
        linkedList.printList();
        linkedList.insertNode(2,7);
        linkedList.insertNode(1,12);
        linkedList.printList();
        System.out.println("index of value (4): " + linkedList.findNode(4));
        System.out.println("Size of list: " + linkedList.size());
        linkedList.deleteNode(12);
        linkedList.printList();
        System.out.println("Size of list: " + linkedList.size());
        System.out.println("linked list is empty: " + linkedList.isEmpty());
        linkedList.clearList();
        linkedList.printList();
        System.out.println("Size of list: " + linkedList.size());
        System.out.println("linked list is empty: " + linkedList.isEmpty());


    }
}
