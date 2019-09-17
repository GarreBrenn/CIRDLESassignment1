public class Driver {
    private String filename = "studentinfo.csv";

    public void run() {
        Student stud = new Student("Garrett","Brenner","20131189");

        print("stud serializing...");
        Student.serialize(stud, filename);

        print("stud2 deserializing...");
        Student stud2 = Student.deserialize(filename);

        print("comparing...");
        if (stud.compareTo(stud2) == 0) {
            print("The students are equal");
        }
        else {
            print("The students are not equal");
        }
    }

    private void print(String s) {
        System.out.println(s);
    }
}
