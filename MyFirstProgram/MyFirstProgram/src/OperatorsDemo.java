public class OperatorsDemo {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 5;
        System.out.println("Addition: " + (a + b));          // 15
        System.out.println("Subtraction: " + (a - b));       // 5
        System.out.println("Multiplication: " + (a * b));    // 50
        System.out.println("Division: " + (a / b));          // 2
        System.out.println("Modulus: " + (a % b));           // 0

        // Relational Operators
        System.out.println("Equal to: " + (a == b));         // false
        System.out.println("Not equal to: " + (a != b));     // true
        System.out.println("Greater than: " + (a > b));      // true
        System.out.println("Less than: " + (a < b));         // false
        System.out.println("Greater than or equal to: " + (a >= b)); // true
        System.out.println("Less than or equal to: " + (a <= b));    // false

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("Logical AND: " + (x && y));      // false
        System.out.println("Logical OR: " + (x || y));       // true
        System.out.println("Logical NOT: " + (!x));          // false

        // Bitwise Operators
        int c = 4;  // 0100 in binary
        int d = 6;  // 0110 in binary
        System.out.println("Bitwise AND: " + (c & d));       // 0100 (4)
        System.out.println("Bitwise OR: " + (c | d));        // 0110 (6)
        System.out.println("Bitwise XOR: " + (c ^ d));       // 0010 (2)
        System.out.println("Bitwise NOT: " + (~c));          // 1011 (-5 in 2's complement form)

        // Shift Operators
        System.out.println("Left shift: " + (c << 1));       // 1000 (8)
        System.out.println("Right shift: " + (d >> 1));      // 0011 (3)
        System.out.println("Unsigned right shift: " + (d >>> 1)); // 0011 (3)

        // Assignment Operators
        int e = 10;
        e += 5;  // e = e + 5
        System.out.println("Add and assign: " + e);          // 15
        e -= 3;  // e = e - 3
        System.out.println("Subtract and assign: " + e);     // 12
        e *= 2;  // e = e * 2
        System.out.println("Multiply and assign: " + e);     // 24
        e /= 4;  // e = e / 4
        System.out.println("Divide and assign: " + e);       // 6
        e %= 4;  // e = e % 4
        System.out.println("Modulus and assign: " + e);      // 2

        // Unary Operators
        int f = 10;
        System.out.println("Unary plus: " + (+f));           // 10
        System.out.println("Unary minus: " + (-f));          // -10
        System.out.println("Increment: " + (++f));           // 11
        System.out.println("Decrement: " + (--f));           // 10

        // Ternary Operator
        int age = 18;
        String eligibility = (age >= 18) ? "Eligible" : "Not Eligible";
        System.out.println("Ternary Operator: " + eligibility); // Eligible

        // Instanceof Operator
        String str = "Hello, World!";
        boolean result = str instanceof String;
        System.out.println("Instanceof Operator: " + result); // true
    }
}
