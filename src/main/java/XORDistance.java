import java.util.Scanner;
//Not Finished
public class XORDistance {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t!=0){
            int a,b,r,n;
            n = 0;
            a = in.nextInt();
            b = in.nextInt();
            r = in.nextInt();
            String sa, sb, sr;
            sa = Integer.toBinaryString(a);
            sb = Integer.toBinaryString(b);
            sr = Integer.toBinaryString(r);
            if(sa.length()>sb.length()){
                n = sa.length();
                String temp = "";
                for(int i = 0; i < n-sb.length();i++){
                    temp+="0";
                }
                temp+=sb;
                sb = temp;
            }
            if(sa.length()<sb.length()){
                n = sb.length();
                String temp = "";
                for(int i = 0; i < n-sa.length();i++){
                    temp+="0";
                }
                temp+=sa;
                sa = temp;
            }
            int srl = sr.length();
            int dif = n - sr.length();
            int ans = 0;
            int c = 1;
            for(int i = 0;i < n;i++){
                if(dif>0){
                    dif--;
                } else {
                    if(sa.charAt(i)==sb.charAt(i)) ans+=(int)Math.pow(2*(sa.charAt(i)-'0'),srl-c++);
                }
            }
            System.out.println(ans);
            t--;
        }
    }

}
