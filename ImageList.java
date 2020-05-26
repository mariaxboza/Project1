import pictures.Empty;

import javax.swing.*;

public class ImageList {
    private static ImageIcon pic1 = new ImageIcon(Empty.class.getResource("pic1.png"));
    private static ImageIcon pic2 = new ImageIcon(Empty.class.getResource("pic2.png"));
    private static ImageIcon pic3 = new ImageIcon(Empty.class.getResource("pic3.png"));
    private static ImageIcon pic4 = new ImageIcon(Empty.class.getResource("pic4.png"));
    private static ImageIcon pic5 = new ImageIcon(Empty.class.getResource("pic5.png"));
    private static ImageIcon pic6 = new ImageIcon(Empty.class.getResource("pic6.png"));
    private static ImageIcon pic7 = new ImageIcon(Empty.class.getResource("pic7.png"));
    private static ImageIcon pic8 = new ImageIcon(Empty.class.getResource("pic8.png"));
    private static ImageIcon pic9 = new ImageIcon(Empty.class.getResource("pic9.png"));
    private static ImageIcon pic10 = new ImageIcon(Empty.class.getResource("pic10.png"));
    private static ImageIcon pic11 = new ImageIcon(Empty.class.getResource("pic11.png"));
    private static ImageIcon pic12 = new ImageIcon(Empty.class.getResource("pic12.png"));
    private static ImageIcon pic13 = new ImageIcon(Empty.class.getResource("pic13.png"));
    private static ImageIcon pic14 = new ImageIcon(Empty.class.getResource("pic14.png"));
    private static ImageIcon pic15 = new ImageIcon(Empty.class.getResource("pic15.png"));

    private ImageIcon[] picList = {pic1, pic2, pic3, pic4, pic5, pic6, pic7, pic8, pic9, pic10, pic11,
                                    pic12, pic13, pic14, pic15};

    public ImageIcon[] getPicList () { return picList; }
}
