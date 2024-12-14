package hw;

public class Math {
    public static int factorial(int number) {
        if(number == 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }

    public static int permutation(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    public static int combination(int n, int r) {
        return permutation(n, r) / factorial(r);
    }
}

