package com.crud;


public class SingleLinkedList {
    // Method to insert a node at the beginning of the linked list
    public Node insertFirstNode(String data, Node node) {
        if (node == null) {
            return new Node(data, null);
        }
        // Return the new node as the head of the list
        return new Node(data, node);
    }
}
