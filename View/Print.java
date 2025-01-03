package View;

import Model.Notepad;
import Model.Recording;

public class Print extends View {
    
    public void printTerminal (Notepad <Recording> nt) {
        Print pr = new Print();
        pr.print(nt);
    }

    @Override
    public void print(Notepad <Recording> nt) {
        for (Object object : nt) {
            System.out.println(object);
        }
    }
}
