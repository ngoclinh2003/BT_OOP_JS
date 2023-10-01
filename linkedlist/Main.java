package linkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addFirst(10);
        doublyLinkedList.display();
        doublyLinkedList.addFirst(20);
        doublyLinkedList.display();
        doublyLinkedList.addLast(30);
        doublyLinkedList.display();
        doublyLinkedList.addLast(40);
        doublyLinkedList.display();
        doublyLinkedList.addAtPosition(50,0);
        doublyLinkedList.display();
        doublyLinkedList.addAtPosition(60,3);
        doublyLinkedList.display();
        doublyLinkedList.addAtPosition(70,2);
        doublyLinkedList.display();
        doublyLinkedList.addAtPosition(80,6);
        doublyLinkedList.display();// 50 20 70 10 60 30 80 40
        doublyLinkedList.deleteFist();
        doublyLinkedList.display();
        doublyLinkedList.deleteLast();
        doublyLinkedList.display();//20 70 10 60 30 80
        doublyLinkedList.deleteAtPosition(0);
        doublyLinkedList.display();
        doublyLinkedList.deleteAtPosition(1);
        doublyLinkedList.display();
        doublyLinkedList.deleteAtPosition(4);
        doublyLinkedList.display();

    }
}
