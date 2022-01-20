package design.patterns.mmorpg;

public class ReceptorSkill extends Receptor{

    @Override
    void processInformation(Object information) {
        System.out.println("Executing skill: " + information + "!!");
        
    }
    

}
