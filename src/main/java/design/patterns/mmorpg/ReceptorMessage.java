package design.patterns.mmorpg;

public class ReceptorMessage extends Receptor{

    @Override
    void processInformation(Object information) {
        System.out.println("Player said: " + information);   
    }
    
}
