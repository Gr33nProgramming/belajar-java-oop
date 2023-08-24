package ThisSuperKeyword;

public class Super {
    private String superName;
    private Integer superId;
    void setSuper(String superName){
        this.superName = superName;
        System.out.println("Super " + superName);
    }
}
class InheritSuper extends Super{
    void setSuper(String superName){
        
    }
}
