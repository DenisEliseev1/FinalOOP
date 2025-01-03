package SaveAs;

import java.io.IOException;

import Model.*;

//import Model.Notepad;

public interface SaveAsInterface {
    void exportFile (Notepad <Recording> notepad, String nameFile) throws IOException, ClassNotFoundException;

    Notepad <Recording> importFile (String nameFile)throws IOException, ClassNotFoundException;
}
