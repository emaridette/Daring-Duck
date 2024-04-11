import java.util.List;

public class State {
    private String name;
    private List<Transition> transitions;
    private boolean isFinal;


    public State(String name, List<Transition> transitions, boolean isFinal) {
        this.name = name;
        this.transitions = transitions;
        this.isFinal = isFinal;
    }

    public String getName() {
        return name;
    }

    public Transition getTransition(char inputChar) {
        for (int i = 0; i < transitions.size(); i++) {
            if (transitions.get(i).getInputChar() == inputChar) {
                return transitions.get(i);
            }
        }

        return null;
    }

    public void addTransition(Transition transition) {
        transitions.add(transition);
    }

    public boolean isFinal() {
        return isFinal;
    }

    public String toString() {
        return name;
    }
}
