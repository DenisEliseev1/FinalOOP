package View;

import Model.Notepad;

public class Print {
    public void printTerminal (Notepad nt) {
        for (Object object : nt) {
            System.out.println(object);
        }
    }
}
