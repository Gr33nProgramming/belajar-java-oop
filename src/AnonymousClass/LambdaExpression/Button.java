package AnonymousClass.LambdaExpression;

interface Clickable{
    void onClick();
}
public class Button {
    private Clickable action;

    public void setAction(Clickable action) {
        this.action = action;
    }
    public void doClick(){
        action.onClick();
    }
}
