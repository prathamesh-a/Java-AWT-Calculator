package components;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class appFrame {

    private final Frame frame;
    private Label label;
    private utils utils;

    public appFrame(){
        this.frame = new Frame("Calculator");
        this.utils = new utils();
        frameProperties();
        labelProperties();
        addButtons();
    }

    private void frameProperties(){
        this.frame.setVisible(true);
        this.frame.setSize(400, 540);
        this.frame.setLayout(null);
        this.frame.setFont(new Font(Font.SERIF, Font.BOLD, 20));
        this.frame.setBackground(Color.GRAY);
        this.frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }

    private void labelProperties(){
        this.label = new Label("");
        this.label.setBackground(Color.WHITE);
        this.label.setBounds(40, 80, 320, 50);
        this.frame.add(this.label);
    }

    private void addButtons(){
        new appButton("0", 40, 400, this.frame, this);
        new appButton("1", 40, 320, this.frame, this);
        new appButton("2", 120, 320, this.frame, this);
        new appButton("3", 200, 320, this.frame, this);
        new appButton("4", 40, 240, this.frame, this);
        new appButton("5", 120, 240, this.frame, this);
        new appButton("6", 200, 240, this.frame, this);
        new appButton("7", 40, 160, this.frame, this);
        new appButton("8", 120, 160, this.frame, this);
        new appButton("9", 200, 160, this.frame, this);
        new appButton(".", 120, 400, this.frame, this);

        new appButton("+", 280, 400, this.frame, this);
        new appButton("=", 200, 400, this.frame, this);
        new appButton("-", 280, 320, this.frame, this);
        new appButton("*", 280, 240, this.frame, this);
        new appButton("/", 280, 160, this.frame, this);


    }

    public void addLabel(String value){
        this.label.setText(label.getText() + value);
    }
    public void setLabel(String v){this.label.setText(v);}
    public String getLabel(){
        return label.getText();
    }
    public utils getUtils(){return this.utils;}


}
