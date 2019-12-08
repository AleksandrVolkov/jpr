package interf.factory;

import interf.entities.Division;
import interf.entities.Person;
import interf.repository.PersonRepository;
import interf.repository.Repository;
import ru.vsu.lab.entities.IDivision;
import ru.vsu.lab.entities.IPerson;
import ru.vsu.lab.factory.ILabFactory;
import ru.vsu.lab.repository.IPersonRepository;

public class LabFactory implements ILabFactory {
    @Override
    public IPerson createPerson() {
        return new Person();
    }

    @Override
    public IDivision createDivision() {
        return new Division();
    }

    //вот тут не понел!
    @Override
    public <T> Repository<T> createRepository(Class<T> clazz) {
//        Type result =  clazz.getGenericSuperclass();
//        T type = result;
        return new <T>Repository<T>();
    }

    @Override
    public IPersonRepository createPersonRepository() {
        return new PersonRepository();
    }
}
