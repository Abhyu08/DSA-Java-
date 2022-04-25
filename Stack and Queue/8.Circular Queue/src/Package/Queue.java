package Package;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Queue {

    private int front = 0;
    private int back = 0;

    private int occupied = 0;
    Employee[] queue;

    public int getFront() {
        return front;
    }


    public int getBack() {
        return back;
    }


    Queue() {
        this(5);
    }

    Queue(int capacity) {
        Employee[] newArray = new Employee[capacity];
        queue = newArray;
    }

//    public int size() {
//        if (back >= front) {
//            return Math.max(back, 0) - front + 1;
//        } else {
//            return front - back + queue.length;
//        }
//    }

    private void grow(Employee[] Q) {
        int old_cap = Q.length;
        Employee[] newArray = new Employee[2 * old_cap];
        int index = 0;
        for (int i = front; i < old_cap; i++) {
            newArray[index++] = Q[i];
        }
        for (int i = 0; i < front; i++) {
            newArray[index++] = Q[i];
        }
        back = index;
        front = 0;
        queue = newArray;
    }

    public void add(Employee value) {

        if (occupied >= queue.length)
            grow(queue);


        queue[back] = value;
        back = (back + 1) % queue.length;
        occupied++;
    }

    public Employee remove() {
        if (occupied <= 0) {
            throw new NoSuchElementException("Cannot Remove(No Element Present)!!");
        }

        Employee temp = queue[front];
        queue[front++] = null;
        front = front % queue.length;
        occupied--;
        return temp;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "queue=" + Arrays.toString(queue) +
                '}';
    }

    public void display() {
        for (Employee e : queue)
            System.out.println(e);

        System.out.println("-----------------------\n ");
    }

    public int Q_capacity() {
        return queue.length;
    }
}
