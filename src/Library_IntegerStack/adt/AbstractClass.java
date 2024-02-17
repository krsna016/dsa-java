package Library_IntegerStack.adt;

import Library_IntegerStack.node.Node;

public interface AbstractClass {
    public void push(int value);
    public int pop();
    public int peek();
    public int getSize();
    public boolean isUnderflow(); // Same as 'isEmpty'
    public void clear();
    public void print();
}
