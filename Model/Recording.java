package Model;


public abstract class Recording {
    private String number;
    private String date;
    private String text;

    public String getNumber() {

        return number;
    }
    public void setNumber(String number) {
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
