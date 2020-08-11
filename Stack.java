import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
// Student name: Oliver Costello
// Student id: 117333826
// CS3306 Repeat
import org.junit.Test;

// Student name: Oliver Costello
// Student id: 117333826
// CS3306 Repeat
public class Stack {
    private int stack1[];
    private int top_stack;
    private int length;

    public void stack(int size) {
        stack1 = new int[size];
        length = size;
        top_stack = -1;
    }

    // Pushes a new element onto the stack
    public void push(int new_elem) {
        stack1[++top_stack] = new_elem;
    }

    // Pops a new element onto the stack
    public int pop() {
        // Returns stack1 minus the top element
        return stack1[top_stack--];
    }

    public boolean isEmpty() {
        return (top_stack == -1);
    }
    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.stack(100);
        s1.push(5);
        s1.push(6);
        while (!s1.isEmpty()) {
            System.out.print(s1.pop());
        }
        // Tests the pop function
        s1.push(5);
        s1.push(6);
        s1.pop();
        s1.pop();
    }
}
