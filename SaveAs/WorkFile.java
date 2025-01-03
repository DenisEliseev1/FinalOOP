package SaveAs;

import java.io.IOException;

import Model.Notepad;
import Model.Recording;

public abstract class WorkFile implements SaveAsInterface {

    @Override
    public void exportFile (Notepad <Recording> notepad, String nameFile) throws IOException, ClassNotFoundException {
        
        
    }

    @Override
    public Notepad<Recording> importFile(String nameFile) throws IOException, ClassNotFoundException {

        return null;
    }


    
}
