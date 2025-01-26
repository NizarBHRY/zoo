import java.util.ArrayList;
import java.util.List;

public class Janitor extends Employee {
    private int shiftStart;
    public int shiftEnd;
    private String area;
    private int toolnum;
    private String tool;
    private boolean hasKeys= true;
    private String[] tools = {"broom", "brush", "cloth", "mop"};



    Janitor(String name, double salary, int hours, int shiftStart,int shiftEnd, String area, int tool) {
        this.name = name;
        this.salary = salary;
        this.hours = hours;
        this.shiftStart = shiftStart;
        this.shiftEnd= shiftEnd;
        this.area = area;
        this.toolnum = tool;

        }
    Janitor(String namer){
        super(namer,"janitor", 200, 6);
        shiftStart =0;
        shiftEnd= 6;
        area ="all";
        toolnum = 0;


    }
    public void changeTool(int changer) {
        tool = tools[toolnum+changer] ;

    }

    public int getShiftStart() {
        return shiftStart;
    }

    public void setShiftStart(int shiftStart) {
        this.shiftStart = shiftStart;
    }

    public int getShiftEnd() {
        return shiftEnd;
    }

    public void takeKeys() {
            hasKeys = false;
        }
    public boolean HasKeys() {
            return hasKeys;
        }
}

