package Pakage1;

import Pakage1.Employee;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Name1", "Java"));
        list.add(new Employee(2, "Name2", "Java1"));
        list.add(new Employee(3, "Name3", "Java2"));
        System.out.println(list);

        list.set(1, new Employee(2, "Name2", "Java"));
        list.forEach(var -> System.out.println(var));
        list.remove(1);
        System.out.println("-------------------------------------------");
        list.forEach(var -> System.out.println(var));
        //capacity  - 10(default)
        //size - current stored elements in list...
    }
}
