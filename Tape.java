import java.util.Stack;

public class Tape {
    private Stack<String> leftStack = new Stack<>();
    private Stack<String> rightStack = new Stack<>();
    private String currentChar;
    private int oneCount = 0;
    
    public Tape(String input) {
        for (int i = input.length() - 1; i >= 0; i--) {
            rightStack.push(input.substring(i, i + 1));
        }
        if (rightStack.empty()) {
            currentChar = ".";
        } 
        else {
            currentChar = rightStack.pop();
        }
    }

    public void left() {
        rightStack.push(currentChar);

        if (leftStack.empty()) {
            currentChar = ".";
        } 
        else {
            currentChar = leftStack.pop();
        }
    }

    public void right() {
        leftStack.push(currentChar);

        if (rightStack.empty()) {
            currentChar = ".";
        } 
        else {
            currentChar = rightStack.pop();
        }
    }

    public String read() {
        return currentChar;
    } 

    public void write(String newString) {
        if (currentChar.equals("1")) {
            oneCount--;
        } else if (newString.equals("1")) {
            oneCount++;
        }
    
        currentChar = newString;
    }

    public String toString() {
        String toPrint = "";

        for (String str : leftStack) {
            toPrint = str + " " + toPrint;
        }

        toPrint = toPrint + " " + currentChar;

        for (String str : rightStack) {
            toPrint = toPrint + " " + str;
        }

        return toPrint;
    }

    public int oneCount() {
        return oneCount;
    }

}
