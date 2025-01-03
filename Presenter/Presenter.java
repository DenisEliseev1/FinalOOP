package Presenter;

import java.io.IOException;
import java.util.Scanner;

//import Model.Notepad;
//import Model.Recording;
import MoveNotepad.MoveNotepad;

public class Presenter  {
    public void start() throws IOException, ClassNotFoundException {
        //Notepad<Recording> notepad = new Notepad<Recording>();
        Scanner sc = new Scanner(System.in);
        sc.reset();
        int select = 0;
        MoveNotepad mn = new MoveNotepad();
        String name = "";
        System.out.println("Меню Notepad. Нажмите на клавиатуре оответсвующее действие:\n" +
                "1 - Создать\n" +
                "2 - Открыть\n" +
                "0 - Закрыть меню\n");
        select = sc.nextInt();
        sc.reset();
        switch (select) {
            case 1:
                System.out.println("Введите имя книги");
                name = sc.next();
                sc.reset();
                mn.generate(name);
                //start();
                break;
            case 2:
                System.out.println("Введите имя книги, кооторую необходимо открыть");
                name = sc.next();
                mn.open(name);
                sc.reset();
                start();
                break;
            case 0:
                mn.closeMenu();
                break;

            default:
                System.out.println("Некоректный выбор. Попробуйте снова");
                start();
                break;

        }
        sc.close();
    }
}
