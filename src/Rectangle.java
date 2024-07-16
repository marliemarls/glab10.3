public class Rectangle extends Shape{
    public Rectangle(String color){

    }

    public Rectangle(){}

    public Rectangle(String color, double width, double height){
        super.height = height;
        super.width = width;
        super.color = color;
    }

    @Override
    public double getArea() {
        return super.width * super.height;
    }

     @Override
    public String toString(){
        return "Rectangle[height = " + height + ", width = " + width + "," + super.toString() + "]";
     }
}
