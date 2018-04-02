import javax.xml.bind.annotation.*;
import java.io.IOException;

@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {})
@XmlRootElement
public class PersonRepository {
    @XmlElement(name = "repository")
    protected Person[] repository;
    protected static int id = -1;
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
