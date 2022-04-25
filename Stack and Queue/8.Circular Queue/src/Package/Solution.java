package Package;


public class Solution {
    public static void main(String[] args) {
        System.out.println("\n\nCircular Queue....");
        Employee var1 = new Employee(1, "Name1", "Java");
        Employee var2 = new Employee(2, "Name2", "Java0");
        Employee var3 = new Employee(3, "Name3", "Java1");
        Employee var4 = new Employee(4, "Name4", "Java2");

        Queue q = new Queue(2);
        System.out.println("capacity -> " + q.Q_capacity());
        System.out.println("\n----------1-----------");
        System.out.println("Added ~ ");
        q.add(var1);
        q.add(var2);
        q.add(var3);
        q.add(var4);

        q.display();
        System.out.println("capacity -> " + q.Q_capacity());
        System.out.println("Front = " + q.getFront());
        System.out.println("back  = " + q.getBack());

        System.out.println("\nRemoval ~ FIFO");
        q.remove();
        q.remove();


        System.out.println("capacity -> " + q.Q_capacity());
        System.out.println("Front = " + q.getFront());
        System.out.println("back  = " + q.getBack());
        System.out.println("----------removal end-----------\n---Contents :\n");

        q.display();
        System.out.println("----------2-----------");
        System.out.println("Added ~ ");
        q.add(var1);
        q.add(var2);
        q.display();

        System.out.println("capacity -> " + q.Q_capacity());
        System.out.println("Front = " + q.getFront());
        System.out.println("back  = " + q.getBack());

        System.out.println("----------3-----------");

        System.out.println("Front = " + q.getFront());
        System.out.println("back  = " + q.getBack());
        System.out.println("old capacity --> " + q.Q_capacity());
        System.out.println("Added ~ ");
        q.add(var3);
        q.add(var4);
        q.display();
        System.out.println("New capacity --> " + q.Q_capacity());


    }
}
