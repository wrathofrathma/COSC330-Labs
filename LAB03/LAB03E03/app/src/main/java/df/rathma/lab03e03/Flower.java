package df.rathma.lab03e03;

public class Flower {
    public final double GOLDEN_RATIO = 0.618033989;
    public final double GROW_HEIGHT = 0.03 * GOLDEN_RATIO;
    public final double GROW_WIDTH = 0.03 * GOLDEN_RATIO;

    private double angle;
    private int rotate;
    private float scaleX;
    private float scaleY;
    private int xCenter;
    private int yCenter;
    private float degenerate;

    public Flower(){
        rotate = 0;
        scaleX = (float) 0.2;
        scaleY = (float) 0.2;
        degenerate = (float) 1.001;
        angle = 360 * GOLDEN_RATIO;
    }
    public void add_flower(){
        scaleX += GROW_WIDTH;
        scaleY += GROW_HEIGHT;
        rotate+=angle;
    }
    public void reset(){
        rotate = 0;
        scaleX = (float) 0.2;
        scaleY = (float) 0.2;
    }
    public double getGOLDEN_RATIO() {
        return GOLDEN_RATIO;
    }

    public double getGROW_HEIGHT() {
        return GROW_HEIGHT;
    }

    public double getGROW_WIDTH() {
        return GROW_WIDTH;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public int getRotate() {
        return rotate;
    }

    public void setRotate(int rotate) {
        this.rotate = rotate;
    }

    public float getScaleX() {
        return scaleX;
    }

    public void setScaleX(float scaleX) {
        this.scaleX = scaleX;
    }

    public float getScaleY() {
        return scaleY;
    }

    public void setScaleY(float scaleY) {
        this.scaleY = scaleY;
    }

    public int getxCenter() {
        return xCenter;
    }

    public void setxCenter(int xCenter) {
        this.xCenter = xCenter;
    }

    public int getyCenter() {
        return yCenter;
    }

    public void setyCenter(int yCenter) {
        this.yCenter = yCenter;
    }

    public float getDegenerate() {
        return degenerate;
    }

    public void setDegenerate(float degenerate) {
        this.degenerate = degenerate;
    }
}
