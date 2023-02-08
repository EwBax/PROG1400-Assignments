import java.awt.*;

public class Ball {

    // Ball Properties
    private int size;
    private int xPosition;
    private int yPosition;
    private int xSpeed;
    private int ySpeed;
    private Color ballColor;


    public Ball(int size, int xPosition, int yPosition, int xSpeed, int ySpeed, Color ballColor) {
        this.size = size;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.ballColor = ballColor;
    }


    public void drawBall(Graphics g) {

        // Setting the color
        g.setColor(ballColor);

        // Drawing the ball
        g.fillOval(xPosition, yPosition, size, size);

    }


    public void moveBall() {
        this.xPosition += xSpeed;
        this.yPosition += ySpeed;
    }

    public void flipDirection() {
        xSpeed *= -1;
        ySpeed *= -1;
    }

    public void moveNorth(){
        ySpeed = Math.abs(ySpeed) * -1;
    }

    public void moveSouth(){
        ySpeed = Math.abs(ySpeed);
    }

    public void moveWest(){
        xSpeed = Math.abs(xSpeed) * -1;
    }

    public void moveEast(){
        xSpeed = Math.abs(xSpeed);
    }

    // returns x and y positions of center of ball
    public float[] getCenter() {
        return new float[] {xPosition + getRadius(), yPosition + getRadius()};
    }

    public float getRadius() {
        return (float) size / 2;
    }

    public Rectangle getBounds() {
        return new Rectangle(xPosition, yPosition, size, size);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    public Color getBallColor() {
        return ballColor;
    }

    public void setBallColor(Color ballColor) {
        this.ballColor = ballColor;
    }
}
