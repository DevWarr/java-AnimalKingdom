package animalKingdom;

public class Fish extends Animal
{
    public Fish(String name, int year)
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
        return "swim";
    }

    @Override
    public String breathe()
    {
        return "gills";
    }

    @Override
    public String reproduce()
    {
        return "eggs";
    }
}
