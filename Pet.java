public class Pet {
    //private data fields
    private String name;
    private String species;
    private int age;
    private String noise;

    //public Constructor(s)
    public Pet()
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
    /*After a lot of testing and attempts, I got a version of this to work as per requested in the assignment. 
    Essentially, I learned how 'this' works in the class file, and how 'this' refers to the class name, so all of the 'this' in this file == Pet.
    With that knowledge I now understand better what all the this.___ means and I was able to construct an if else tree to set the noise for 4 animals.
    I included Opossum because of your youtube profile picture.

    Each if statement checks if the string in species is equal to an expected string, if it is then noise is set to a predetermined string that the animal makes.
    
    After doing some digging around, I discovered that '==' does not work for strings, and you need to use .equals()
    */
    public void setNoise()
    {
        if (this.species.equals( "Cat")){
            this.noise = "Meow";
        }else if (this.species.equals( "Dog")){
            this.noise = "Woof";
        }else if (this.species.equals( "Bird")){
            this.noise = "Tweet";
        }else if (this.species.equals( "Opossum")){
            this.noise = "Hiss";
        // A special example else if so the example text works for the user.
        }else if (this.species.equals("Species")){
            this.noise = "Noise the animal makes.";
        }else {
            this.noise = "Species sound unknown.";
        }
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
    public String getNoise()
    {
        return this.noise;
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
        output += "\nNoise: ";
        output += this.noise;
        output += "\nAge: ";
        output += this.age;
        return output;
    }
    //I know this output is a little ugly, but I was not sure how else to add in several new items on one line- nor if that is even good practice.
}
