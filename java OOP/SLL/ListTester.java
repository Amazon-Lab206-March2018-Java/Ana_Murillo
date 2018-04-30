public class ListTester{
    public static void main(String[] args) {
        SinglyLinkedList SLL = new SinglyLinkedList();
        SLL.add(8).add(7).add(5).add(9).add(4);
        SLL.printValues();
        SLL.remove().remove();
        SLL.printValues();
    }
}