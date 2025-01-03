package SaveAs;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import Model.Notepad;
import Model.Recording;

public class WorkFileStandart extends WorkFile{

    protected Notepad <Recording> notepad;
    protected String nameFile;

    @Override
    public void exportFile (Notepad <Recording> notepad, String nameFile) throws IOException, ClassNotFoundException  {
         ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(nameFile + ".out"));
            //System.out.println("+");
            objectOutputStream.writeObject(notepad);
        objectOutputStream.close();
    }

    @Override
    public Notepad<Recording> importFile(String nameFile) throws IOException, ClassNotFoundException {
        // TODO Auto-generated method stub
        return super.importFile(nameFile);
    }


  
    
}
