package Pakage1;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Implementation of ArrayList : ");
        System.out.println("Use Vector instead of ArrayList if you want synchronized behaviour for the list");
        List<Employee> list = new Vector<>();

        list.add(new Employee(101,"name1","java"));
        list.add(new Employee(102,"name2","java2"));
        list.add(new Employee(103,"name3","java3"));
        list.forEach(var -> System.out.println(var));

        list.set(1,new Employee(104,"name4" , "java4"));
        System.out.println("Modified :: ");
        list.forEach(var -> System.out.println(var));

    }

}
