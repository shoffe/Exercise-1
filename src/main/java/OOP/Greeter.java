package OOP; // **Hello World with a Twist**:

public class Greeter {
    public static void main(String[] args) {
        Greeter.greet("Саша");
        Greeter.greet("Влад");
    }
   public static void greet(String name) {
       System.out.println("Hello, " + name);
   }
}
