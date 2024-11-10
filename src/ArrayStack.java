import  java.util.Arrays;
import java.util.EmptyStackException;
//import  java.util.Stack;

public class ArrayStack <T>{
    private  static final  int DEFAULT_CAPACITY = 3;
    private  int top;
    private  T[] stack;
    public  ArrayStack(int size){
        top = 0;
        stack = (T[]) new Object[size];
    }
    public ArrayStack (){
        this(DEFAULT_CAPACITY);
    }

    //methods -- operations
   // size
    int size() {
        return top;
    }

    boolean isempty() {
        return top == 0;
    }

    //push
    void push(T element) {
        if (size() == stack.length)
            expandCapacity();

        stack[top] = element;
        top++;
//        return element;
    }

    //expand capacity
    private void expandCapacity() {
        stack = Arrays.copyOf(stack, stack.length * 2);
    }

    //peek
    T peek() {
        if (isempty()) {
            System.out.println("The stack is empty!");
            return null;
        }
        return stack[top - 1];
    }
    T pop() throws EmptyStackException {
        if (isempty()) {
            if (top == 0) ;
            throw new EmptyStackException();
        }

        top = top-1;  //top--;
        T result = stack[top];
        stack[top] = null;
        return result;
        }
    @Override
    public String toString() {
        return "ArrayStack{" +
                "top=" + top +
                ", stack=" + Arrays.toString(stack) +
                '}';
    }

    void display(){
        for(int i = 0; i < top; i++){
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        ArrayStack<String> names = new ArrayStack<String>(3);
        names.peek();  //-------------------------->
        names.push("osman");
        names.push("Farah");
        names.push("Hawa");
        names.push("Warsame");

        System.out.println("Removed element: " + names.pop());
        System.out.println("size: " + names.size());
        System.out.println("top: " + names.peek());
        System.out.println("empty: " + names.isempty());

        System.out.println(names.toString());
        names.display();







    }
}









