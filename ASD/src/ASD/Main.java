package ASD;

public class Main {
    public static void main(String[] args) {
        Stack stk = new Stack();

        stk.push("F");
        stk.push("I");
        stk.push("L");
        stk.push("K");
        stk.push("O");
        stk.push("M");
        
        stk.peek();
        stk.print();
        System.out.println(stk.pop());
    }
}
