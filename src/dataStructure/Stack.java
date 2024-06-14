package dataStructure;

public class Stack {

    private Node top;
    private int height;

    public Stack(int value ) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    class Node {
        int value;
        Node next;

        Node (int value) {
            this.value = value;
        }
    }
}
