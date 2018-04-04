import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

@XmlAccessorType(XmlAccessType.NONE)
//@XmlType(propOrder = {})
@XmlRootElement
public class CarRepository extends Repository<Car> {

    public CarRepository() {
        repository = new ArrayList<Car>();
    }
}
