import java.util.ArrayList;
public class StateMachine {
    
    private ArrayList<State> states = new ArrayList<>(); 
    private State currentState;
    private Tape tape;

    public StateMachine(State initialState, Tape tape) {
        currentState = initialState;
        this.tape = tape;
    }

    public void addState(State state) {
        states.add(state);
    }

    public void machineRunner() {
        while (!currentState.isFinal()) {
            char inputChar = tape.read().charAt(0);
            Transition transition = currentState.getTransition(inputChar);

            if (transition == null) {
                break;
            }

            tape.write(String.valueOf(transition.getWrittenChar()));

            if (transition.getDirection().equals("left")) {
                tape.left();
            }
            else if (transition.getDirection().equals("right")) {
                tape.right();
            }
            
            currentState = transition.getNextState();

            System.out.println(tape);
        }
    }

    public String getFinalState() {
        return currentState.getName();
    }

    public Tape getTape() {
        return tape;
    }
}