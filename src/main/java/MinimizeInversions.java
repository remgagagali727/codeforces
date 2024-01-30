import java.util.Arrays;
import java.util.Scanner;
public class MinimizeInversions {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        while(t!=0){
            int n = in.nextInt();
            int len = String.valueOf(n).length();
            int extra = (int)Math.pow(10,len);
            int[] a, b, c;
            a = new int[n];
            b = new int[n];
            c = new int[n];
            for(int i = 0;i < n;i++) a[i] = in.nextInt();
            for(int i = 0;i < n;i++) b[i] = in.nextInt();
            for(int i = 0;i < n;i++) c[i] = (a[i]+b[i])*extra+i;
            Arrays.sort(c);
            for(int i = 0;i < n;i++) System.out.print(a[c[i]%extra]+" ");
            System.out.println();
            for(int i = 0;i < n;i++) System.out.print(b[c[i]%extra]+" ");
            System.out.println();
            t--;
        }

    }

}
//2 3 1 4 6 5
//1 2 6 4 3 5
//1 1 0 0 1 0 = 3
//0 0 3 1 0 0 = 4