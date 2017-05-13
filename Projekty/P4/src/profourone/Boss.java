package profourone;

public class Boss extends Employee {
    private static int count2 = 0;
    private int depID;
    private int subordinate;

    public Boss() {
        this.depID = ++depID;
    }

    public int getDepID() {
        return depID;
    }

    public int getSubordinate() {
        return subordinate;
    }

    public void setSubordinate(int subordinate) {
        this.subordinate = subordinate;
    }
}
