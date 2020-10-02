package GitDay;

public class day2 {
    double width;
    double height;
    double getArea(){
        return width*height;
    }
}
class Examplel_2{
    public static void main(String[] args) {
        day2 rectangle;
        rectangle = new day2();
        rectangle.width = 1.819;
        rectangle.height = 1.5;
        double area = rectangle.getArea();
        System.out.println("矩形的面积："+area);
    }
}
