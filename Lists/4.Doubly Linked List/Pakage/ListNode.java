package Pakage;


public class ListNode {

    private int data;
    private ListNode next;
    private ListNode prev;

    ListNode() {
        data = -1;
        next = null;
        prev = null;
    }

    ListNode(int data, ListNode prev) {
        this.data = data;
        this.next = null;
        this.prev = prev;
    }
    //getters,setters

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getPrev() {
        return prev;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }

}


class Definations {

    public static ListNode insert_node(ListNode head, int data) {

        if (head == null) {
            ListNode temp = new ListNode(data, null);
            head = temp;
            return head;
        } else {
            ListNode store = head;
            ListNode temp = new ListNode(data, null);
            while (head.getNext() != null) {
                head = head.getNext();
            }
            head.setNext(temp);
            temp.setPrev(head);
            return store;
        }

    }

    public static void display(ListNode head) {
        while (head != null) {
            System.out.print(head.getData() + " -> ");
            head = head.getNext();
        }
        System.out.println("null");
    }

    public static void display_reverse(ListNode head) {
        while (head.getNext() != null) {
            head = head.getNext();

        }
        while (head != null) {
            System.out.print(head.getData() + " -> ");
            head = head.getPrev();
        }
        System.out.println("null");
    }


    public static ListNode delete(ListNode head) {
        ListNode prev = head;
        ListNode store = head;
        if (head.getNext() == null) {
            return null;
        } else {
            while (head.getNext() != null) {
                prev = head;
                head = head.getNext();
            }
            prev.setNext(null);
            return store;
        }
    }

    public static ListNode search(ListNode head, int key) {
        while (head != null) {
            if (head.getData() == key) {
                return head;
            }
            head = head.getNext();
        }
        return null;
    }

    public static ListNode insert_index(ListNode head, int data, int index) {
        ListNode temp = new ListNode(data, null);
        if (index == 1) {
            temp.setNext(head);
            head.setPrev(temp);
            return head;
        } else if (head == null) {
            System.out.println("Plz Enter valid index(no elements currently!)");
            return null;
        } else {
            index -= 1;
            ListNode store = head;

            while (head != null && index > 1) {
                head = head.getNext();
                index--;
            }
            if (head == null && index != 1) {
                System.out.println("Plz Enter valid index");
                display(store);
            } else if (index == 1) {
                temp.setNext(head.getNext());
                head.setNext(temp);
                temp.setPrev(head);
            }
            return store;
        }

    }

    public static ListNode delete_index(ListNode head, int index) {

        if (head == null) {
            System.out.println("no Elements present!");
            return null;
        } else if (index == 1) {
            head = head.getNext();
            return head;
        } else {
            ListNode store = head;
            index -= 1;
            while (head != null && index > 1) {
                head = head.getNext();
                index--;
            }
            if (head == null && index != 1) {
                System.out.println("Plz Enter valid index");
                display(store);
            } else if (index == 1) {
                head.setNext(head.getNext().getNext());
                System.out.println("Deleted!");
            }
            return store;
        }

    }
}