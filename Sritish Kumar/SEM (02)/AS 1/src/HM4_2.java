
import java.util.Scanner;

public class HM4_2 {
    static Scanner scan = new Scanner(System.in);

    static boolean check(int[][] a, int[][] b) {
        boolean flag = false;

        if (a.length == b.length && a[0].length == b[0].length) {
            flag = true;

        }
        return flag;

    }

    static int[][] input(int r, int c) {
        int[][] array = new int[r][c];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scan.nextInt();

            }

        }
        return array;

    }

    public static int[][] addMatrix(int[][] a, int[][] b) {
        int[][] sum = new int[a.length][a[0].length];

        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                sum[i][j] = a[i][j] + b[i][j];

            }

        }

        return sum;
    }

    static void display(int[][] arr) {
        for (int[] is : arr) {
            for (int is2 : is) {
                System.out.print(is2 + " ");

            }
            System.out.println();

        }

    }

    public static void main(String[] args) {

        int[][] arr1;
        int[][] arr2;

        System.out.print("Size of MATRIX 1 :");
        arr1 = new int[scan.nextInt()][scan.nextInt()];
        System.out.print("Size of MATRIX 2 :");
        arr2 = new int[scan.nextInt()][scan.nextInt()];

        if (check(arr1, arr2)) {
            System.out.println("Enter the matrix 1 ele");
            arr1 = input(arr1.length, arr1[0].length);
            System.out.println("Enter the matrix 2 ele");
            arr2 = input(arr2.length, arr2[0].length);
            System.out.println();
            display(arr1);
            System.out.println();
            display(arr2);
            System.out.println();

            display(addMatrix(arr2, arr1));

        } else {
            System.out.println("Cant Add 2 Matrix of different dimensions");
        }
        scan.close();

    }
}
