package Package;

import java.util.ArrayList;

public class Stack {
    ArrayList<Integer> list = new ArrayList<>();

    public void push(int value) {
        list.add(value);
    }

    public int pop() {
        if (list.size() <= 0) {
            System.out.println("UnderFlow ...");
            return -1;
        }
        int temp = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return temp;
    }

    public int peek() {
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.size() > 0 ? true : false;
    }

}
