public class CodingHours {
    public static void main(String[] args) {
        int codeh, workd, workh, weeks, here;
        float percentage, codingHours;
        codeh=6;
        workd=5;
        weeks=17;
        workh=52;
        codingHours=codeh*(workd*weeks);
        System.out.println(codingHours + " coding hours");
        here=(weeks*workh);
       // System.out.println(here);
        percentage=(codingHours/here)*100;   //elég az egyiknek floatnak lennie, két integerrel nem működik!
        System.out.println(percentage + "%");
    }
}
