import java.util.ArrayList;
import java.util.List;

public class Janitor extends Employee {
    private int shift;
    private String area;
    private int toolnum;
    private String tool;
    private static boolean hasKeys;
    private List<String> tools = new ArrayList<>();


    Janitor(String name, double salary, int hours, int shift, String area, int tool) {
        this.name = name;
        this.salary = salary;
        this.hours = hours;this.shift = shift;
        this.area = area;
        this.toolnum = tool;
        tools.add("broom");tools.add("brush");;tools.add("cloth");tools.add("mop");
        }

        public void changeTool(int changer) {
        tool = tools.get(toolnum+changer);

        }

        public static void givenKeys() {
            hasKeys = true;
        }

        public boolean HasKeys() {
            return hasKeys;
        }
    }

