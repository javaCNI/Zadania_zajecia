package Package;

public class Computer {
    private String computer_name;
    private String motherboard_name;
    private String gpu_name;
    private int ram_memory; // w MB
    static int wiek = 21;

    public String getComputer_name() {
        return computer_name;
    }

    public void setComputer_name(String computer_name) {
        this.computer_name = computer_name;
    }

    private void setPowerOn() {}
    private void setPowerOff() {}
    public boolean getPower() {}
    public void Calculate(double x, double y) {
        System.out.println(x+y);
    }

    public Computer() {
        this.computer_name = "Pecet";
    }

    public Computer(String computer_name, String gpu_name) {
        this.computer_name = computer_name;
        this.gpu_name = gpu_name;
    }
}
