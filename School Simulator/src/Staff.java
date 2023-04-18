public class Staff extends  Employee{
    private String title;


    public Staff() {

    }

    public Staff(String name) {
        super(name);

    }

    public Staff(String name, String adress, String phone, String mail, String office, double salary, MyDate dateHired, String title) {
        super(name, adress, phone, mail, office, salary, dateHired);
        this.title = title;
    }

    /** Return title */
    public String getTitle() {
        return title;
    }

    /** Set new title */
    public void setTitle(String title) {
        this.title = title;
    }

    /** Return a string discription of the class */
    public String toString() {
        return super.toString() + "\nTitle: " + title+"\n";
    }

}
