package HW4;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CompanyDepartment department = new CompanyDepartment("");

        department.personelEkle("Nazmi Elmastaş");
        department.personelEkle("Furkan Kahraman");
        department.personelEkle("Berkay Suçsuz");

        ArrayList<String> personeller = department.getPersonels();
        for (String personel : personeller) {
            System.out.println("Departmanda Çalışan: " + personel);
        }
    }
}
