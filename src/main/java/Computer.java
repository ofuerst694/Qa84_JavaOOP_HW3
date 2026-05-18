public class Computer {
    private String company;
    private int ram;
    private String cpu;
    private int sdd;

    public Computer(){}

    public Computer(String company, int ram, String cpu, int sdd) {
        super();
        this.company = company;
        this.ram = ram;
        this.cpu = cpu;
        this.sdd = sdd;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getSdd() {
        return sdd;
    }

    public void setSdd(int sdd) {
        this.sdd = sdd;
    }

    @Override
    public String toString() {
        String comp ="Company: " + this.company +
                "\nRam: " + this.ram +
                "\nCpu: " + this.cpu +
                "\nSdd: " + this.sdd;
        return comp;
    }
}
