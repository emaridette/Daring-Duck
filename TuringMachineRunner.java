import java.util.ArrayList;
public class TuringMachineRunner {
    
    public static void main(String[] args) {
        
        Tape tape = new Tape("0101010");

        //State initState = createInitialState();
        //State endState = createEndState();

        // StateMachine stateMachine = new StateMachine(initState, tape);
        // stateMachine.machineRunner();

        System.out.println("Final Tape: " + tape);
        System.out.println("# of Ones: " + tape.oneCount());
    }


 
}