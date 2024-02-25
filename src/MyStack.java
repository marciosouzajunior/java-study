
public class MyStack {

    private int [] elements = new int[100];
    private int topIndex = 0;

    public void push(int value){
        elements[topIndex] = value;
        topIndex++;
    }

    public int pop(){
        topIndex--;
        return elements[topIndex];
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        int value = myStack.pop();
        System.out.println("Value is " + value);
        value = myStack.pop();
        System.out.println("Value is " + value);
        value = myStack.pop();
        System.out.println("Value is " + value);
    }

}
