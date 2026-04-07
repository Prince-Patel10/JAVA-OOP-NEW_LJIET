public class gc3_student<T> {
    T a, b, c;

    public gc3_student(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void getstudent() {
        System.out.println("Roll no: " + a);
        System.out.println("Name: " + b);
        System.out.println("Marks: " + c);
    }
}

class gc3_faculty<T> extends gc3_student<T> {
    T d, e, f;

    // Faculty needs to provide values for itself AND the student parent
    public gc3_faculty(T a, T b, T c, T d, T e, T f) {
        super(a, b, c); // Initializes the student part
        this.d = d;
        this.e = e;
        this.f = f;
    }

    void getfaculty() {
        System.out.println("Faculty id: " + d);
        System.out.println("Name: " + e);
        System.out.println("Subject: " + f);
    }

    public static void main(String[] args) {
        gc3_student<Object> g = new gc3_student<>(5, "Prince", 40);
        g.getstudent();

        System.out.println(" ");

    
        gc3_faculty<Object> g1 = new gc3_faculty<>(5, "Prince", 40, 1, "Prit", "Java");
        g1.getfaculty();
    }
}
