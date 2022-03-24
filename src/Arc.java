import java.awt.Graphics;
public class Arc extends Shape{
    private int startAng;
    private int endAng;

    public Arc(){
        super();
        this.startAng = 45;
        this.endAng = 35;
    }

    public void draw(Graphics g){
        g.drawArc(getMinX(),getMinY(),getWidth(),getHeight(),startAng,endAng);
    }
}
