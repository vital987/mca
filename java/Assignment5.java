public class Assignment5 {
    public static void main(String[] args) {
        int sum=0, i;
        for(i=0; i<args.length; i++) {
            sum+=Integer.parseInt(args[i]);
        }
        System.out.println("Sum: " + sum);
    }
}

/* OUTPUT
$ java Assignment5_1 5 6 7 8 9
Sum: 35
*/