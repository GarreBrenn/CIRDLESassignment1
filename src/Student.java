import java.io.*;
import java.nio.*;
import java.util.*;

public class Student implements Comparable<Student>{
    private String fname = "Garrett";
    private String lname = "Brenner";
    private int cwid = 20131189;

    //Why do serialize and deserialize have to be static methods?
    //Furthermore, I can't use the line oneLine.append(fname, lname, cwid); if they're static
    public void serialize(String filename) {
        //serialize to csv using java.nio
        final String CSV_SEPARATOR = ",";
        try
        {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filename)));
            StringBuffer oneLine = new StringBuffer();
            oneLine.append("First Name,Last Name,CWID");
            bw.write(oneLine.toString());

            bw.newLine();

            oneLine = new StringBuffer();
            oneLine.append(fname);
            oneLine.append(CSV_SEPARATOR);
            oneLine.append(lname);
            oneLine.append(CSV_SEPARATOR);
            oneLine.append(cwid);
            bw.write(oneLine.toString());

            bw.flush();
            bw.close();
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
    }

    public void deserialize(String filename) {
        //deserialize to csv using java.util.nio
        try (Scanner scanner = new Scanner(new File(filename));
        ) {
            scanner.nextLine();
            String firstLine = scanner.nextLine();
            String[] firstLineArry = firstLine.split(",");
            fname = firstLineArry[0];
            lname = firstLineArry[1];
            cwid = Integer.parseInt(firstLineArry[2]);
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    public void printInfo() {
        System.out.println("First name: " + fname);
        System.out.println("Last name: " + lname);
        System.out.println("CWID: " + cwid);
    }

    private String getInfo() {
        String info = fname + lname + cwid;
        return info;
    }

    @Override
    public int compareTo(Student otherstud) {
        //-1 means they are not the same
        //1 means they are the same
        if (getInfo().equals(otherstud.getInfo())) {
            return 1;
        }
        else {
            return -1;
        }
    }

}
