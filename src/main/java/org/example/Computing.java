package org.example;

public class Computing extends Officer{
    private String duty;

    public Computing(String name, String surname, String phone, String email, String department, String shift, String duty) {
        super(name, surname, phone, email, department, shift);
        this.duty = duty;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    @Override
    public void work() {
        System.out.println(this.getName() + " " + this.getSurname() + " isimli bilgi işlem personeli çalışıyor.");
    }
}
