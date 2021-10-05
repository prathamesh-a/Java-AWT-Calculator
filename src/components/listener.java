package components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class listener implements ActionListener {

    private final appButton button;
    private final appFrame frame;


    public listener(appButton button, appFrame frame){
        this.button = button;
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (button.getName()){
            default:
                if(!utils().res){frame.addLabel(button.getName());}
                else {frame.setLabel(""); frame.addLabel(button.getName()); utils().res = false; utils().result = 0;}
                break;

            case "+":
                if (!utils().res){
                    utils().dot = false;
                    utils().operator = "plus";
                    utils().result = utils().result + Float.parseFloat(frame.getLabel());
                    frame.setLabel("");
                }
                break;

            case "-":
                if (!utils().res){
                    utils().dot = false;
                    utils().operator = "min";
                    utils().result = Float.parseFloat(frame.getLabel());
                    frame.setLabel("");
                }
                break;

            case "*":
                if (!utils().res){
                    utils().dot = false;
                    utils().operator = "mult";
                    if (utils().result == 0){utils().result = Float.parseFloat(frame.getLabel());}
                    else {utils().result = utils().result * Float.parseFloat(frame.getLabel());}
                    frame.setLabel("");
                }
                break;

            case "/":
                if (!utils().res){
                    utils().dot = false;
                    utils().operator = "div";
                    if (utils().result == 0){utils().result = Float.parseFloat(frame.getLabel());}
                    else {utils().result = utils().result / Float.parseFloat(frame.getLabel());}
                    frame.setLabel("");
                }
                break;

            case ".":
                if (!utils().res){
                    if (!utils().dot){frame.addLabel(".");utils().dot = true;}
                }
                break;


            case "=":
                if (utils().res){break;}
                utils().res = true;
                switch (utils().operator){
                    case "plus":
                        utils().result = utils().result + Float.parseFloat(frame.getLabel());
                        break;
                    case "min":
                        utils().result = utils().result - Float.parseFloat(frame.getLabel());
                        break;
                    case "mult":
                        utils().result = utils().result * Float.parseFloat(frame.getLabel());
                        break;
                    case "div":
                        utils().result = utils().result / Float.parseFloat(frame.getLabel());
                        break;
                }
                frame.setLabel(String.valueOf(utils().result));
                break;
        }

    }

    private utils utils(){return frame.getUtils();}
}
