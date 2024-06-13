package dataStructure;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    public LinkedList(String data) {
        length = 1;
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
    }

    public void getHead() {
        if(this.head == null) {
            System.out.println("Lista vazia!");
        } else {
            System.out.println("Head: " + head.data);
        }

    }


    public void getTail() {
        if(this.tail == null) {
            System.out.println("Lista vazia!");
        } else {
            System.out.println("Tail: " + tail.data);
        }

    }

    public void getLength() {
        System.out.println("Length: " + this.length);

    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void print() {
        Node temp = this.head;
        System.out.println("-------------------------------");
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void append(String data) {
        Node newNode = new Node(data);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0) return null;
        Node pre =  head;
        Node temp = null;

        while(pre.next != tail) {
            pre = pre.next;
        }

        tail = pre;
        temp = tail.next;
        tail.next = null;

        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }

        return temp;

    }

    public void prepend(String data) {
        Node newNode = new Node(data);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;

        if (length == 0) {
            head = null;
            tail = null;
        }

        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;

        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }

    public boolean insert(int index, String data) {
        if (index < 0 || index > length) return false;
        if (index == 0) {
            prepend(data);
            return true;
        }
        if (index == length) {
            append(data);
            return true;
        }

        Node newNode = new Node(data);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList("Elemento 1");
        list.append("Elemento 2");
        list.append("Elemento 3");
        list.prepend("Elemento 0");

        list.insert(3, "Elemento 2.5");

        System.out.println(list.get(2).data);
        list.print();



//        System.out.println("Elemento removido da lista: " + list.removeFirst().data);
//        list.print();

//        list.getHead();
//        list.getTail();
//        list.getLength();
//        list.print();
    }



    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
        }
    }
}
