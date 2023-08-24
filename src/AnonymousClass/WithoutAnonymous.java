package AnonymousClass;

interface Click{
    void Clickable();
}
public class WithoutAnonymous implements Click{
    private Click event;
    public void Clickable(){
        System.out.println("Tombol diClick ! ");
    }
   public void setEvent(Click event){
       this.event = event;

   }
   public void doEvent(){
       event.Clickable();
   }
}
