import java.util.ArrayList;
import java.util.List;

public class TuringMachineRunner {
    public static void main(String[] args) {
        
        List<Transition> transitionsQ0 = new ArrayList<>();
        State q0 = new State("q0", transitionsQ0, false);
    
        List<Transition> transitionsQ1 = new ArrayList<>();
        State q1 = new State("q1", transitionsQ1, false);
    
        List<Transition> transitionsQ2 = new ArrayList<>();
        State q2 = new State("q2", transitionsQ2, false);
    
        List<Transition> transitionsQ3 = new ArrayList<>();
        State q3 = new State("q3", transitionsQ3, false);
    
        List<Transition> transitionsQ4 = new ArrayList<>();
        State q4 = new State("q4", transitionsQ4, false);
    
        List<Transition> transitionsQ5 = new ArrayList<>();
        State q5 = new State("q5", transitionsQ5, true);
    
        // Define transitions
        Transition t01 = new Transition('1', '1', "right", q1);
        Transition t11 = new Transition('1', '1', "right", q1);
        Transition t00 = new Transition('0', '1', "left", q3);
        Transition t10 = new Transition('1', '1', "right", q2);
        Transition t20 = new Transition('1', '0', "right", q3);
        Transition t21 = new Transition('1', '1', "right", q3);
        Transition t22 = new Transition('1', '1', "right", q4);
        Transition t30 = new Transition('0', '1', "right", q4);
        Transition tEnd = new Transition('_', '_', "right", q5);
    
        transitionsQ0.add(t01);
        transitionsQ1.add(t11);
        transitionsQ1.add(t00);
        transitionsQ1.add(t10);
        transitionsQ2.add(t20);
        transitionsQ2.add(t21);
        transitionsQ3.add(t22);
        transitionsQ3.add(t30);
        transitionsQ4.add(tEnd);
        
        Tape tape = new Tape("1");
        StateMachine stateMachine = new StateMachine(q0, tape);

        stateMachine.machineRunner();
        System.out.println("Final Tape: " + tape);
        System.out.println("# of Ones: " + tape.oneCount());
    }
    
}