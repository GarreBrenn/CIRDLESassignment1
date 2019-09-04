public class Driver {
    private String filename = "studentinfo.csv";

    public void run() {
        Student stud = new Student();
        stud.serialize(filename);
        // stud.deserialize(filename);
    }
}
