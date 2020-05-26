import com.sun.media.jfxmediaimpl.platform.java.JavaPlatform;
import pictures.Empty;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GWFrame extends JFrame { // These are the components to make the frame of the game
    
    private gameButtons[][] buttons = new gameButtons[3][5];
    private ImageList images = new ImageList();
    private Questions q = new Questions();
    private JPanel panel4Pic = new JPanel(new GridLayout(3,5));
    private JPanel panel4Ques = new JPanel(new GridLayout(4, 2));
    private JPanel panel4Ans = new JPanel();
    private JLabel label4Ans = new JLabel();
    private gameButtons[][] quesButt = new gameButtons[4][2];


    public GWFrame() // This is the constructor for the game
    {
        
        super("Guess Who?");
        this.setLayout(null);
        this.setSize(1000,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.print(People.curPlayer.getName());
        createButtons();
        createQuesButt();
        panel4Pic.setBounds(0,0,400,450);
        panel4Ques.setBounds(460,0, 500,450);
        panel4Ans.setBounds(0, 500, 1000, 300);
        panel4Ans.add(label4Ans);
        label4Ans.setFont(new Font("Comic Sans MS", Font.BOLD ,30 ));
        label4Ans.setForeground(Color.RED);
        this.add(panel4Pic);
        this.add(panel4Ques);
        this.add(panel4Ans);



        this.setResizable(false);
        this.setVisible(true);

    }

    private void createButtons()
    { // This method is to create the buttons for the game. The bottons will have the pictures of the possible people.
        int cnt = 0;
        for(int r = 0; r < buttons.length; r++)
        {
            for(int c = 0; c < buttons[r].length; c++)
            {
                buttons[r][c] = new gameButtons(images.getPicList()[cnt], People.MY_PEOPLE[r*buttons[r].length + c]);
                buttons[r][c].setIcon(images.getPicList()[cnt]);
                panel4Pic.add(buttons[r][c]);
                cnt++;
                buttons[r][c].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String player = ((gameButtons)e.getSource()).getPeople().getName();
                        System.out.print(player);
                        if(People.isCorrect(player))
                        {
                            label4Ans.setText("You have Won!!!!");
                        }
                        else
                        {
                            label4Ans.setText("You have Lost!!!!" + " The correct person was: "
                                    + People.curPlayer.getName());
                        }
                    }
                });
            }

        }
    }

    private void createQuesButt()
    { // This method will create the Buttons for the questions to change and ask the question
        for(int r = 0; r < quesButt.length; r++)
        {
            for(int c = 0; c < quesButt[r].length; c++)
            {
                quesButt[r][c] = new gameButtons(q.getQues()[r][c]);
                quesButt[r][c].setText(q.getQues()[r][c]);
                panel4Ques.add(quesButt[r][c]);
                int finalR = r;
                int finalC = c;
                quesButt[r][c].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        boolean correct = false;
                        if(finalR == 0 && finalC == 0)
                        {
                            correct = People.curPlayer.hasLooks(Looks.MALE);

                        }
                        else if(finalR == 0 && finalC == 1)
                        {
                            correct = People.curPlayer.hasLooks(Looks.FEMALE);
                        }
                        else if(finalR == 1 && finalC == 0)
                        {
                            correct = People.curPlayer.hasLooks(Looks.HAT);
                        }
                        else if(finalR == 1 && finalC == 1)
                        {
                            correct = People.curPlayer.hasLooks(Looks.GLASSES);
                        }
                        else if(finalR == 2 && finalC == 0)
                        {
                            correct = People.curPlayer.hasLooks(Looks.BLACK);
                        }
                        else if(finalR == 2 && finalC == 1)
                        {
                            correct = People.curPlayer.hasLooks(Looks.YELLOW);
                        }
                        else if(finalR == 3 && finalC == 0)
                        {
                            correct = People.curPlayer.hasLooks(Looks.ORANGE);
                        }
                        else if(finalR == 3 && finalC == 1)
                        {
                            correct = People.curPlayer.hasLooks(Looks.WHITE);
                        }
                        if(correct)
                            label4Ans.setText("Yes");
                        else
                            label4Ans.setText("No");

                    }
                });
            }
        }
    }


}
