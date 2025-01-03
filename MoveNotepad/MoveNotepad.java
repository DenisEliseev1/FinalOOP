package MoveNotepad;

import java.io.IOException;

import Model.Notepad;
import Model.Recording;
//import Presenter.Presenter;

public class MoveNotepad {       
    //private Presenter pr = new Presenter(); 

    private Record rec = new Record();

    private Notepad <Recording> notepad = new Notepad<Recording>();

    public void generate(String nameFile) throws IOException, ClassNotFoundException {
        //System.out.println("Имя книги - " + nameFile);
        rec.simpleNotepadRec (notepad, nameFile);
    }

    public void open(String nameFile) throws IOException, ClassNotFoundException {
        //прописать выбор или вывода всех возможных для отккрытия или ввести имя или закрыть меню и запустить старт
        System.out.println("Имя книги для открытия - " + nameFile);
        rec.simpleNotepadRec (notepad, nameFile);
    }

    public void closeMenu(){
        System.out.println("До встречи!");
    }

}
