package pkg1;

public class Calculator {
    float n1, n2;
    char operator;

    public Calculator(float n1, float n2, char operator) {
        this.n1 = n1;
        this.n2 = n2;
        this.operator = operator;
    }

    public float calculate() {
        switch (operator) {
            case '+':
                return n1 + n2;
            case '-':
                return n1 - n2;
            case '*':
                return n1 * n2;
            case '/':
                return n1 / n2;
            default:
                throw new IllegalArgumentException("Unsupported operator, must be +, -, * or /");
        }
    }
}
