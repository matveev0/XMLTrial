import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

//@XmlAccessorType(XmlAccessType.NONE)
//@XmlTransient
public abstract class Repository{
    @XmlElement(name = "repository")
    protected Person[] repository;
    protected static int id = -1;
}
