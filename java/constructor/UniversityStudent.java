 // 4. create a student class that has a static variable university name and a non static variable student name .include  a static method to display university. then create multiple student object to demonstrate how the static variable is shared among all instances , while the non - static variable holds unique value for each object
class UniversityStudent {
    static String university = "UPES";
    String studentName;

    UniversityStudent(String name) {
        this.studentName = name;
    }
    static void displayUniversity() {
        System.out.println("University: " + university);
    }

    void displayStudent() {
        System.out.println("Student Name: " + studentName);
    }

    public static void main(String[] args) {
        UniversityStudent s1 = new UniversityStudent("Anshi");
        UniversityStudent s2 = new UniversityStudent("Harsh");
        displayUniversity();
        s1.displayStudent();
        s2.displayStudent();
    }
}