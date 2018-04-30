public class SinglyLinkedList{
    private Node head;

    public SinglyLinkedList(){
        head = null;
    }

    public SinglyLinkedList add(int number){
        Node addNode = new Node(number);
        if( head == null){
            head = addNode;
            return this;
        }
        Node current = head;
        while (current.getNext() != null){
            current = current.getNext();
         }
        current.setNext(addNode);
        return this;
    }

    public SinglyLinkedList remove(){
        if (head == null){
            return this;
        }
        Node current = head;
        while (current.getNext().getNext() != null){
            current = current.getNext();
         }
        current.setNext(null);
        return this;
    }

    public void printValues(){
        Node current = head;
        while (current != null){
            System.out.println(current.getValue());
            current = current.getNext();
         }
    }
}