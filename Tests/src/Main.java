
/**
 *
 * @author monde
 */
public class Main {
    // Static method

    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    static void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    static void getSuma() {
        System.out.println("Suma");
    }
    static int getSuma1(int a, int b) {
        myPublicMethod();
        return a+b;
    }

    // Main method
    public static void main(String[] args) {
        myStaticMethod(); // Call the static method
        Main.myPublicMethod(); //This would output an error

        Main myObj = new Main(); // Create an object of Main
        myObj.myPublicMethod(); // Call the public method

        System.out.println(getSuma1(3, 9));
        myObj.getSuma();
        getSuma();

    }
}
