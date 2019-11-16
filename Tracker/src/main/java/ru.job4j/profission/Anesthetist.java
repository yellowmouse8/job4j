package ru.job4j.profission;

public class Anesthetist extends Dentist {
    private String anesthesia;

    public Anesthetist(String name, String surname, String education, double birthday, String teeth, String anesthesia) {
        super(name, surname, education, birthday, teeth);
    }

    public void setAnesthesia(String anesthesia) {
        this.anesthesia = anesthesia;
    }

    public String getAnesthesia() {
        return anesthesia;
    }
}
