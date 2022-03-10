import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        StudentInfo studentDataBase[] = new StudentInfo[7000];
        System.out.println("Reading the entire CSV");

        readFile(studentDataBase);
        SortStudents.bubbleSort(studentDataBase);
        writeToFile("BubbleSortedStudents.csv", studentDataBase);

        readFile(studentDataBase);
        SortStudents.insertionSort(studentDataBase);
        writeToFile("InsertSortedStudents.csv", studentDataBase);

        readFile(studentDataBase);
        SortStudents.selectionSort(studentDataBase);
        writeToFile("SelectionSortedStudents.csv", studentDataBase);
        
        return;
    }

    public static void writeToFile(String filename, StudentInfo[] students){
        FileOutputStream fileStrm = null;
        PrintWriter pw;

        try {
        fileStrm = new FileOutputStream(filename);
        pw = new PrintWriter(fileStrm);
        
        for(int ii = 0; ii < students.length; ii++)
            pw.println(students[ii].getName() + "," + students[ii].getID());

        pw.close();
        }
        catch (IOException ex) {
            System.out.println("Error in writing to file: " + ex.getMessage());
        }    
    }

    public static void printArr(int[] arr){
        System.out.println(arr[0]);
        for(int ii = 1; ii < arr.length; ii++) {
            System.out.println(arr[ii]);
        }
    }

    public static void printDB(StudentInfo[] studentDB) {
        for(int ii = 0; ii < studentDB.length; ii++) {
            System.out.print("Name: " + studentDB[ii].getName());
            System.out.println("[" + studentDB[ii].getID() + "]");
        }
    }

    public static void readFile(StudentInfo[] studentDB)
    {
        FileInputStream input = null;
        try {
            input = new FileInputStream("RandomNames7000.csv"); //open file
            InputStreamReader read = new InputStreamReader(input); //create a input stream reader
            BufferedReader buffer = new BufferedReader(read); //buffer so program can read 1 line at a time
            
            int lineNum = 0;
            String line = buffer.readLine();
            while(line != null)
            {
                studentDB[lineNum] = parseStudent(line);
                lineNum++;
                line = buffer.readLine();
            }
            input.close();
        }
        catch(IOException ee)
        {
            if(input != null){
                try{ input.close(); } catch(IOException ex2) {}
            }
            System.out.println("Error in file processing: " + ee.getMessage());
        }
    }

    public static StudentInfo parseStudent(String studentRec) {
        String thisToken = null;
        StringTokenizer strTok;
        StudentInfo newStudent = new StudentInfo();
        
        strTok = new StringTokenizer(studentRec, ",");

        thisToken = strTok.nextToken();
        try{ newStudent.setID(Integer.parseInt(thisToken)); }
        catch (NumberFormatException ee) { ee.printStackTrace(); }

        thisToken = strTok.nextToken();
        newStudent.setName(thisToken);
        
        return newStudent;
    }
}