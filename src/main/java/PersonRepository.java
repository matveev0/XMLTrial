import javax.xml.bind.annotation.*;
import java.io.IOException;

@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {})
@XmlRootElement
public class PersonRepository extends Repository{


    public PersonRepository(int capacity) {

        repository = new Person[capacity];
    }

    public PersonRepository(){}

    public void add(Person p) {
        if (++id < repository.length - 1) {
            repository[id] = p;
        } else {
            repository[id] = p;
        }
    }
}
