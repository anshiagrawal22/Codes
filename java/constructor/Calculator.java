 // 3. create a calculator class that contains a method add() to perform addition overload the add method to handel different types and number of parameters  such as adding two integers ,two doubles and three integers .create an object of the class and demonstratc all method variation
class Calculator {
    int add (int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of two integers: " + calc.add(2, 40));
        System.out.println("Sum of two doubles: " + calc.add(3.5, 60.2));
        System.out.println("Sum of three integers: " + calc.add(2, 3, 4));
    }
}
