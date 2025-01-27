public class Pet1 {
    //private data fields
    private String name;
    private String species;
    private int age;

    //public Constructor(s)
    public Pet1()
    {
        this.setName("");
        this.setSpecies("");
        this.setAge(0);
    }

    //public set or mutator method for every private data field (except when the data field is read only.)
    public void setName(String newName)
    {
        this.name = newName;
    }
    public void setSpecies(String newSpecies)
    {
        this.species = newSpecies;
    }
    public void setAge(int newAge)
    {
        this.age = newAge;
    }

    //public get or accessor method for every private data field (except i it is a secret)
    public String getName()
    {
        return this.name;
    }
    public String getSpecies()
    {
        return this.species;
    }
    public int getAge()
    {
        return this.age;
    }
    /*public toString method that prints out all of the object state
    (meaning the data in the object instane that you will later instantiate in the main methos)
     */
    
     public String toString()
    {
        String output = "Pet name: ";
        output += this.getName();
        output += "\nSpecies: ";
        output += this.species;
        output += "\nAge: ";
        output += this.age;
        return output;
    }
    //I know this output is a little ugly, but I was not sure how else to add in several new items on one line- nor if that is even good practice.
}
