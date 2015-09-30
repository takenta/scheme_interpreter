public class Main {
    public static void main(String[] args) {
        while (true) {
            InOut inout = new InOut();
            String input = inout.input();
            if (input.equals("exit")) break;

            System.out.println(input);
        }
    }
}
