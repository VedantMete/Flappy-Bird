import javax.swing.*;

public class App {
    public static void main(String[] args) {
        int boardWidth = 360;
        int boardHeight = 640;

        JFrame frame = new JFrame("Flappy Bird");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);


        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);

        frame.pack();
        flappyBird.requestFocus();

        frame.setVisible(true);
    }
}
