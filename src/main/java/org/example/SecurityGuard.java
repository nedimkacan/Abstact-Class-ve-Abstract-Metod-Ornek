package org.example;

public class SecurityGuard extends Officer{
    private String document;

    public SecurityGuard(String name, String surname, String phone, String email, String department, String shift, String document) {
        super(name, surname, phone, email, department, shift);
        this.document = document;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    @Override
    public void work() {
        System.out.println(this.getName() + " " + this.getSurname() + " isimli güvenlik görevlisi nöbet tutuyor.");
    }
}
