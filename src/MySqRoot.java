public class MySqRoot {

    public static double squareRoot(double num) {
        double guess = num / 2;
        double nextGuess;
        do {
            nextGuess = 0.5 * (guess + num / guess);
            if (Math.abs(nextGuess - guess) < 0.0001) {
                break;
            }
            guess = nextGuess;
        } while (true);

        return nextGuess;
    }

    public static void main(String[] args) {
        double num = 4;
        double result = squareRoot(num);
        System.out.println("Square root of " + num + " is approximately: " + result);
    }
}
