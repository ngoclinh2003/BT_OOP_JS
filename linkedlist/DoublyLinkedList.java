package linkedlist;

public class DoublyLinkedList {
    private Node head;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (size == 0) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head.setPrevious(newNode);
            head = newNode;
        }
        size++;
    }

    public void addLast(int data) {
        if (size == 0) {
            addFirst(data);
        } else {
            Node newNode = new Node(data);
            Node lastNode = head;
            while (lastNode.getNext() != null) {
                lastNode = lastNode.getNext();
            }
            lastNode.setNext(newNode);
            newNode.setPrevious(lastNode);
        }
        size++;
    }

    public void addAtPosition(int data, int position) {
        if (position == 0) {
            this.addFirst(data);
        } else if (position == size) {
            this.addLast(data);
        } else if (position < size) {
            Node newNode = new Node(data);
            Node tmp = head;
            for (int i = 0; i < position; i++) {
                tmp = tmp.getNext();
            }
            Node lastNode = tmp.getPrevious();
            Node nextNode = tmp;
            // set
            lastNode.setNext(newNode);
            newNode.setPrevious(lastNode);

            newNode.setNext(nextNode);
            nextNode.setPrevious(newNode);
        } else {
            throw new RuntimeException("Vi tri k phu hop");
        }
        size++;
    }

    public void deleteFist() {
        if (size == 0) {
            throw new RuntimeException("danh sach lien ket rong");
        } else if (size == 1) {
            head = null;
            size = 0;
        } else {
            Node nextNode = head.getNext();
            nextNode.setPrevious(null);
            head = nextNode;
            size--;
        }
    }

    public void deleteLast() {
        if (size == 0){
            throw new RuntimeException("danh sach lien ket rong");
        }else if(size ==1) {
            head = null;
            size = 0;
        } else {
            Node tmp = head;
            while (tmp.getNext() != null){
                tmp = tmp.getNext();
            }
            Node lastNode = tmp.getPrevious();
            lastNode.setNext(null);
            size--;
        }
    }

    public void deleteAtPosition(int position){
        if (position == 0) {
            this.deleteFist();
        } else if (position == size) {
            this.deleteLast();
        } else if (position < size) {
            Node tmp = head;
            for (int i = 0; i < position; i++) {
                tmp = tmp.getNext();
            }
            Node lastNode = tmp.getPrevious();
            Node nextNode = tmp.getNext();
            // set
            lastNode.setNext(nextNode);
            nextNode.setPrevious(lastNode);

        } else {
            throw new RuntimeException("Vi tri k phu hop");
        }
        size--;
    }


    public void display(){
        if(size == 0){
            System.out.println("danh sach lien ket rong !");
        }
        Node tmp = head;
        while(tmp != null){
            System.out.print(tmp.getData()+"<=>");
            tmp = tmp.getNext();
        }
        System.out.print("NUll");
        System.out.println();
    }


}
