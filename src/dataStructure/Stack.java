package dataStructure;

public class Stack {

    private Node top;
    private int height;

    public Stack(int value ) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void getTop() {
        if(top == null) {
            System.out.println("Pilha vazia!");
        } else {
            System.out.println("Topo da pilha: " + top.value);
        }
    }

    public void getHeight() {
        System.out.println("Altura da pilha: " + height);
    }

    public void print() {
        System.out.println("---------------------");
        Node temp = top;

        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("---------------------");
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (height == 0) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    public static void main(String[] args) {
        Stack myStack = new Stack(0);

//        myStack.getTop();
//        myStack.getHeight();
//        myStack.print();

        for (int i = 1; i <= 5; i++) {
            myStack.push(i);
        }

        myStack.print();
        myStack.getTop();
        myStack.getHeight();
    }

    class Node {
        int value;
        Node next;

        Node (int value) {
            this.value = value;
        }
    }
}
