package OOP1_19082023;

public class Rectangle {
    int length;
    int breadth;
    Point left = new Point();

    int getPerimeter(int length,int breadth)
    {
        return 2*(length+breadth);
    }
    Point getPoint(int length,int breadth)
    {
         Point left1 = left;
        left1.x+=length;
        left1.y-=breadth;

        return left1;
    }
}
