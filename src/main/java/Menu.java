import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.awt.*;
import java.io.File;

import java.time.LocalDate;


public class Menu {
    private static PersonRepository personRepository = new PersonRepository();
    private static CarRepository carRepository = new CarRepository();

    public static void main(String[] args) throws Exception {
     //   addRndPerson();
     //   addRndCars();

        JAXBContext jaxbPersonContext = JAXBContext.newInstance(PersonRepository.class);
        JAXBContext jaxbCarsContext = JAXBContext.newInstance(CarRepository.class);

        Unmarshaller personUnmarshaller = jaxbPersonContext.createUnmarshaller();
        Unmarshaller carsUnmarshaller = jaxbCarsContext.createUnmarshaller();

        Marshaller personMarshaller = jaxbPersonContext.createMarshaller();
        Marshaller carsMarshaller = jaxbCarsContext.createMarshaller();

        File cars = new File("cars.xml");
        File persons = new File("persons.xml");

        personRepository = (PersonRepository) personUnmarshaller.unmarshal(persons);
        carRepository = (CarRepository) carsUnmarshaller.unmarshal(cars);


        personMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        carsMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

//        personMarshaller.marshal(personRepository, System.out);
        personMarshaller.marshal(personRepository, new File("persons.xml"));
        carsMarshaller.marshal(carRepository, new File("cars.xml"));

    }


    static void addRndCars() {
        LocalDate l = LocalDate.of(1997, 1, 1);
        Car car1 = new Car("213213535", new Color(1, 1, 1), "ford", l);
        Car car2 = new Car("22431241313535", new Color(1, 1, 1), "toyota", l);
        Car car3 = new Car("213211", new Color(1, 1, 1), "kia", l);

        carRepository.repository.add(car1);
        carRepository.repository.add(car2);
        carRepository.repository.add(car3);

    }

    static void addRndPerson() {
        LocalDate l = LocalDate.of(1997, 1, 1);
        Person p1 = new Person("1", "Матвеев543", l);
        Person p2 = new Person("2", "Матвеев123", l);
        Person p3 = new Person("3", "Матвеев4", l);


        personRepository.repository.add(p1);
        personRepository.repository.add(p2);
        personRepository.repository.add(p3);

    }
}
