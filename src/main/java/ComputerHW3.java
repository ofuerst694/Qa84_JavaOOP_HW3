public class ComputerHW3 {
    private String company;
    private int ram;
    private String cpu;
    private int ssd;

    public void setCompany(String company) {
        if (company != null)
        this.company = company;
    }

    public void setRam(int ram) {
        if(ram > 0)
        this.ram = ram;
    }

    public void setCpu(String cpu) {
        if (company != null)
        this.cpu = cpu;
    }

    public void setSsd(int ssd) {
        if(ssd > 0)
        this.ssd = ssd;
    }

    public String getCompany() {
        return company;
    }

    public int getRam() {
        return ram;
    }

    public String getCpu() {
        return cpu;
    }

    public int getSsd() {
        return ssd;
    }
}
