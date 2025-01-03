package SaveAs;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import Model.Notepad;
import Model.Recording;
import View.Print;
import View.View;

public class WorkFileStandart extends WorkFile{

    protected Notepad <Recording> notepad;
    protected String nameFile;
    private View vw = new Print();
    @Override
    public void exportFile (Notepad <Recording> notepad, String nameFile) throws IOException, ClassNotFoundException  {

         ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(nameFile + ".out"));
         String [] stArr = new String[notepad.size()];
         for (int i = 0; i < stArr.length; i++) {
            stArr[i] = notepad.get(i).toString();
         }
         objectOutputStream.writeObject(stArr);
        objectOutputStream.close();

        vw.print (notepad);
    }

    @Override
    public Notepad<Recording> importFile(String nameFile) throws IOException, ClassNotFoundException {
        // TODO Auto-generated method stub
        return super.importFile(nameFile);
    }


  
    
}
