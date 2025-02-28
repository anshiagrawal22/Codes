// 1. create a student class attributes for name and age  Implement a default constructor to assign a default value and a parameterized constructors to initialize user define value .create abject using both constructors and show their values
class Student{
    String name;
    int age;
        public static void main(String[] args) {
        Student s1 = new Student(); // default constructor
        Student s2 = new Student("Anshi", 20); // parameterized constructor
        s1.display();
        s2.display();
    }
    Student() {
        this.name = "Default Name";
        this.age = 18;
    }   
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}