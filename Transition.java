public class Transition {
    private char inputChar;
    private char writtenChar;
    private String direction;
    private String nextState;

    public Transition(char inputChar, char writtenChar, String move, String nextState) {
        this.inputChar = inputChar;
        this.writtenChar = writtenChar;
        this.direction = move;
        this.nextState = nextState;
    }

    public char getInputChar() {
        return inputChar;
    }

    public char getWrittenChar() {
        return writtenChar;
    }

    public String getDirection() {
        return direction;
    }

    public String getNextState() {
        return nextState;
    }

}
