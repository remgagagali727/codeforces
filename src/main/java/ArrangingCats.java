import java.util.Scanner;

public class ArrangingCats {

    public static void main(String[] args) {

        Scanner lec = new Scanner(System.in);

        int t = lec.nextInt();

        while (t!=0){
            int n = lec.nextInt();
            lec.nextLine();
            String a = lec.nextLine();
            String b = lec.nextLine();
            int c = 0;
            int dif = 0;
            for(int i = 0;i < n;i++){
                if(a.charAt(i)!=b.charAt(i)) c++;
                if(a.charAt(i)=='1') dif++;
                if(b.charAt(i)=='1') dif--;
            }
            dif = Math.abs(dif);
            c = (c-dif)/2 + dif;
            System.out.println(c);
            t--;
        }

    }
}
