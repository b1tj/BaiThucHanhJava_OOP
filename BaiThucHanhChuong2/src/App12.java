import java.util.Scanner;
public class App12 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int m, n;
        System.out.println("Nhap so hang cua mang: ");
        m = sc.nextInt();
        System.out.println("Nhap so cot cua mang: ");
        n = sc.nextInt();
        int A[][] = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print("A["+i+"]["+j+"]= ");
                A[i][j] = sc.nextInt();
                System.out.println();
            }
        }
        System.out.println("Mang vua nhap: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }

        int max = A[0][0];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(A[i][j]>max)
                    max = A[i][j];
            }
        }
        System.out.println("Phan tu lon nhat trong mang: "+max);
    }

}