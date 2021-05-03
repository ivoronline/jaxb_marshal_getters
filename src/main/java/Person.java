import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {

  //PROPERTIES
  private Integer id;
  private String  name;
  private Integer age;

  //GETTERS (Used by JAXB for Marshaling)
  public Integer getId  () { return id;   }
  public String  getName() { return name; }
  public Integer getAge () { return age;  }

  //SETTER  (Used by us to create Person Object)
  public void setId  (Integer id  ) { this.id   = id;   }
  public void setName(String  name) { this.name = name; }
  public void setAge (Integer age ) { this.age  = age;  }

}


