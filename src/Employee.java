public class Employee {
    //TODO: create employee class
    protected String name;
    protected String job;
    protected double salary;
    protected int hours;


    //TODO: create constructors
    public Employee(String name, String job, double salary, int hours){
        this.name = name;
        this.job = job;
        this.salary =salary;
        this.hours = hours;
    }
    public Employee(){
        this("Peter", "janitor", 2.0, 8);
    }


    //TODO: create getters and setters
    public String getName(){
        return name;
    }
    public String getJob(){
        return job;
    }
    public double getSalary(){
        return salary;
    }


    public int getHours() {
        return hours;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setJob(String job) {
        this.job = job;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }


    public void setHours(int hours) {
        this.hours = hours;
    }


    //TODO: any other methods?
    public double bonus(){
         salary+=  (1.0/3*salary);
        return salary;
    }
    public double  fee(){
        return salary-=  (1.0/4*salary);
    }
    public void printInfo(){
        System.out.print(getName()+ " ");
        System.out.print(getJob()+ " ");
        System.out.print("$" + getSalary()+ " ");
        System.out.println(getHours());
    }


}
