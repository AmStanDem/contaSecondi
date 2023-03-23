import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThreadContaSecondi extends Thread implements ActionListener {

    private ContaSecondiLayout l;

    private JLabel lab;

    private int count=1;

    private boolean start;

    /*public ThreadContaSecondi(JLabel lab , int count , boolean start){
        this.lab = lab;
        this.count = count;
        this.start = start;
    }

     */
    public ThreadContaSecondi(ContaSecondiLayout l , int count ){
        this.l = l;
        this.count = count;
        l.setStart(true);
    }






    @Override
    public synchronized void  actionPerformed(ActionEvent e)  {
        ThreadContaSecondi t = this;
        t.interrupt();
        t = new  ThreadContaSecondi(l , count=1);
        t.start();
    }

    @Override
    public void run() {
        while(l.getStart() == true) {
            System.out.println("ciao");
            addSeconds();
            modifyLabel();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
    public  void addSeconds() {
        count++;
    }
    public  void modifyLabel() {
        l.getLabel().setText(String.valueOf(count));
    }

}

