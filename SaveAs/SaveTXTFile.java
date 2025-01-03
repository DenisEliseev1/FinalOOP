package SaveAs;

import java.io.IOException;

import Model.Notepad;
import Model.Recording;

public class SaveTXTFile extends WorkFile {

    @Override
    public void exportFile(Notepad<Recording> notepad, String nameFile) throws IOException, ClassNotFoundException {
        // Здесь будет метод выгрузки в ТХТ файл
        System.out.println("Экспорт в ТХТ временно не доступен");
        super.exportFile(notepad, nameFile);
    }

    @Override
    public Notepad<Recording> importFile(String nameFile) throws IOException, ClassNotFoundException {
        // Здесь будет метод выгрузки из ТХТ файла в лист Notepad
        System.out.println("Импорт из ТХТ временно не доступен");
        return super.importFile(nameFile);
    }
    
}
