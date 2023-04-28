public class University {
    private String name;
    private int id;
    private int quota;

    public University(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void decreaseQuota(){
        this.quota--;
    }
    @Override
    public String toString() {
        return "University's name: " + name +
                "\n\t ID=" + id+"\n";
    }

    public int getQuota() {
        return quota;
    }
    public void setQuota(int quota) {
        this.quota = quota;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
