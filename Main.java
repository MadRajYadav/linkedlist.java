package io.sandeep.LinkedList;

public class Main{

    public static Node header = new Node();

    public static void main(String[] args) {


        Node firstNode = create(5);
        Node secondNode = create(6);
        Node thirdNode = create(7);

        insertNewNode(header,firstNode);
        insertNewNode(header,secondNode);
        insertNewNode(header,thirdNode);
        //header = header.nextRef;
        print(header);

    }


    static void print(Node header){
        while(header!=null){
            System.out.println(header.data+" ->");
            header = header.nextRef;
        }

    }
    public static void insertNewNode(Node header, Node newNode){
        if(header==null){
             header = newNode;
        } else {
            Node temp = header;
            while(temp.nextRef!=null){
                temp=temp.nextRef;
            }
            temp.nextRef=newNode;

        }
    }

    public static Node create(int a){
        Node node = new Node();
        node.data=a;
        return node;
    }

}


class Node {

    int data;
    Node nextRef;


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNextRef() {
        return nextRef;
    }

    public void setNextRef(Node nextRef) {
        this.nextRef = nextRef;
    }
}