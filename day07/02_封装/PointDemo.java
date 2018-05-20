//点对象
class Point
{
    private int x;
    private int y;
    Point(int x,int y)
    {
        this.x = x;
        this.y = y;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }

}
//圆对象
class Circle
{
    private int r;
    Circle(int r)
    {
        this.r = r;
    }
    public int judge(Point p)
    {
        int xxyy = p.getX() * p.getX() + p.getY() * p.getY();
        int rr = r * r;
        if(xxyy > rr)
        {
            return 1;
        }
        else if(xxyy < rr)
        {
            return -1;
        }
        else
        {
            return 0;
        }

    }
}
public class PointDemo {
    public static void main(String[] args){
        Point p = new Point(3,4);//圆心坐标为(3,4)
        Circle c = new Circle(5);//圆半径为5
        int ret = c.judge(p);
        System.out.println(ret);
    }
}
