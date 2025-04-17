package Polymorphism_Exercises.Word_04;

public class Initialization {
    
    public static CommandInterface buildCommandInterface(StringBuilder text) {
        CommandInterface commandInterface = new CommandImpl(text);
        commandInterface.init();
        return commandInterface;
    }
    
}
