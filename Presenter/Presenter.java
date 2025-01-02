package Presenter;

import Model.Notepad;
import Model.Recording;


public class Presenter {
    public void start () {
        Notepad <Recording> notepad = new Notepad<Recording>();
        System.out.println("Меню Notepad. Нажмите на клавиатуре оответсвующее действие:\n" +
        "1 - Создать\n" +
        "2 - Открыть\n" +
        "3 - Закрыть меню\n");
    }
}
