package Package;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Queue {
    private int front;
    private int back;
    Employee[] queue;

    Queue() {
        this(10);
        front = 0;
        back = 0;
    }

    Queue(int capacity) {
        Employee[] newArray = new Employee[capacity];
        queue = newArray;
    }

    public int size() {
        return back - front;
    }

    public void add(Employee value) {
        //Overhead in Normal Queue Implementation...
        if (back == queue.length - 1 && size() < queue.length / 2 + 1) {
            Employee[] newArray = new Employee[queue.length];
            System.arraycopy(queue, front, newArray, 0, size());
             /*
public static void arraycopy(Object source_arr, int sourcePos,Object dest_arr, int destPos, int len)
Parameters :
source_arr :  array to be copied from
sourcePos :   starting position in source array from where to copy
dest_arr :    array to be copied in
destPos :     starting position in destination array, where to copy in
len :         total no. of components to be copied.
             */
            queue = newArray;
            back = size();
            front = 0;
        } else if (size() >= queue.length || back == queue.length - 1) {
            Employee[] newArray = new Employee[2 * queue.length];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }
        queue[back++] = value;
    }

    public Employee remove() {
        if (size() == 0) {
            front = 0;
            back = 0;
            throw new NoSuchElementException();
        }
        Employee temp = queue[front];
        queue[front] = null;
        front++;
        return temp;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "queue=" + Arrays.toString(queue) +
                '}';
    }

    public int Q_capacity() {
        return queue.length;
    }
}
