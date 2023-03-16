package Introduction_to_Java_1;

import java.util.Scanner;

class Ques4 {
    static int m = 2, n = 2;
    static void row(int arr[][]){
        int i,j,sum=0;
        for(i=0;i<m;++i){
            for(j=0;j<n;++j){
                sum += arr[i][j];
            }
            System.out.print("Sum or row "+ sum + "\n");
            sum = 0;
        }
    }
    static void column(int arr[][]){
        int i,j,sum=0;
        for(i=0;i<m;++i){
            for(j=0;j<n;++j){
                sum += arr[j][i];
            }
            System.out.print("Sum or column "+ sum + "\n");
            sum = 0;
        }
    }
    public static void main(String[] args) {
        int i,j;
        int[][] arr = new int[m][n];
        Scanner sc = new Scanner(System.in);
        for(i=0;i<m;i++){
            System.out.print("Enter the value of row "+"\n");
            for(j=0;j<n;j++)
                arr[i][j]=sc.nextInt();
        }
        row(arr); column(arr);
    }
}

