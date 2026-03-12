interface calculator {
    void add();
    void sub();
    void mul();
    void div();
}

public class calc implements calculator {
    double a, b;

    public calc(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    public void add() {
        System.out.println("Addition: " + (a + b));
    }

    public void sub() {
        System.out.println("Subtraction: " + (a - b));
    }

    public void mul() {
        System.out.println("Multiplication: " + (a * b));
    }

    public void div() {
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Error: Division by zero");
        }
    }

    public static void main(String[] args) {
        calc c = new calc(5, 10);
        // Just call the methods; they handle the printing now
        c.add();
        c.sub();
        c.mul();
        c.div();
    }
}