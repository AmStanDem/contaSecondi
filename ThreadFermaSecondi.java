import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThreadFermaSecondi implements ActionListener , Runnable {

    private ContaSecondiLayout l;

    private boolean start;


    ThreadFermaSecondi(ContaSecondiLayout l) {
        this.l = l;
        this.start = false;
    }

    public void run() {

        l.setStart(false);

    }
    @Override
    public void actionPerformed(ActionEvent e)  {
        run();
    }





}
