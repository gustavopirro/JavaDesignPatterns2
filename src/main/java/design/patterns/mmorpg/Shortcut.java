package design.patterns.mmorpg;

public class Shortcut {

    private String hotkey;
    private InterfaceCommand command;

    public Shortcut(String hotkey){
        this.hotkey = hotkey;
    }

    public String getHotkey() {
        return this.hotkey;
    }

    public void setHotkey(String hotkey) {
        this.hotkey = hotkey;
    }

    public void setCommand(InterfaceCommand command) {
        this.command = command;
    }

    public void action(){
        if(command != null){
            this.command.execute();
        }
    }
}
