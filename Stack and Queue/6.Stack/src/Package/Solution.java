package Package;

public class Solution {
    public static void main(String[] args) {
        Stack stk = new Stack();
        stk.push(10);
        stk.push(20);
        stk.push(30);
        System.out.println(stk.peek());
        System.out.println("Removed - " + stk.pop());
        System.out.println("Removed - " + stk.pop());
        System.out.println("Removed - " + stk.pop());
        System.out.println(stk.pop());
        System.out.println("is empty - "+stk.isEmpty());
    }
}
