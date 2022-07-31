package com.satyendra.linkedlists;

public class LinkedList {

    Node head; // head of the list

    // Linked list Node
    static class Node{
        int data;
        Node next;
        // Constructor to create a new node and next by default null
        Node(int d){
            data = d;
            next = null;
        }
    }

    // method to insert node into linked list
    public static LinkedList insert(LinkedList list, int data){
        // create new node with given data
        Node newNode = new Node(data);

        //if linked list as empty, then make new node as head node
        if(list.head==null){
            list.head = newNode;
        } else{
            // travers till the last node and insert the new node
            Node last = list.head;
            while (last.next != null){
            last = last.next;
            }
            // Insert the new node at the last node
            last.next=newNode;
        }
        // return the list
        return list;
    }

    // print the linked list
    public static void printLinkedList(LinkedList list){
    Node currentNode = list.head;
        System.out.print("linkedList :");
        while(currentNode!=null){
            System.out.print(currentNode.data+" ");
            currentNode = currentNode.next;
        }
    }
    public static void main(String[] args) {
        //start with empty list
        LinkedList linkedList = new LinkedList();

        // insert list
        linkedList = insert(linkedList,10);
        linkedList = insert(linkedList,20);
        linkedList = insert(linkedList,30);
        linkedList = insert(linkedList,40);
        printLinkedList(linkedList);
    }
}
