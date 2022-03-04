import java.util.Scanner;

public class App81 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int m, n;
        System.out.println("Nhap so dong ma tran: ");
        m = sc.nextInt();
        System.out.println("Nhap so cot ma tran: ");
        n = sc.nextInt();
        int[][] A = new int[m][n];
        System.out.println("Nhap phan tu cua mang: ");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print("A[" +i+ "][" +j+ "]= ");
                A[i][j] = sc.nextInt();
            } 
        }
        
        System.out.println("Mang da nhap: ");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(A[i][j]+" ");
            } 
            System.out.println();
        }

        int max = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(A[i][j] > max)
                    max = A[i][j];
            }
        }

        System.out.println("Phan tu co gia tri lon nhat trong mang: " +max);
        

    }
}
