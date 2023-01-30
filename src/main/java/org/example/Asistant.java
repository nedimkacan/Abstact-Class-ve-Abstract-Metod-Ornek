package org.example;

public class Asistant extends Academician{
    private String officeClock;

    public Asistant(String name, String surname, String phone, String email, String branch, String title, String officeClock) {
        super(name, surname, phone, email, branch, title);
        this.officeClock = officeClock;
    }

    public String getOfficeClock() {
        return officeClock;
    }

    public void setOfficeClock(String officeClock) {
        this.officeClock = officeClock;
    }

    @Override
    public void attendClass() {
        System.out.println(this.getName() + " " + this.getSurname() + " isimli asistan c sınıfında derse girdi.");
    }
}
