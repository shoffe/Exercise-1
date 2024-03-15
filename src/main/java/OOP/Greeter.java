package OOP; // **Hello World with a Twist**:

public class Greeter {
    public static void main(String[] args) {
        Greeter g1 = new Greeter();
        g1.greet("Саша");
        g1.greet("Влад");
    }
   public static void greet(String name) {
       System.out.println("Hello, "+ name);
   }
}
