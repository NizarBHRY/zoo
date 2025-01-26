public class Giraffee extends Animal{
    private int neckLength;
    private int lastsdaysWitoutFood;
    private static int daysHaventEaten;
    Giraffee(){
        this.name = "tallguy";
        this.species = "giraffee";
        this.age = 17;
        this.habitat = "savanna";
        this.alive = true;
        this.neckLength= 12;
        this.lastsdaysWitoutFood= 1;
    }
    Giraffee(String name, int age, String habitat, boolean alive, int neckLength, int lastsdaysWitoutFood){
        super(name, "giraffe", age, habitat, alive);
        this.neckLength= neckLength;
        this.lastsdaysWitoutFood = lastsdaysWitoutFood;
    }

    public static int isHaveEaten() {
        return daysHaventEaten;
    }

    public static void setDaysHaventEaten(int daysHaventEaten) {
        Giraffee.daysHaventEaten = daysHaventEaten;
    }

    public int getNeckLength() {
        return neckLength;
    }

    public void setNeckLength(int neckLength) {
        this.neckLength = neckLength;
    }

    public int getLastsdaysWitoutFood() {
        return lastsdaysWitoutFood;
    }

    public void setLastsdaysWitoutFood(int lastsdaysWitoutFood) {
        this.lastsdaysWitoutFood = lastsdaysWitoutFood;
    }

    public static void givefood(){
        daysHaventEaten =0;
    }


}
