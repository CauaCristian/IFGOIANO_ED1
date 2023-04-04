import java.util.Stack;

public class Pilha {
    private Stack<Character> stack;

    public Pilha() {
        stack = new Stack<>();
    }

    public void push(char c) {
        stack.push(c);
    }

    public char pop() {
        return stack.pop();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}


