import java.util.ArrayList;

public class TuringMachineRunner {
    public static void main(String[] args) {

        Tape tape = new Tape("H000000000000000X");

        ArrayList<Transition> transitions1 = new ArrayList<>();
        ArrayList<Transition> transitions2 = new ArrayList<>();
        ArrayList<Transition> transitions3 = new ArrayList<>();
        ArrayList<Transition> transitions4 = new ArrayList<>();
        ArrayList<Transition> transitions5 = new ArrayList<>();
        ArrayList<Transition> transitions6 = new ArrayList<>();
        ArrayList<Transition> transitions7 = new ArrayList<>();

        State q0 = new State("q0", transitions1, false);
        State q1 = new State("q1", transitions2, false);
        State q2 = new State("q2", transitions3, false);
        State q3 = new State("q3", transitions4, false);
        State q4 = new State("q4", transitions5, false);
        State q5 = new State("q5", transitions6, false);
        State q6 = new State("qend", transitions7, true);

        transitions1.add(new Transition('0', '0', "right", q0));
        transitions1.add(new Transition('1', '1', "right", q0));
        transitions1.add(new Transition('X', 'X', "right", q0));
        transitions1.add(new Transition('H', 'H', "right", q0));
        transitions1.add(new Transition('.', '1', "left", q1));

        transitions2.add(new Transition('0', '0', "left", q1));
        transitions2.add(new Transition('1', '1', "left", q1));
        transitions2.add(new Transition('H', 'H', "left", q1));
        transitions2.add(new Transition('X', 'X', "left", q2));

        transitions3.add(new Transition('0', '1', "right", q0));
        transitions3.add(new Transition('1', '1', "left", q3));

        transitions4.add(new Transition('0', '0', "right", q4));
        transitions4.add(new Transition('1', '1', "left", q3));
        transitions4.add(new Transition('H', 'H', "right", q6));

        transitions5.add(new Transition('0', '0', "right", q4));
        transitions5.add(new Transition('1', '1', "right", q4));
        transitions5.add(new Transition('H', 'H', "right", q4));
        transitions5.add(new Transition('X', 'X', "left", q5));

        transitions6.add(new Transition('1', '0', "left", q5));
        transitions6.add(new Transition('0', '1', "right", q0));

        StateMachine stateMachine = new StateMachine(q0, tape);
        stateMachine.machineRunner();

        System.out.println("Final Tape: " + tape.toString());
        System.out.println("# of Ones: " + tape.oneCount());

    }

    
    
}