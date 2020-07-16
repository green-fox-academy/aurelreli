public class CodingHours {
    public static void main(String[] args) {
        int codeh, workd, workh, weeks, codingHours;
        double percentage;
        codeh=6;
        workd=5;
        weeks=17;
        workh=52;
        codingHours=codeh*(workd*weeks);
        System.out.println(codingHours + "coding hours");
        percentage=(weeks*workh)/codingHours + (weeks*workh%codingHours);
        System.out.println(percentage);
    }
}
