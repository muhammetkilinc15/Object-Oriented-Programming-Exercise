public class Client {
    public String name;
    public int member_id;
    public int age;

    public Client() {
        this.name = "";
    }

    public Client(String name, int member_id, int age) {
        this.name = name;
        this.member_id = member_id;
        this.age = age;
    }

    public boolean checkMemberShip(int member_id) {
        String memberID = String.valueOf(member_id);
        return memberID.charAt(0) == '1' && memberID.charAt(1) == '1' && memberID.charAt(2) == '1';
    }
}
