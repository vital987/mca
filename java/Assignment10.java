class Assignment10 {
    Assignment10() {
        System.out.println("Default Constructor called.");
    }

    Assignment10(String name) {
        System.out.println("Parametrized constructor called with the name " + name + ".");
    }

    Assignment10(Assignment10 obj) {
        System.out.println("Copy constructor called.");
    }

    public static void main(String[] args) {
        new Assignment10();
        new Assignment10("Apurv");
        new Assignment10(new Assignment10("Shishir"));
    }
}

/* OUTPUT
Default Constructor called.
Parametrized constructor called with the name Apurv.
Parametrized constructor called with the name Shishir.
Copy constructor called.
*/