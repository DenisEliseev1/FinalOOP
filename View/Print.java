package View;

import Model.Notepad;

public class Print extends View {
    
    public void printTerminal (Notepad nt) {
        Print pr = new Print();
        pr.print(nt);
    }

    @Override
    public void print(Notepad nt) {
        for (Object object : nt) {
            System.out.println(object);
        }
    }
}
