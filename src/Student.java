public class Student {
    private String fname = "Garrett";
    private String lname = "Brenner";
    private int cwid = 20131189;

    public static void serialize() {
        //serialize to csv using java.util.nio
    }

    public static void deserialize() {}

    public void printinfo() {
        System.out.println("First name: " + fname);
        System.out.println("Last name: " + lname);
        System.out.println("CWID: " + cwid);
    }
}
