package AnonymousClass;

interface Clickable{
    void onClick();
}
public class Button{
    private Clickable action;
    void setAction(Clickable action){
        this.action = action;
    }
    void doClick(){
        action.onClick();
    }
}
