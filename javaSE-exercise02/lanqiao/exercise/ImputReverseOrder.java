package lanqiao.exercise;

import java.util.Arrays;
import java.util.Scanner;
// 1:����package
// 2: ��������Main, �����޸�

public class ImputReverseOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //�ڴ��������Ĵ���...
        int[] arr = new int[scan.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println();
        Arrays.sort(arr);

        for (int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + "\t");
        }
        scan.close();
    }
}
