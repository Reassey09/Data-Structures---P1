public class StudentInfo {
    
    private int id;
    private String name;

    //Constructor for creating a new student record with no information parsed.
    StudentInfo() {
        name = " ";
        id = 0;
    }

    //Constructor for declaring and initialising a student record.
    StudentInfo(String newName, int newID) {
        name = newName;
        id = newID;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setID(int newID) {
        id = newID;
    }

    public void setName(String newName) {
        name = newName;
    }

}