import java.util.Scanner;

public class Square {

    public static void main(String[] args) {

        Scanner lec = new Scanner(System.in);

        int t = lec.nextInt();

        while(t!=0){
            int ans = 0;
            int values[] = new int[6];
            int s1 = 0, s2 = 0;
            int p1 = lec.nextInt(), p2 = lec.nextInt();
            for(int i = 0;i < 6;i++){
                values[i] = lec.nextInt();
            }
            boolean f1, f2;
            f1 = f2 = true;
            for(int i = 0;i < 6;i+=2){
                if(f1){
                    if(p1==values[i]){
                        s1 = values[i+1] - p2;
                        f1 = false;
                        continue;
                    }
                }
                if(f2){
                    if(p2==values[i+1]){
                        s2 = values[i] - p1;
                        f2 = false;
                    }
                }
            }
            ans = Math.abs(s1 * s2);
            System.out.println(ans);
            t--;
        }

    }
}
