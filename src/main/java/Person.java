import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.time.LocalDate;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"id", "FIO"/*, "dateOfBirth"*/})
public class Person {
    private String id;
    private String FIO;
    //private LocalDate dateOfBirth;

    public Person() {
    }

    public Person(String id, String FIO, LocalDate dateOfBirth) {
        this.id = id;
        this.FIO = FIO;
        //this.dateOfBirth = dateOfBirth;
    }
}
