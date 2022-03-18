package Package;

import javax.sound.sampled.Line;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // List<Integer> list = new LinkedList<>();
        //addFirst() , addLast() methods not available
        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(new Employee(101, "name1", "java"));  //O(1)
        list.addLast(new Employee(102, "name2", "java2"));  // O(1)

        list.add(2, new Employee(103, "name3", "java3"));
        //linear time depends on length and index

        /*  Predefined Implementation in JDK (Doubly Linked List)

            transient LinkedList.Node<E> first;
            transient LinkedList.Node<E> last;
            private static class Node<E> {
            E item;
            LinkedList.Node<E> next;
            LinkedList.Node<E> prev;
            -->
            Node(LinkedList.Node<E> prev, E element, LinkedList.Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

         */
        System.out.println("Print typ1 : ");
        list.forEach(var -> System.out.println(var));

        System.out.println("Print typ2 : ");
        Iterator  var = list.iterator();
        while (var.hasNext()) {
            System.out.println(var.next());
        }

        System.out.println("Print typ3 : ");
        for (Employee var2 : list) {
            System.out.println(var2);
        }
    }
}
