//muna mohamud ali
//ID:C1220345
package Assigment;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class StackArray<T> {

        private static final int capacity = 2;
        private int top;
        private T[] stack;

        StackArray() {
            this(capacity);
        }

        StackArray(int size) {
            top = 0;
            stack = (T[]) new Object[size];
        }

        boolean Empty() {
            return top == 0;
        }

        int size() {
            return top;
        }

        void push(T element) {
            if (IFull()) {
                expand();
            }
            stack[top] = element;
            top++;
        }

        public void expand()

        {
            stack = Arrays.copyOf(stack, stack.length *2);{
            // stack = Array.copyOf(stack, stack.length * 2);{

        }
        }

        @Override
        public String toString() {
            return "StackArray{" +
                    "top=" + top +
                    ", stack=" + Arrays.toString(stack) + '}';
        }

        T peak() {
            if (Empty()) {
                return null;
            }
            return stack[top - 1];
        }

        T pop() {
            if (Empty()) {
                return null;
            }
            top--;
            T removed = stack[top];
            stack[top] = null;
            return removed;
        }

        boolean IFull() {
            return top == stack.length;
        }

        void display() {
            if (Empty()) {
                System.out.println("Is Empty");
            }
            for (int i = top - 1; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }

        private boolean contains(T element) {
            for (int i = 0; i < size(); i++) {
                if (stack[i] == element || (stack[i] != null && stack[i].equals(element))) {
                    return true;
                }
            }
            return false;
        }

        public void merge(StackArray<T> arr1, StackArray<T> arr2) {
            int newSize = arr1.size() + arr2.size();

            if (stack.length < newSize) {
                stack = Arrays.copyOf(stack, newSize);
            }

            for (int i = 0; i < arr1.size(); i++) {
                if (!contains(arr1.stack[i])) {
                    this.push(arr1.stack[i]);
                }
            }

            for (int i = 0; i < arr2.size(); i++) {
                if (!contains(arr2.stack[i])) {
                    this.push(arr2.stack[i]);
                }
            }
        }

        public static void main(String[] args) {
            StackArray<Integer> list1 = new StackArray<>(3);
            StackArray<Integer> list2 = new StackArray<>(4);
            StackArray<Integer> list3 = new StackArray<>();

            list1.push(1000);
            list1.push(80);
            list1.push(90);
            list1.push(2000);

            list2.push(700);
            list2.push(400);
            list2.push(600);
            list2.push(800);

            list3.merge(list1, list2);
            list3.display();
        }
    }

