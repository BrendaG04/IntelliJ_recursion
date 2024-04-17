//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
        A recursive algorithm uses itself to solve one or more smaller identical problems.
        Recursive methods implement recursive algorithms. A recursive method includes a call to itself.

         */


        int n = 4;
        System.out.println("The factorial of " + n + " = " + fact(n) + "\n");

        int x = 6;
        System.out.println("The fib of " + x + " = " + fib(x) + "\n");

        int j = 010000;
        System.out.println("In the number, " + j + ", there are " + numberofZeros(j) + " zeros");

        String s = "0001001210 ";
        System.out.println("In the string number " + s + ", there are " + zeroC(s) + " zeros");

        String d = "005324654;gmlvnsrutmg;oisauit'pmvsaiaism'gtfoisa'iret";
        System.out.println("In the string " + d + ", there are " + digitCounter(d) + " digits");

        String v = "1.4189";
        System.out.println("In the string " + v + ", there are " + decimalVal(v) + " decimal values");
    }

    //FACTORIAL EXAMPLE
    public static int fact(int n) {
        System.out.println("The current n value =" + n);
        if (n == 1)
            return 1;
        else {
            return n * fact(n - 1);
        }
    }

    //FIBONACCI EXAMPLE
    public static int fib(int x) {
        int fibo;
        if (x == 2 || x == 1)
            fibo = 1;
        else if (x > 2)
            fibo = fib(x - 1) + fib(x - 2);
        else
            fibo = 0;
        return fibo;

    }

    //COUNTING ZEROS WITH INT
    public static int numberofZeros(int j) {
        int zeroCount;
        if (j == 0)
            zeroCount = 1;
        else if (j < 10) //and not 0
            zeroCount = 0; //0 for no zeros
        else if (j % 10 == 0)
            zeroCount = numberofZeros(j / 10) + 1;
        else //n%10 !=0
            zeroCount = numberofZeros(j / 10);
        return zeroCount;
    }

    //COUNTING ZEROS WITH STRING
    public static int zeroC(String s) {
        if (s.length() == 0)
            return 0;
        else if (s.length() == 1) {
            if (s.charAt(0) == '0')
                return 1;
            else
                return 0;
        } else {
            if (s.charAt(0) == '0')
                return zeroC(s.substring(1, s.length())) + 1;
            else
                return zeroC(s.substring(1, s.length()));
        }

    }

    //COUNTING DIGITS WITH STRING
    public static int digitCounter(String d) {
        if (d.length() == 0)
            return 0;
        else if (d.length() == 1) {
            if (d.charAt(0) == '0' || d.charAt(0) == '1' || d.charAt(0) == '2' || d.charAt(0) == '3' || d.charAt(0) == '4' || d.charAt(0) == '5' || d.charAt(0) == '6' || d.charAt(0) == '7' || d.charAt(0) == '8' || d.charAt(0) == '9')
                return 1;
            else
                return 0;
        } else {
            if (d.charAt(0) == '0' || d.charAt(0) == '1' || d.charAt(0) == '2' || d.charAt(0) == '3' || d.charAt(0) == '4' || d.charAt(0) == '5' || d.charAt(0) == '6' || d.charAt(0) == '7' || d.charAt(0) == '8' || d.charAt(0) == '9')
                return digitCounter(d.substring(1, d.length())) + 1;
            else
                return digitCounter(d.substring(1, d.length()));
        }
    }

    //COUNTING DECIMAL VALUES WITH STRING
    public static int decimalVal(String v) {
        if (v.length() == 0)
            return 0;
        else if (v.charAt(0) >= '0' && v.charAt(0) <= '9') {
            return decimalVal(v.substring(1)) + 1;
        }
        else {
                return decimalVal(v.substring(1));
        }
    }

}