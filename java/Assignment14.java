class Outer {
    int x = 10;
    static int y = 20;

    class Inner {
        void display() {
            System.out.println("\nInner non-static:\nx = " + x + "\ny = " + y);
        }
    }

    static class InnerStatic {
        void display() {
            // System.out.println("x = " + x + "\ny = " + y); // x cannot be accessed cause it's non-static
            System.out.println("\nInner static:\ny = " + y);
        }
    }
}

public class Assignment14 {
    public static void main(String[] args) {
        Outer outerObj = new Outer();
        Outer.Inner innerObj = outerObj.new Inner();
        Outer.InnerStatic innerStaticObj = new Outer.InnerStatic();
        innerObj.display();
        innerStaticObj.display();
    }
}

/* OUTPUT

Inner non-static:
x = 10
y = 20

Inner static:
y = 20
*/