import java.util.Scanner;

public class BrickWall {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        while(t!=0){
            int n = in.nextInt();
            int m = in.nextInt();
            int ans = n * (m/2);
            System.out.println(ans);
            t--;
        }

    }

}
