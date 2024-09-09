public class Reduce {
    public static void main(String[] args) {
        Simplify_it(100);
    }

    private static void Simplify_it(int Start) {
        int steps = 0;
        int Current = Start;
        while (Current != 0) {
            if (Current % 2 == 0) {
                Current = Current / 2;
                steps++;
            }
            else {
                Current = Current - 1;
                steps++;
            }
        }
        System.out.println(steps);
    }
}
