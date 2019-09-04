public class Driver {
    private String filename = "studentinfo.csv";

    public void run() {
        Student stud = new Student();

        print("stud serializing...");
        stud.serialize(filename);

        Student stud2 = new Student();

        print("stud2 deserializing...");
        stud2.deserialize(filename);

        print("comparing...");
        if (stud.compareTo(stud2) == 1) {
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
