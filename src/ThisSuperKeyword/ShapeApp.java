package ThisSuperKeyword;

public class ShapeApp {
    public static void main(String[] args) {
        Rectangle shape = new Rectangle();
        System.out.println(shape.getCorner());
        System.out.println(shape.getShapeCorner());
    }
}
class Shape{
    int getCorner(){
        System.out.println("getCorner Shape");
        return 1;
    }
}
class Rectangle extends Shape{
    int getCorner(){
        System.out.println("getCorner Rectangle");
        return 4;
    }
    int getShapeCorner(){
        return super.getCorner();
    }
}
