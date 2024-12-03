class LinkedList {
    // Node class to represent each element
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    // Create (Add an element to the list)
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Read (Print all elements)
    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Update (Modify an element by position)
    public void update(int position, int newData) {
        if (head == null || position < 0) {
            System.out.println("Invalid position.");
            return;
        }
        Node temp = head;
        int index = 0;

        while (temp != null && index < position) {
            temp = temp.next;
            index++;
        }

        if (temp == null) {
            System.out.println("Position out of range.");
        } else {
            temp.data = newData;
            System.out.println("Updated position " + position + " with " + newData);
        }
    }

    // Delete (Remove an element by position)
    public void delete(int position) {
        if (head == null || position < 0) {
            System.out.println("Invalid position.");
            return;
        }

        if (position == 0) {
            head = head.next; // Remove the head node
            return;
        }

        Node temp = head;
        int index = 0;

        while (temp != null && index < position - 1) {
            temp = temp.next;
            index++;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Position out of range.");
        } else {
            temp.next = temp.next.next; // Bypass the node to delete it
            System.out.println("Deleted node at position " + position);
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Create
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Original List:");
        list.printList();

        // Read
        System.out.println("Reading List:");
        list.printList();

        // Update
        list.update(2, 25);
        System.out.println("After Update:");
        list.printList();

        // Delete
        list.delete(1);
        System.out.println("After Delete:");
        list.printList();
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter your choice :");
        //need to write here menu based output for user interaction
        //TODO
    }
}