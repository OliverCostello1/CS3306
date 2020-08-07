import org.junit.Test;

// Student name: Oliver Costello
// Student id: 117333826
// CS3306 Repeat
public class Stack {
    private int stack1[];
    private int top_stack;
    private int length;
    public void stack (int size){
        stack1 = new int [size];
        length = size;
        top_stack = -1;
    }
    // Pushes a new element onto the stack
    public void push(int new_elem){
        stack1[++top_stack] = new_elem;
    }
    // Pops a new element onto the stack
    public int pop(){
        // Returns stack1 minus the top element
        return stack1[top_stack--];
    }
    // Unit Test to test the implementation of the push function
    @Test
    public void testPush() {

    }
    @Test
    public void testPop() {

    }
}
