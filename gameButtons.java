import javax.swing.*;
import java.awt.*;

public class gameButtons extends JButton {

    private ImageIcon _i;
    private String _s;
    private People _p;

    public gameButtons(ImageIcon i)
    {
        super();
        _i = i;
    }

    public gameButtons(String s)
    {
        super();
        _s = s;
    }

    public gameButtons(ImageIcon i, People p)
    {
        _i = i;
        _p = p;
    }

    public People getPeople(){ return _p; }
}
