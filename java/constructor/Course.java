// 5. a student is developing a course registration system that allows student to enroll in the system . each student has a course name and course code . implement a course class with appropriate attributes and use this keyword to differentiate between class attributes and constructors parameters during initialization .create an object of course class and display course detail
class Course {
    String courseName;
    String courseCode;

    Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }
    void displayCourse() {
        System.out.println("Course Name: " + courseName + ", Course Code: " + courseCode);
    }
    public static void main(String[] args) {
        Course c1 = new Course("OOPs", "CSE203");
        c1.displayCourse();
    }
}
