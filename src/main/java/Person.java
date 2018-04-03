import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"id", "FIO", "dateOfBirth"})
public class Person {
    private String id;
    private String FIO;
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    private LocalDate dateOfBirth;

    public Person() {
    }

    public Person(String id, String FIO, LocalDate dateOfBirth) {
        this.id = id;
        this.FIO = FIO;
        this.dateOfBirth = dateOfBirth;
    }
}
