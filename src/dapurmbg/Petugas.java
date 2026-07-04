package dapurmbg;

public class Petugas {

    private String namaPetugas;
    private String shift;

    public Petugas(String namaPetugas, String shift) {
        this.namaPetugas = namaPetugas;
        this.shift = shift;
    }

    public String getNamaPetugas() {
        return namaPetugas;
    }

    public void setNamaPetugas(String namaPetugas) {
        this.namaPetugas = namaPetugas;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

}