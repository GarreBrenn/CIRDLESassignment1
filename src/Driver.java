public class Driver {
    private String filename = "studentinfo.csv";

    public void run() {
        Student stud = new Student("Garrett","Brenner","20131189");

        print("stud serializing...");
        try {
            Student.serialize(stud, filename);
        }
        catch (UnsupportedEncodingException e) {
            System.out.print(e);
        }
        catch (FileNotFoundException e){
            System.out.print(e);
        }
        catch (IOException e){
            System.out.print(e);
        }

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
