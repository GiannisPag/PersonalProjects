import javax.swing.*;

public class ShowWindow {
    
    public static void main(String[] args) {
        
        final int WINDOW_WIDTH = 19;
        final int WINDOW_HEIGHT = 300;

        JFrame window = new JFrame();
        window.setTitle("A Simple Window");
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setVisible(true);
    }
}
