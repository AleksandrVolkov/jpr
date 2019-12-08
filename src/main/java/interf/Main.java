package interf;

import interf.entities.Person;
import interf.factory.LabFactory;
import interf.reader.Reader;
import interf.repository.Repository;
import interf.stream.StreamAPI;
import reader.IReader;
import ru.vsu.lab.factory.ILabFactory;
import ru.vsu.lab.repository.IRepository;

import java.lang.reflect.Field;
import java.util.List;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        vv();

        ILabFactory labF = new LabFactory();
        IRepository<Person> rp = labF.createRepository(Person.class);
        IReader reader = new Reader(rp, ".\\src\\main\\resources\\persons.csv");

        List ipr = reader.read().toList();
        StreamAPI streamAPI = new StreamAPI(ipr);

        streamAPI.getMap1().forEach((key, value) -> {
            System.out.println("Division : " + key + " sum_salary : " + value);
        });
        streamAPI.getMap2().forEach((key, value) -> {
            outputPerson((Person) value);
            System.out.println(outputPerson((Person) value));
        });
        streamAPI.getMap3().forEach((key, value) -> {
            outputPerson((Person) value);
            System.out.println(outputPerson((Person) value));
        });


    }

    public static void vv() throws NoSuchFieldException, IllegalAccessException {
        Repository rp = new Repository();
        Field field = Repository.class.getDeclaredField("pole"); //getClass().getDeclaredField("name");
        field.setAccessible(true);
        field.set(rp,"string");

        int dadsd= 1;

    }

    static void printLPerson(List<Object> dl) {
        for (Object pr : dl) {
            System.out.println(outputPerson((Person) pr));
        }
    }

    static String outputPerson(Person inpPr) {
        return String.format(" | ID " + inpPr.getId() + " | Имя " + inpPr.getFirstName() + ' ' + inpPr.getLastName() +
                " | ДР " + inpPr.getBirthdate().toString() + " | Возраст " + inpPr.getAge() + " | Пол " + inpPr.getGender() +
                " | classesWithInterface.Division " + inpPr.getDivision().getName() + ' ' + inpPr.getDivision().getId() + " | Salary " + inpPr.getSalary());
    }
}
