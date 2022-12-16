package org.example;

public class Passenger {

    private String title;
    private String name;
    private long id;
    private long phone;
    private int age;

    public Passenger(String title, String name, long id, long phone, int age) {
        setTitle(title);
        setName(name);
        setId(id);
        setPhone(phone);
        setAge(age);
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if("Mr".equalsIgnoreCase(title) || "Mrs".equalsIgnoreCase(title) || "Ms".equalsIgnoreCase(title)){
            this.title = title;
        }
        else {
            throw new IllegalArgumentException("This is not a valid name. Use Mr, Ms or Mrs.");
        }
    }
}
