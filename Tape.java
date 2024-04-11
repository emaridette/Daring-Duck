public class Tape {
    private int oneCount = 0;
    private String tape;
    private int pos;
    
    public Tape(String input) {
        this.tape = input;
    }

    public void left() {
        if (pos == 0) {
            tape = "." + tape;
        } else {
            pos--;
        }
    }

    public void right() {
        if (pos == tape.length() - 1) {
            tape += ".";
        }
        pos++;
    }

    public char read() {
        return tape.charAt(pos);
    } 

    public void write(char newChar) {
        if (read() == '1') {
            oneCount--;
        }
        if (newChar == '1') {
            oneCount++;
        }
    
        StringBuilder t = new StringBuilder(tape);
        t.setCharAt(pos, newChar);
        tape = t.toString();
    }

    public String toString() {
        return tape;
    }

    public int oneCount() {
        return oneCount;
    }

}
