public class Animal {


    //what information does each animal need?
    protected String name;
    protected String species;
    protected int age;
    protected String habitat;
    protected boolean alive;


    //do I need to fill all instance variables for a class?
    public Animal(String name, String species, int age, String habitat, boolean alive) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.habitat = habitat;
        this.alive = alive;


    }


    public Animal() {
        this.name = "Pauly";
        this.species = "Turtle";
        this.age = 5000;
        this.habitat = "Mars";
        this.alive = true;


    }


    public String toString(){
        return "Our animal " + this.name + " is currently alive?: " + alive;
    }


    public int getAge() {
        return this.age;
    }
    //parameter and default constructors


    //getters = "looking up" animal information


    //isHungry vs. getHungry


    public boolean isAlive(){
        return alive;
    }


    public String makeNoise(){
        return "Mooo";
    }


    //publicly accessible methods?
    public static void main(String[] args) {
        Animal frank = new Animal("Frank", "Duck-Giraffe Hybrid", 68, "Water", false);
        System.out.println(frank);
        Animal deflt = new Animal();
        System.out.println(deflt);
        System.out.println(frank.makeNoise());
        System.out.println(deflt.makeNoise());
    }
    public void putOutOfMisery(){
        alive = false;
    }

    public String getName() {
        return name;
    }
}

