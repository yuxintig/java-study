package git;

import org.w3c.dom.css.Rect;

/**
 * @ClassName day5
 * @Description TODO
 * @Author 余欣婷
 * @Date 2020/10/10
 **/
public class day5 {
    double width;
    double height;
    double getArea(){
        return width * height;
    }
}

class a{
    public static void main(String[] args) {
        day5 rectangle;
        rectangle = new day5();
        rectangle.width = 1.819;
        rectangle.height = 1.5;
        double area = rectangle.getArea();
        System.out.println("矩形的面积："+area);


    }
}


