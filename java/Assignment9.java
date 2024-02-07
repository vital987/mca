public class Assignment9 {
    public static void main(String[] args) {
        String s1 = " Hello ", s2 = "World";

        System.out.println("s1 = 'Hello '\ts2 = 'World'");

        System.out.println("\nIndex of 'o' in s1: " + s1.indexOf('o'));

        System.out.println("\nCharacter at index 5 in s1: " + s1.charAt(5));

        System.out.println("\ns1 + s2: " + s1.concat(s2));

        System.out.println("\nReplace 'o' with 'x' in s1: " + s1.replace('o', 'x'));

        System.out.println("\nExtract substring from index 1 to index 3 from s1: " + s1.substring(1, 3));

        System.out.print("\nSplitting string s1 into a string array containing separate characters of s1: ");
        String[] s1_arr = s1.split("");
        for (String chr : s1_arr)
            System.out.print(chr);

        System.out.println("\n\nCompare s1 with s2: " + s1.compareTo(s2));

        System.out.println("\nStrip s1 from index 1 to index 3: " + s1.strip());
    }
}

/* OUTPUT
s1 = 'Hello '    s2 = 'World'

Index of 'o' in s1: 5

Character at index 5 in s1: o

s1 + s2:  Hello World

Replace 'o' with 'x' in s1:  Hellx 

Extract substring from index 1 to index 3 from s1: He

Splitting string s1 into a string array containing separate characters of s1:  Hello 

Compare s1 with s2: -55

Strip s1 from index 1 to index 3: Hello
*/