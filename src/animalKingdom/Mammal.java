package animalKingdom;

public class Mammal extends Animal
{
    public Mammal(String name, int year)
    {
        super(name, year);
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getYear()
    {
        return this.year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    @Override
    public String move()
    {
        return "walk";
    }

    @Override
    public String breathe()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "live births";
    }
}
