public abstract class MyShape {
    protected int x,y ;

    protected MyShape(int x , int y){
        this.x=x;
        this.y=y;
    }

    public abstract  double caculateArea();

    public void move(int x2,int y2){
        x=x2;
        y=y2;
    }
    public String toString(){
        return "this is a shape";
    }
}
