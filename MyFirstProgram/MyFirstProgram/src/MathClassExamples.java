public class MathClassExamples {
    public static void main(String[] args) {
        // Constants
        System.out.println("PI: " + Math.PI);
        System.out.println("E: " + Math.E);

        // Basic methods
        System.out.println("Absolute value of -5: " + Math.abs(-5));
        System.out.println("Maximum of 10 and 20: " + Math.max(10, 20));
        System.out.println("Minimum of 10 and 20: " + Math.min(10, 20));
        System.out.println("Square root of 16: " + Math.sqrt(16));
        System.out.println("Cube root of 27: " + Math.cbrt(27));
        System.out.println("Exponential (e^1): " + Math.exp(1));
        System.out.println("Natural logarithm of E: " + Math.log(Math.E));
        System.out.println("Base 10 logarithm of 100: " + Math.log10(100));
        System.out.println("e^x - 1 for x=1: " + Math.expm1(1));
        System.out.println("log(x + 1) for x=1: " + Math.log1p(1));
        System.out.println("Ceiling of 2.3: " + Math.ceil(2.3));
        System.out.println("Floor of 2.7: " + Math.floor(2.7));
        System.out.println("Round 2.5: " + Math.round(2.5));
        System.out.println("Round 2.4: " + Math.round(2.4));
        System.out.println("Rint 2.5: " + Math.rint(2.5));
        System.out.println("Signum of -5: " + Math.signum(-5));
        System.out.println("Power (2^3): " + Math.pow(2, 3));
        System.out.println("Hypotenuse (3, 4): " + Math.hypot(3, 4));

        // Trigonometric methods
        System.out.println("Sine of 0: " + Math.sin(0));
        System.out.println("Cosine of 0: " + Math.cos(0));
        System.out.println("Tangent of 0: " + Math.tan(0));
        System.out.println("Arcsine of 0: " + Math.asin(0));
        System.out.println("Arccosine of 0: " + Math.acos(0));
        System.out.println("Arctangent of 0: " + Math.atan(0));
        System.out.println("Arctangent of 1 (atan2): " + Math.atan2(1, 1));
        System.out.println("Hyperbolic sine of 0: " + Math.sinh(0));
        System.out.println("Hyperbolic cosine of 0: " + Math.cosh(0));
        System.out.println("Hyperbolic tangent of 0: " + Math.tanh(0));

        // Other methods
        System.out.println("Random number: " + Math.random());
        System.out.println("To radians (180 degrees): " + Math.toRadians(180));
        System.out.println("To degrees (PI radians): " + Math.toDegrees(Math.PI));
        System.out.println("Ulps of 1.0: " + Math.ulp(1.0));
        System.out.println("Next after 1.0 towards 2.0: " + Math.nextAfter(1.0, 2.0));
        System.out.println("Next up from 1.0: " + Math.nextUp(1.0));
        System.out.println("Next down from 1.0: " + Math.nextDown(1.0));
        System.out.println("Copy sign from -3 to 4: " + Math.copySign(4, -3));
        System.out.println("IEEE remainder of 5 / 2: " + Math.IEEEremainder(5, 2));
        System.out.println("Exact add 2 + 3: " + Math.addExact(2, 3));
        System.out.println("Exact subtract 5 - 3: " + Math.subtractExact(5, 3));
        System.out.println("Exact multiply 2 * 3: " + Math.multiplyExact(2, 3));
        System.out.println("Exact increment 5: " + Math.incrementExact(5));
        System.out.println("Exact decrement 5: " + Math.decrementExact(5));
        System.out.println("Exact negate -5: " + Math.negateExact(-5));
        System.out.println("Floor division 7 / 2: " + Math.floorDiv(7, 2));
        System.out.println("Floor modulus 7 % 2: " + Math.floorMod(7, 2));
        System.out.println("Sum of 3 and 4: " + Math.addExact(3, 4));
        System.out.println("Subtract 4 from 10: " + Math.subtractExact(10, 4));
        System.out.println("Multiply 3 and 5: " + Math.multiplyExact(3, 5));
    }
}
