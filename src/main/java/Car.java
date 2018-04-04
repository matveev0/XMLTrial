
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.awt.*;
import java.time.LocalDate;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"VIN", "color", "model", "dateOfProduction"})
public class Car {
    private String VIN;
    @XmlJavaTypeAdapter(value = ColorAdapter.class)
    Color color;
    private String model;
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    private LocalDate dateOfProduction;


    public Car(String VIN, Color color, String model, LocalDate dateOfProduction) {
        this.VIN = VIN;
        this.color = color;
        this.model = model;
        this.dateOfProduction = dateOfProduction;
    }


    public Car() {

    }

}
