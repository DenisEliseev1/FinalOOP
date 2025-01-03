package Model;


public abstract class Recording {
    private int number;
    private String date;
    private String text;

    public int getNumber() {

        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }


    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    @Override
    public String toString() {
        return "#" + number + " date=" + date + "Text --" + text;
    }
    

    
}
