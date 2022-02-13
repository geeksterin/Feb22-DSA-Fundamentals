import java.util.*;

class Node {
        int val;
        int min;
          
        Node(int val, int min) {
            this.val = val;
            this.min = min;
        }
}

class myStack{
    Stack<Node> stk = new Stack<>();

    public void push(int x){
        if(x < stk.top().min){
            Node n = new Node(x,x);
            stk.push(n);
        } 
        else{
            Node n = new Node(x,stk.top().min);
            stk.push(n);
        }
    }

    public void pop(){
        stk.pop();
    }

    public int getMin(){
        return stk.top().min;
    }
}

public class MinStack{
    public static void main(String[] args) {
        myStack ss = new myStack();
        ss.push(10);
        ss.push(20);
        ss.push(-1);
        ss.push(100);
        System.out.println("-----------");
        System.out.println(ss.getMin());
    }
}