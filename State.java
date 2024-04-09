import java.util.List;

public class State {
    private String name;
    private List<Transition> transitions;
    private boolean isTerminal;


    public State(String name, List<Transition> transitions, boolean isTerminal) {
        this.name = name;
        this.transitions = transitions;
        this.isTerminal = isTerminal;
    }

    public String getName() {
        return name;
    }

    public Transition getTransition(char inputChar) {
        return transitions.get(inputChar);
    }

    public void addTransition(Transition transition) {
        transitions.add(transition);
    }

    public boolean isTerminal() {
        return isTerminal;
    }
}
