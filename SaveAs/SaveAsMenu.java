package SaveAs;

import java.io.IOException;
import java.util.Scanner;

import Model.Notepad;
import Model.Recording;
import Presenter.Presenter;
import MoveNotepad.Record;

public class SaveAsMenu  {
    private Scanner sc = new Scanner(System.in);
    private int select = 0;
    private SaveTXTFile stxt = new SaveTXTFile();
    private Presenter pr = new Presenter();
    private Record rec = new Record();
    public void menuSave (String nameFile, Notepad <Recording> notepad) throws IOException, ClassNotFoundException {
        System.out.println("Выберете формат сохранения:" +
        "\n1 - .TXT" +
        "\n2 - в разработке" +
        "\n0 - вернуться назад");
        select = sc.nextInt();
        switch (select) {
            case 1:                
                stxt.exportFile(notepad, nameFile);
                sc.close();
                pr.start();
                break;
            case 2:
                System.out.println("Сервис в разработке...");
                sc.reset();
                menuSave(nameFile, notepad);
            case 0:
                sc.close();
                rec.closeMenu(nameFile, notepad);
            break;
        
            default:
            System.out.println("Некорректный выбор, попробуйте ещё раз.");
            sc.reset();
            menuSave(nameFile, notepad);
                break;
        }
    }
}
