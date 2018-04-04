import javax.xml.bind.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {})
@XmlRootElement
public class PersonRepository extends Repository<Person>{


    public PersonRepository() {

        repository = new ArrayList<Person>();
    }
}
