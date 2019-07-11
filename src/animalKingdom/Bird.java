package animalKingdom;

public class Bird extends Animal
{
    public Bird(String name, int year)
    {
        super(name, year);
    }

    @Override
    public String getName()
    {
        return this.name;
    }

    @Override
    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public int getYear()
    {
        return this.year;
    }

    @Override
    public void setYear(int year)
    {
        this.year = year;
    }

    @Override
    public String move()
    {
        return "fly";
    }

    @Override
    public String breathe()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "eggs";
    }
}
