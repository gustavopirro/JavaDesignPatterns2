package design.patterns.mmorpg;

public class ShortcutCommand implements InterfaceCommand {
    
    private Receptor receptor;
    private Object information;

    public ShortcutCommand(Receptor receptor, Object information){
        this.receptor = receptor;
        this.information = information;
    }

    @Override
    public void execute() {
        this.receptor.processInformation(information);
    }

}
