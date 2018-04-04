import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.NONE)
@XmlTransient
public abstract class Repository<T>{
    @XmlElementWrapper(name = "repository")
    @XmlElements({
            @XmlElement(name = "Person", type = Person.class),
            @XmlElement(name = "Car", type  = Car.class)
    })
    protected List<T> repository;
    protected static int id = -1;
}
