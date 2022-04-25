package Package;

public class Solution {
    public static void main(String[] args) {
        Employee var1 = new Employee(1, "Name1", "Java");
        Employee var2 = new Employee(2, "Name2", "Java0");
        Employee var3 = new Employee(3, "Name3", "Java1");
        Employee var4 = new Employee(4, "Name4", "Java2");

        Queue q = new Queue(3);
        System.out.println("capacity -> " + q.Q_capacity());

        q.add(var1);
        q.add(var2);
        q.add(var3);
        q.add(var4);

        System.out.println(q.toString());
        System.out.println("capacity -> " + q.Q_capacity());

        System.out.println("Removal ~ FIFO");
        q.remove();
        q.remove();
        q.add(var1);
        q.add(var2);
        System.out.println(q.toString());

    }
}
