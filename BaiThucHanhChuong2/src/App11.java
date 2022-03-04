import java.util.Scanner;
public class App11 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so luong phan tu mang:");
        n = sc.nextInt();
        int A[] = new int[n];
        System.out.println("Nhap phan tu mang: ");
        for(int i=0; i<n; i++){
            System.out.print("A["+i+"]= ");
            A[i]=sc.nextInt();
            System.out.println();
        }
        int swapCheck = 0;
        for(int i=0; i<n-1; i++){
            swapCheck = 0;
            for(int j=0; j<n-i-1; j++){
                if(A[j] > A[j+1]){
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                    swapCheck = 1;
                }
            }
            if(swapCheck == 0)
                break;
        }
        for(int i=0; i<n; i++){
            System.out.print(A[i]+" ");
        }
    }
}
