import java.util.Scanner;

//https://leetcode.com/problems/height-checker/
//Using Counting Sort.
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int no = sc.nextInt();
        int[] arr = new int[no];

        for (int i = 0; i < no; i++) arr[i] = sc.nextInt();
        System.out.println(heightChecker(arr));
        sc.close();
    }

    public static int heightChecker(int[] arr) {

        int no = arr.length;
        int differences = 0;
        int[] counting_sort = new int[150];
        for (int i = 0; i < no; i++) counting_sort[arr[i]]++;

        for (int i = 0, index = 0; i < 110; i++) {
            if (counting_sort[i] == 0) continue;
            if (arr[index] != i) differences++;
            arr[index++] = i;
            if (--counting_sort[i] > 0) i--;
        }
        return differences;
    }
}
/*Testcases :
6
1 1 4 2 1 3

5
5 1 2 3 4

5
1 2 3 4 5

 */