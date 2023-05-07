public class AClass {
    public static void main(String[] args) {
//        AClass d = new AClass();
//        System.out.println("42 in octal is: ");
//        System.out.println(d.toOctal(42));
        // Test the gcd method with positive integers
        int a = 42;
        int b = 56;
        int expectedGcd = 14;
        int actualGcd = gcd(a, b);
        System.out.println("gcd(" + a + ", " + b + ") = " + actualGcd);

        // Test the gcd method with negative integers
        a = -21;
        b = 14;
        expectedGcd = 7;
        actualGcd = gcd(a, b);
        System.out.println("gcd(" + a + ", " + b + ") = " + actualGcd);

        // Test the gcd method with zero
        a = 0;
        b = 14;
        expectedGcd = 14;
        actualGcd = gcd(a, b);
        System.out.println("gcd(" + a + ", " + b + ") = " + actualGcd);

        // Test the lcm method with positive integers
        int num1 = 12;
        int num2 = 18;
        int expectedLcm = 36;
        int actualLcm = lcm(num1, num2);
        System.out.println("lcm(" + num1 + ", " + num2 + ") = " + actualLcm);

        // Test the lcm method with negative integers
        num1 = -15;
        num2 = -25;
        expectedLcm = 75;
        actualLcm = lcm(num1, num2);
        System.out.println("lcm(" + num1 + ", " + num2 + ") = " + actualLcm);

        // Test the lcm method with zero
        num1 = 0;
        num2 = 7;
        expectedLcm = 0;
        actualLcm = lcm(num1, num2);
        System.out.println("lcm(" + num1 + ", " + num2 + ") = " + actualLcm);
    }

    public String toBinary(int num) {
        if (num == 0) {
            return "";
        }
        String binary = "";
        int n = num;
        if (n % 2 == 0) {
            return toBinary(n / 2) + "0";
        } else {
            return toBinary(n / 2) + "1";
        }
    }

    public String toOctal(int num) {
        if (num == 0) {
            return "";
        }
        int n = num;
        return toOctal(n / 8) + n % 8;
    }

    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (b == 0) {
            return a;
        } else {
            int gcd = gcd(b, a % b);
            if (a < 0 && b < 0) {
                return -gcd;
            } else {
                return gcd;
            }
        }
    }

    public static int lcm(int a, int b) {
        int gcd = gcd(a, b);
        return (a * b) / gcd;
    }
}
