package org.example;

public abstract class Academician extends Worker {
    private String branch;
    private String title;

    public Academician(String name, String surname, String phone, String email, String branch, String title) {
        super(name, surname, phone, email);
        this.branch = branch;
        this.title = title;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void giris() {
        System.out.println(this.getName() + " " + this.getSurname() + " isimli akademisyen a kapısından girdi.");
    }

    @Override
    public void cikis() {
        System.out.println(this.getName() + " " + this.getSurname() + " isimli akademisyen a kapısından çıktı.");
    }

    @Override
    public void yemekhane() {
        System.out.println(this.getName() + " " + this.getSurname() + " isimli akademisyen merkezi yemekhanede yemek yedi.");
    }
    public abstract void attendClass();
}
