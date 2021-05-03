import javax.xml.bind.*;
import java.io.File;

public class Test {

  public static void main(String[] args) throws JAXBException {

    //CREATE PERSON
    Person  person = new Person();
            person.setId  (1);
            person.setName("John");
            person.setAge (20);

    //MARSHAL PERSON
    Marshaller  marshaller = JAXBContext.newInstance(Person.class).createMarshaller();
                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
                marshaller.marshal(person, new File("./person.xml"));
  }

}
