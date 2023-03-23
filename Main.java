
/*
* Realizzare un’applicazione che tramite un’opportuna
* GUI permetta di visualizzare in una JLabel il passaggio
* (sulla reale precisione ne discuteremo successivamente)
* dei secondi dopo avere premuto un JButton.
* Il JButton avvia un Thread che conta da 1 a quando viene fermato
* (a discrezione da un altro JButton o dallo stesso JButton che ha avviato il conteggio).
 */

public class Main {
    static volatile boolean start = false;
    public static void main(String[] args) {
        new ContaSecondiLayout();
    }
}
