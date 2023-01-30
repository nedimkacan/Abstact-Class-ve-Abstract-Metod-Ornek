package org.example;

public abstract class Officer extends Worker {
    private String department;
    private String shift;

    public Officer(String name, String surname, String phone, String email, String department, String shift) {
        super(name, surname, phone, email);
        this.department = department;
        this.shift = shift;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    @Override
    public void giris() {
        System.out.println(this.getName() + " " + this.getSurname() + " isimli memur b kapısından girdi.");
    }

    @Override
    public void cikis() {
        System.out.println(this.getName() + " " + this.getSurname() + " isimli memur b kapısından çıktı.");
    }

    @Override
    public void yemekhane() {
        System.out.println(this.getName() + " " + this.getSurname() + " isimli akademisyen yedek yemekhanede yemek yedi.");
    }
    public abstract void work();
}
