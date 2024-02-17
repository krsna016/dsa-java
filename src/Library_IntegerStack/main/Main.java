package Library_IntegerStack.main;
import Library_IntegerStack.stack.IntegerListStack;
import Library_IntegerStack.stack.IntegerArrayStack;
public class Main {
    public static void main(String[] args) {
        // ArrayStack using LinkedList:
        IntegerListStack listStack = new IntegerListStack();
        listStack.push(1);
        listStack.push(2);
        listStack.push(3);
        listStack.push(4);
        listStack.push(5);

        listStack.peek();

        listStack.pop();
        listStack.pop();
        listStack.pop();
        listStack.pop();
        listStack.pop();

        listStack.push(1);
        listStack.push(2);
        listStack.push(3);
        listStack.push(4);
        listStack.push(5);

        listStack.print();
        listStack.clear();
        System.out.println("The size is : "+listStack.getSize());
        System.out.println("IsEmpty : "+listStack.isUnderflow());


        // ArrayStack using Array:
        IntegerArrayStack arrayStack = new IntegerArrayStack(5);
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);
        arrayStack.push(5);

        arrayStack.peek();

        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();

        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);
        arrayStack.push(5);

        arrayStack.print();
        arrayStack.clear();
        System.out.println("The size is : "+arrayStack.getSize());
        System.out.println("IsEmpty : "+arrayStack.isUnderflow());
    }
}