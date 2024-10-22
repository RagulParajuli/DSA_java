public class Stack_Main {
    public static void main(String[] args) {
        Stack num = new Stack();

        // adding element
        num.push(10);
        num.push(20);

        // taking element
        System.out.println(num.pop());

        num.push(30);
        num.push(40);
        num.push(50);

        // printing first element
        System.out.println(num.peek());
        

        num.printStack();
    }
}
class Stack{
    int []arr = new int[5];
    int top;
    int size;

    public Stack(){
        top = -1;
        size = arr.length;
    }

    public void push(int data){
        top++;
        if (top < size) {
            arr[top] = data;
        } else{
            System.out.println("Stack overflow");
        }
    }

    public int pop(){
        // return arr[top]; //returns element but doesn't delete element from stack
        if (top > -1) {
            return arr[top--]; //returns and delete element from stack
        } else{
            System.out.println("Stack UnderFlow");
        }
        return 0;
    }

    public int peek(){
        return arr[top];
    }

    public void printStack(){
        if (top>=0) {
            for (int n : arr) {
                System.out.print(n+" ");
            }
            System.out.println();
        } else{
            System.out.println("Stack is empty");
        }
    }
}