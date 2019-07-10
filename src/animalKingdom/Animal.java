package animalKingdom;

public abstract class Animal
{
    private static int maxId = 0;
    int id;
    String name;
    int year;

    public Animal(String name, int year)
    {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.year = year;
    }
    public abstract String getName();
    public abstract void setName();
    public abstract int getYear();
    public abstract void setYear();
    public abstract String move();
    public abstract String breathe();
    public abstract String reproduce();

    @Override
    public String toString()
    {
        return "The " + name + " was named in " + year + ".\nIt can " + move() + ", breathe with " + breathe() + ", and reproduce with " + reproduce() + ".";
    }
}
