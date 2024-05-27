package HW4;

import java.util.ArrayList;

public class CompanyDepartment {
    private ArrayList<String> personels;

    public CompanyDepartment(String s) {
        this.personels = new ArrayList<>();
    }

    public void personelEkle(String personelFullName) {
        this.personels.add(personelFullName);
    }

    public ArrayList<String> getPersonels() {
        return this.personels;
    }
}
