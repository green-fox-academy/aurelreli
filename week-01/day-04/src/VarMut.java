public class VarMut {
    public static void main(String[] args) {
        int a, b, c, d, e, f1, f2, g1, g2, h, i1, i2, j;
        a=3;
        a=a+10;
        System.out.println("a: " + a);
        b=100;
        b=b-7;
        System.out.println("b: " + b);
        c=44;
        c=c*2;
        System.out.println("c: " + c);
        d=125;
        d=d/5;
        System.out.println("d: " + d);
        e=8;
        e=e*e*e;
        System.out.println("e: " + e);
        f1=123;
        f2=345;
        System.out.println("f: " + (f1>f2));
        g1=350;
        g2=200;
        System.out.println("g: " + ((g2*2)>g1));
        h=135798745;
        System.out.println("h: " + ((h%11)==0));
        i1=10;
        i2=3;
        System.out.println("i: " + ((i1>(i2*i2)) && (i1<i2*i2*i2)));
        j=1521;
        System.out.println("j: " + (((j%3)==0) || ((j%5)==0)));
    }
}
