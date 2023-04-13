public class Main {


    public static void main(String[] args) {
        Stack stack = new Stack();
        for (int i = 0; i < 12; i++) {
            stack.add(i + 1);
        }
        System.out.println(stack.toString());
        for (int i = 0; i < 7; i++) {
            stack.remove();
        }
        System.out.println(stack.toString());
        for (int i = 100; i < 103; i++) {
            stack.add(i + 1);
        }
        System.out.println(stack.toString());
        stack.remove();
        System.out.println(stack.toString());
    }
}
