public class Faculty extends Employee {

    private String officeHours;
    private String rank;

    public Faculty() {

    }

    public Faculty(String name) {
        super(name);
    }

    public Faculty(String name, String adress, String phone, String mail, String office, double salary, MyDate dateHired, String officeHours, String rank) {
        super(name, adress, phone, mail, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    public String toString(){
        return super.toString()+"Office Hour: "+officeHours+
                "\nRank: "+rank+"\n";
    }
}


