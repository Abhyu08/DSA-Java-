package Pakage;

import Pakage.Definations;
import Pakage.ListNode;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListNode head = null;
        boolean status = true;
        while (status) {
            System.out.println("1.Insert data 2.Display data 3.delete data 4.Search key " +
                    "5.insert at index 6.delete at index 7.display reverse 8.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter value :");
                    int data = sc.nextInt();
                    head = Definations.insert_node(head, data);
                    break;
                case 2:
                    Definations.display(head);
                    break;
                case 3:
                    head = Definations.delete(head);
                    break;
                case 4:
                    System.out.println("Enter Key : ");
                    int key = sc.nextInt();
                    ListNode tmp = Definations.search(head, key);
                    if (tmp == null) {
                        System.out.println("Not found!");
                    } else {
                        System.out.println("Found!");
                    }
                    break;
                case 5:
                    System.out.println("Enter value and index :");
                    int value = sc.nextInt();
                    int index = sc.nextInt();
                    head = Definations.insert_index(head, value, index);
                    break;
                case 6:
                    System.out.println("Enter index to be deleted :");
                    int index1 = sc.nextInt();
                    head = Definations.delete_index(head, index1);
                    break;
                case 7:
                    Definations.display_reverse(head);
                    break;
                default:
                    status = false;
                    System.out.println("Exiting...");
            }

        }
    }
}
