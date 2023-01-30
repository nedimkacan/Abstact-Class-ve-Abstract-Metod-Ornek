package org.example;

public class Lecturer extends Academician {
    private int kapiNo;

    public Lecturer(String name, String surname, String phone, String email, String branch, String title, int kapiNo) {
        super(name, surname, phone, email, branch, title);
        this.kapiNo = kapiNo;
    }

    public int getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo(int kapiNo) {
        this.kapiNo = kapiNo;
    }

    @Override
    public void attendClass() {
        System.out.println(this.getName() + " " + this.getSurname() + " isimli öğretim görevlisi e sınıfında derse girdi.");
    }
    public void senateMeeting(){
        System.out.println(this.getName() + " " + this.getSurname() + " isimli öğretim görevlisi toplantıya girdi.");
    }
    public void takeATest(){
        System.out.println(this.getName() + " " + this.getSurname() + " isimli öğretim görevlisi c sınıfına sınav yapıyor.");
    }
}
