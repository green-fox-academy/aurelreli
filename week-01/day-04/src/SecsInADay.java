import com.sun.deploy.security.SelectableSecurityManager;

public class SecsInADay {
    public static void main(String[] args) {
        int h, m, s, marh, marm, mars;
        h=17;
        m=2;
        s=24;
        if ((m!=0) || (s!=0)){
            marm=60-m-1;

        }else{
            marm=60-m;
        }
        if ((m!=0) || (s!=0)){
            mars=60-s-1;

        }else{
            mars=60-s;
        }
        if ((m!=0) || (s!=0)){
            marh=60-h-1;

        }else{
            marh=60-h;
        }
        System.out.println(mars+(marm*60)+(marh*60*60));
    }
}
