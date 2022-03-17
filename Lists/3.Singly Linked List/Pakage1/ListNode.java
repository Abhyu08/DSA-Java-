package Pakage1;

public class ListNode {

    public int data;
    public ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}


class Definations {

    public static ListNode insert_node(ListNode head, int data) {
        ListNode temp = new ListNode(data);
        if (head == null) {
            head = temp;
            return head;
        } else {
            ListNode store = head;

            while (head.next != null) {
                head = head.next;
            }
            head.next = temp;
            return store;
        }

    }

    public static void display(ListNode head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static ListNode delete(ListNode head) {
        ListNode prev = head;
        ListNode store = head;
        if (head.next == null) {
            return null;
        } else {
            while (head.next != null) {
                prev = head;
                head = head.next;
            }
            prev.next = null;
            return store;
        }
    }

    public static ListNode search(ListNode head, int key) {
        while (head != null) {
            if (head.data == key) {
                return head;
            }
            head = head.next;
        }
        return null;
    }

    public static ListNode insert_index(ListNode head, int data, int index) {
        ListNode temp = new ListNode(data);
        if (index == 1) {
            temp.next = head;
            head = temp;
            return head;
        } else if (head == null) {
            System.out.println("Plz Enter valid index(no elements currently!)");
            return null;
        } else {
            index -= 1;
            ListNode store = head;

            while (head != null && index > 1) {
                head = head.next;
                index--;
            }
            if (head == null && index != 1) {
                System.out.println("Plz Enter valid index");
                display(store);
            } else if (index == 1) {
                temp.next = head.next;
                head.next = temp;
            }
            return store;
        }

    }

    public static ListNode delete_index(ListNode head, int index) {

        if (head == null) {
            System.out.println("no Elements present!");
            return null;
        } else if (index == 1) {
            head = head.next;
            return head;
        } else {
            ListNode store = head;
            index -= 1;
            while (head != null && index > 1) {
                head = head.next;
                index--;
            }
            if (head == null && index != 1) {
                System.out.println("Plz Enter valid index");
                display(store);
            } else if (index == 1) {
                head.next = head.next.next;
                System.out.println("Deleted!");
            }
            return store;
        }

    }
}