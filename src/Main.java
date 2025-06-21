import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap so hang cua mang:");
        int n = sc.nextInt();
        System.out.println("Moi nhap so cot cua mang");
// Nhap du lieu mang ban dau
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        if(n<=0 || m<=0){
            System.out.println("Mang khong hop le");
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("Moi nhap phan tu hang thu %d, cot thu %d: ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
        // In ra mang ban dau
        System.out.println("Mang vua nhap:\n" +
                "arr = "+ Arrays.deepToString(arr));
         //doi hang thanh cot
        int[][]newArr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                newArr[i][j] = arr[j][i] ;


            }

        }
        //sau khi doi hang thanh cot
        System.out.println("Mang sau khi da doi hang thanh cot:\n" +
                "arr = "+ Arrays.deepToString(newArr));
        // Hoan doi vi tri index cua cac phan tu trong hang

        for(int i = 0; i < newArr.length; i++){
            for(int j = 0; j < newArr[i].length/2; j++){
                int temp = newArr[i][j];
                newArr[i][j] = newArr[i][newArr[i].length-j-1];
                newArr[i][newArr[i].length-j-1] = temp;

            }
        }
        System.out.println("Mang sau khi da xoay 90do:\n" +
                "arr = "+ Arrays.deepToString(newArr));
    }
}
