public class Client {
    String name;
    int member_id;
    int age;

    public Client() {
        this.name = "";
    }
    public Client(String name, int member_id, int age) {
        this.name = name;
        this.member_id = member_id;
        this.age = age;
    }
    public boolean checkMemberShip(int member_id) {
        if (member_id / 1000000 == 111) {
            return true;
        }
        return false;
    }
}
