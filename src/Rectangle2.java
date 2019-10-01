public class Rectangle2 {
    private double length;
    private double width;
    public void setDimensions(double x, double y){
        length=x;
        width=y;
    }
    public void getDimensions(){
        System.out.println("Length of the Rectangle: " +length);
        System.out.println("Width of the Rectangle: " +width);
    }
}
