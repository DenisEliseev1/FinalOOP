package MoveNotepad;

import java.util.Scanner;

import Model.Notepad;
import Model.Recording;
import Model.SimpleRecord;

public class Record {
    private Scanner sc = new Scanner(System.in);
    public Notepad <Recording> simpleNotepadRec (Notepad <Recording> notepad, String nameFile) {
        System.out.println("Создание записи. Нажмите на клавиатуре оответсвующее действие:\n" +
        "1 - Создать строку\n" +
        "2 - Закрыть меню\n");
        int select = sc.nextInt();
        switch (select) {
            case 1:
                notepad.add(simpleRecord(notepad));
                sc.reset();
                notepad = simpleNotepadRec(notepad, nameFile);
                break;
            case 2:
                closeMenu (nameFile);
                break;

            default:
                System.out.println("Некоректный выбор. Попробуйте снова");
                notepad = simpleNotepadRec(notepad, nameFile);
                break;

        }
        sc.close();
        return notepad;
    }
    public void closeMenu (String name) {
        //запись в файл с выбранным имемнем/перезапись файла + возможность сохранить в другие форматы 
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
        return sr;
    }
}
