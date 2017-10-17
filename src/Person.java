

public class Person {
    private String name;

    public Person()
    {
       setName("");
    }

    public Person(String name)
    {
        setName(name);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }


    public String toString()
    {
        return "\nAccount Holder: " + getName();
    }
}
