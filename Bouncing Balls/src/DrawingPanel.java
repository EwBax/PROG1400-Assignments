import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class DrawingPanel extends JPanel {

    private Timer timer = new Timer(10,  new TimerAction());

    private ArrayList<Ball> balls;

    public DrawingPanel() {

        balls = new ArrayList<>();

        balls.add(new Ball(50, 25, 25, -3, 2, Color.BLACK));
        balls.add(new Ball(50, 100, 100, 2, -3, Color.MAGENTA));
        balls.add(new Ball(50, 300, 215, -4, -1, Color.RED));
        balls.add(new Ball(50, 250, 350, -2, -3, Color.ORANGE));

        // Adding mouse event for when mouse pressed
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

                // Checking each ball to see if mouse was pressed inside bounds of ball then flip
                // ball direction
                for (Ball b: balls) {
                    if (b.getBounds().contains(e.getPoint())) {
                        b.flipDirection();
                    }
                }
            }
        });

        timer.start();

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Ball b: balls) {
            b.drawBall(g);
        }

    }


    public void moveBalls() {

        for (Ball b: balls) {
            b.moveBall();

            checkForWallCollision(b);
            checkForBallCollisions(b);
        }

        this.repaint();
    }


    public void checkForWallCollision(Ball ball) {

        // Right edge
        if ((ball.getxPosition() + ball.getSize()) >= this.getWidth()) {
            // making sure ball does not get stuck in wall and changing direction
            ball.setxPosition(this.getWidth() - ball.getSize() - 1);
            ball.moveWest();

        // Left Edge
        } else if (ball.getxPosition() <= 0) {
            ball.setxPosition(1);
            ball.moveEast();

        // Bottom Edge
        } else if ((ball.getyPosition() + ball.getSize()) >= this.getHeight()) {
            ball.setyPosition(this.getHeight() - ball.getSize() - 1);
            ball.moveNorth();

        // Top Edge
        } else if (ball.getyPosition() <= 0) {
            ball.setyPosition(1);
            ball.moveSouth();
        }

    }


    public void checkForBallCollisions(Ball ball1) {

        // Checking each ball in list
        for (Ball ball2: balls) {

            // Making sure it is not the current ball running this method
            if (!(ball1.equals(ball2))) {

                // Getting the center of each ball
                float[] ball1Center = ball1.getCenter();
                float[] ball2Center = ball2.getCenter();

                // Finding a and b sides of right triangle formed between two ball centers
                float xDiff = ball1Center[0] - ball2Center[0];
                float yDiff = ball1Center[1] - ball2Center[1];

                // Calculating distance between two ball centers using pythagorean theorem c =
                // sqrt(a^2 + b^2)
                double distance = Math.sqrt( Math.pow(xDiff, 2) + Math.pow(yDiff, 2) );

                // if distance is less than or equal to the two ball radii, they are touching
                if (distance <= ball1.getRadius() + ball2.getRadius()) {

                    // Figuring out which direction to redirect each ball

                    // ball1 east of ball2
                    if (ball1.getxPosition() > ball2.getxPosition()) {
                        ball1.moveEast();
                        ball2.moveWest();
                    } else {
                        ball1.moveWest();
                        ball2.moveEast();
                    }
                    // ball1 south of ball2
                    if (ball1.getyPosition() > ball2.getyPosition()) {
                        ball1.moveSouth();
                        ball2.moveNorth();
                    } else {
                        ball1.moveNorth();
                        ball2.moveSouth();
                    }
                }

            }

        }

    }


    private class TimerAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            moveBalls();
        }
    }
}
