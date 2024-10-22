import java.util.*;
class LinkedList_Main {
    public static void main(String[] args) {
        LinkedList num = new LinkedList();
        num.add(1);
        num.add(2);
        num.add(4);

        num.addFirst(0);
        num.addMiddle(3);

        num.deleteFirst(0);

        num.printValues(); // Should print: 1 2 3 4
    }
}

class LinkedList {
    Scanner sr = new Scanner(System.in);
    Node head = null;

    public void add(int data) {
        Node newNode = new Node(data);
        // System.out.println("Adding: " + data); // Debug print
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next; // Traverse to the end of the list
            }
            current.next = newNode; // Add newNode after current node
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addMiddle(int data){
        Node newNode = new Node(data);
        Node current = head;
        System.out.println("Enter your position:");
        int position = sr.nextInt();
        int count = 1;
        while (current.next != null && count < position) {
            current = current.next;
            count++;
        }
        if (count == position) {
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void deleteFirst(int data){
        if(head == null){
            System.out.println("List is empty");
        }
        else if(head.data == data){
            head = head.next;
            }
            // else{
            //     Node current = head;
            //     while (current.next != null && current.next.data != data) {
            //         current = current.next;
            //         }
            //         if (current.next != null) {
            //             current.next = current.next.next;
            //         }
            //     }
    }

    public void printValues() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}
