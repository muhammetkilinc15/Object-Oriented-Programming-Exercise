public class Person {
   private String name;
   private String adress;
   private String phone;
   private String mail;

   public Person(){

   }
    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String adress, String phone, String mail) {
        this.name = name;
        this.adress = adress;
        this.phone = phone;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    public String toString(){
        return "Name: "+name+
                "\nAdress: "+adress+
                "\nPhone number: "+phone+
                "\nMail: "+mail+"\n";
    }
}
