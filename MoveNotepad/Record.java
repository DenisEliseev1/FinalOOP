package MoveNotepad;

import java.io.IOException;
import java.util.Scanner;

import Model.Notepad;
import Model.Recording;
import Model.SimpleRecord;
import Presenter.Presenter;
import SaveAs.*;

public class Record {
    private Scanner sc = new Scanner(System.in);
    private int select = 0;
    private Presenter pr = new Presenter();
    public Notepad <Recording> simpleNotepadRec (Notepad <Recording> notepad, String nameFile) throws IOException, ClassNotFoundException {
        System.out.println("Создание записи. Нажмите на клавиатуре оответсвующее действие:\n" +
        "1 - Создать строку\n" +
        "0 - Закрыть меню\n");
        select = sc.nextInt();
        switch (select) {
            case 1:
                notepad.add(simpleRecord(notepad));
                sc.reset();
                notepad = simpleNotepadRec(notepad, nameFile);
                break;
            case 0:
                closeMenu (nameFile, notepad);
                break;

            default:
                System.out.println("Некоректный выбор. Попробуйте снова");
                notepad = simpleNotepadRec(notepad, nameFile);
                break;

        }
        sc.close();
        return notepad;
    }
    public void closeMenu (String nameFile, Notepad <Recording> notepad) throws IOException, ClassNotFoundException  {
//запись в файл с выбранным имемнем/перезапись файла + возможность сохранить в другие форматы 
        System.out.print("Завершение записи. Нажмите на клавиатуре соответсвующее действие:\n" +
        "1 - Сохранить\n" +
        "2 - Сохранить как\n" +
        "0 - Закрыть (Не сохранять)\n" +
        "Ваш выбор - ");
        select = sc.nextInt();
        switch (select) {
            case 1:
                //здесь будет метод сохранение в рабочий файл по умолчанию (нужно создать дополнительную "папку" для сохранения) 
                WorkFile wf = new WorkFileStandart();
                wf.exportFile (notepad, nameFile);
                break;
            case 2:
                //здесь будет метод сохранения в другие форматы, кроме рабочего
                break;
            case 0:
                System.out.println("Закрытие...");            
            break;
            default:
            System.out.println("Некорректный выбор, попробуйте ещё раз");
            sc.reset();
            closeMenu (nameFile, notepad);
            break;
        }
        sc.reset();
        pr.start();

    }

    public Recording simpleRecord (Notepad <Recording> notepad) {
        
        SimpleRecord sr = new SimpleRecord();
        
        System.out.print("Введите дату записи:"+
        "\nВведите год - ");
        int year = sc.nextInt();
        sc.reset();
        System.out.print("\nВведите месяц - ");
        int month = sc.nextInt();
        sc.reset();
        System.out.print("\nВведите день - ");
        int day = sc.nextInt();
        sc.reset();
        //сделать проверку - дата больше или равна текущей, если меньше, то вернуть 
        int sum = notepad.size();
        sr.setNumber (sum+1);
        String text = year + " " + month + " " + day;
        sr.setDate(text);
        System.out.print("\nВведите текст - ");
        text = sc.next();
        sc.reset();
        sr.setText (text);
        return sr;
    }
}
