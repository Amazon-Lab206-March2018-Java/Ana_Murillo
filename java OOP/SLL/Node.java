public class Node{
    private int value;
    private Node next;

    public Node(int number){
        value = number;
        next = null;
    }
    //getter
    public Node getNext(){
        return next;
    }
    //setter
    public void setNext(Node n){
        next = n;
    }
     //getter
    public int getValue(){
        return value;
    }
}