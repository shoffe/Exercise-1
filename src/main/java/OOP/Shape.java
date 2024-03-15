package OOP;

abstract class Shape {
    public abstract double calculateArea();
}

    class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    class Rectangle extends Shape {
        private double a;
        private double b;

        public Rectangle(double a, double b) {
            this.a = a;
            this.b = b;
        }
        public double calculateArea() {
            return a * b;
        }
    }

    class Square extends Shape {
    private double a;

    public Square(double a) {
        this.a = a;
    }
    public double calculateArea() {
        return a * a;
    }

        public static void main(String[] args) {
            Circle circle = new Circle(7);
            Rectangle rectangle = new Rectangle(3,4);
            Square square = new Square(6);

            System.out.println("Площадь круга, равна: " + circle.calculateArea());
            System.out.println("Площадь прямоугольника равна: " + rectangle.calculateArea());
            System.out.println("Площадь квадрта равна: " + square.calculateArea());
        }
    }
