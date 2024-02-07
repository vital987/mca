def calc(n1, n2, op):
    match op:
        case "+":
            return n1+n2
        case "-":
            return n1-n2
        case "*":
            return n1*n2
        case "/":
            return n1/n2
        case _:
            return 0
