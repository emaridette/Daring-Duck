import java.util.ArrayList;
public class StateMachine {
    
    private ArrayList<State> states = new ArrayList<>(); 
    private State currentState;
    private State haltState;
    private Tape tape;

    public StateMachine(State initialState, Tape tape) {
        currentState = initialState;
        this.tape = tape;
    }

    public void addState(State state) {
        states.add(state);
    }

    public void machineRunner() {
        int maxIterations = 50000000;
        int iterations = 0;

        //System.out.println(tape);

        while (!currentState.isFinal() && (iterations < maxIterations)) {
            char inputChar = tape.read();
            Transition transition = currentState.getTransition(inputChar);

            if (transition == null) {
                break;
            }

            //System.out.println(transition.toString());

            tape.write(transition.getWrittenChar());

            if (transition.getDirection().equals("left")) {
                tape.left();
                //System.out.println("LEFT");
            }
            else if (transition.getDirection().equals("right")) {
                tape.right();
                //System.out.println("RIGHT");
            }
            
            currentState = transition.getNextState();

            //System.out.println(tape);

            iterations++;
        }

        if (iterations >= maxIterations) {
          System.out.println("Max iterations reached. Terminating.");
        }
    }

    public State getFinalState() {
        return haltState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public Tape getTape() {
        return tape;
    }
}