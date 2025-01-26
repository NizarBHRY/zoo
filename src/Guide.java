public class Guide extends Employee {
    private boolean haskeys= false;
    Guide(){
        super("trent","guide", 15.0,800);
    }
    Guide(String name, double salary, int hours){
        this.name = name;
        this.job = "Guide";
        this.salary =salary;
        this.hours = hours;
    }
    public String speak(){
        return "And if you look to your right you'll see the elephants";
    }
    public void invented_speak(String v, Guide x){
        System.out.println(v + x.fee()+ "dang they are taking money off for anythin now");
    }
    public void giveKeys(){
        haskeys =true;
    }
    public boolean checkKeys(){
        return haskeys;
    }
}
