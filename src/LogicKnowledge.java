public class LogicKnowledge {
    public static void main(String[] args) {

        System.out.println(greenTicket(1, 2, 3));
        System.out.println(greenTicket(1, 2, 1));
        System.out.println(greenTicket(1, 1, 1));
        System.out.println(greenTicket(2, 1, 1));
    }

    public static int greenTicket(int a, int b, int c) {
        if (a == b && b == c) {
            // So same
            return 20;
        } else if (a == b || b == c || a == c) {
            // Two are the same
            return 10;
        } else {
            // All different
            return 0;
        }
    }
}

