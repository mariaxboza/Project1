import javax.swing.*;
import java.awt.*;

public class gameButtons extends JButton {
    // Class that creates all the buttons with the people.

    private ImageIcon _i;
    private String _s;
    private People _p;

    // Constuctor for the game button that creates the button with the picture.
    public gameButtons(ImageIcon i)
    {
        super();
        _i = i;
    }
    
    // Constuctor for the game button that creates the button with a string which is used for the questions
    public gameButtons(String s)
    {
        super();
        _s = s;
    }

    // Constuctor for the game button that creates the button with a picture and a People object 
    // Which is used for each of the people
    public gameButtons(ImageIcon i, People p)
    {
        _i = i;
        _p = p;
    }

    //This method returns the person used for the game button
    public People getPeople(){ return _p; }
}
