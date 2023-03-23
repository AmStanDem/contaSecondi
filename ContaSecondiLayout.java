import javax.swing.*;
import java.awt.*;

public class ContaSecondiLayout extends JFrame{



    private int count = 0;

    private boolean start;

    private ThreadContaSecondi countTime;

    private ThreadFermaSecondi stop;

    JPanel panButtons;

    JPanel panLabels;

    private JButton btnStartCount , btnEndCount;

    private JTextArea showSeconds;

    public ContaSecondiLayout () {

        this.start = start;

        Container c = this.getContentPane();

        panButtons = new JPanel();

        panButtons.setLayout(new GridLayout());

        panLabels = new JPanel();

        panLabels = new JPanel();

        panLabels.setLayout(new GridLayout());

        btnStartCount = new JButton("start");

        btnEndCount = new JButton("end");

        showSeconds = new JTextArea();

        showSeconds.setPreferredSize(new Dimension(100 , 30));

        panLabels.add(showSeconds);






        btnStartCount.addActionListener(countTime = new ThreadContaSecondi(this , count));

        btnEndCount.addActionListener((stop = new ThreadFermaSecondi(this)));

        panButtons.add(btnStartCount);

        panButtons.add(btnEndCount);

        c.add(panLabels , BorderLayout.NORTH);

        c.add(panButtons , BorderLayout.CENTER);


        this.setSize(600 , 400);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setVisible(true);
    }

    public void setStart(boolean start){
        this.start = start;
    }
    public boolean getStart(){
        return this.start;
    }

    public JTextArea getLabel(){
        return showSeconds;
    }




}
