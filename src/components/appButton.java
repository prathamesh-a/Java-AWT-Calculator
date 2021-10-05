package components;

import java.awt.*;
import java.awt.event.ActionListener;

public class appButton{

    private final Frame frame;
    private final String label;
    private final int x;
    private final int y;
    private final appFrame appFrame;
    private Button button;

    public appButton(String label, int x, int y, Frame frame, appFrame appFrame) {
        this.frame = frame;
        this.label = label;
        this.x = x;
        this.y = y;
        this.appFrame = appFrame;
        addNumericButton();
    }

    private void addNumericButton(){
        this.button = new Button(this.label);
        button.setBounds(this.x, this.y, 70, 70);
        button.setBackground(Color.LIGHT_GRAY);
        button.setFont(new Font(Font.SERIF, Font.BOLD, 60));
        button.addActionListener(new listener(this, this.appFrame));

        this.frame.add(button);
    }

    public String getName(){
        return this.label;
    }
    public appButton setSize(int h, int w){
        this.button.setBounds(this.x, this.y, w, h);
        return this;
    }

}
