public class ThreeD extends TwoD{
    int z1;
    int x1;
    int y1;
    double dis;
    double n;
    public ThreeD(){
        System.out.println("ThreeD constructor");
    }
    public ThreeD(int x,int y,int z,int z1){
        super(x,y);
        this.z1=z1;
    }
    public void setZ1(int z1){
        this.z1=z1;
    }
    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }
 public void distance(TwoD a,ThreeD b){
       n=Math.pow((b.x1-a.x),2)+Math.pow((b.y1-a.y),2)+Math.pow((b.z1-a.z1),2);
       dis=Math.sqrt(n);
       System.out.println("the distance between three points are: "+dis);
 }

}
