
class Calculator {
    public static void main(String[] args) {

        add(10, 15, 20);
        deduct(35, 15, 10);
        multiply(5, 10, 15);
        devide(100, 5, 2);
    }

    public static int add(int a, int b, int c) {
        int result = a + b + c;
        System.out.println(result);
        return result;
    }

    public static int deduct(int a, int b, int c) {
        int result = a - b - c;
        System.out.println(result);
        return result;
    }

    public static int multiply(int a, int b, int c) {
        int result = a * b * c;
        System.out.println(result);
        return result;
    }

    public static double devide(double a, double b, double c) {
        double result = a / b / c;
        System.out.println(result);
        return result;
    }

}

