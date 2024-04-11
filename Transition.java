public class Transition {
    private char inputChar;
    private char writtenChar;
    private String direction;
    private State nextState;

    public Transition(char inputChar, char writtenChar, String move, State nextState) {
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

    public State getNextState() {
        return nextState;
    }

    public String toString() {
        String s = "" + inputChar + ", " + writtenChar + ", " + direction + " " + nextState.toString();
        return s;
    }

}
