import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Root;

public class Menu {
    private static PersonRepository personRepository= new PersonRepository(10);

    public static void main(String[] args) throws Exception{
       // addRndPerson();

        JAXBContext jaxbContext = JAXBContext.newInstance(PersonRepository.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        File xml = new File("sg.xml");
        personRepository = (PersonRepository)unmarshaller.unmarshal(xml);

        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        marshaller.marshal(personRepository,System.out);
        marshaller.marshal(personRepository, new File("sg.xml"));

    }

    static void addRndPerson() {
        LocalDate l = LocalDate.of(100,1,1);
        Person p1 = new Person("1","Матвеев543",l);
        Person p2 = new Person("2","Матвеев123", l);
        Person p3 = new Person("3","Матвеев4", l);


        personRepository.add(p1);
        personRepository.add(p2);
        personRepository.add(p3);

    }
}
