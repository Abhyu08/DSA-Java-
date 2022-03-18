package challenge;


public class IntegerLinkedList {

    private IntegerNode head;
    private int size;

    public void addToFront(Integer value) {
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public IntegerNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        IntegerNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void insertSorted(Integer value) {

        // add your code here
        IntegerNode node = new IntegerNode(value);
        if (head == null) {
            head = node;
        } else if (head.getValue() > value) {
            node.setNext(head);
            head = node;
        } else {

            IntegerNode prev = head;
            IntegerNode current = head;
            while (current != null) {
                if (current.getValue() > value) {
                    break;
                }
                prev = current;
                current = current.getNext();
            }
            node.setNext(prev.getNext());
            prev.setNext(node);
        }


    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        IntegerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
