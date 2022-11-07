import java.util.Enumeration;
import java.util.Hashtable;

public class HTDemo {
    public static void main(String[] args) {
        Hashtable<String, Double> balance = new Hashtable<>();
        Enumeration<String> names;

        String str;
        double bal;

        balance.put("John Joe", 3243.6);
        balance.put("Tom Smith", 123.23);
        balance.put("Jane Baker", 1345.76);
        balance.put("Tod Hall", 99.02);
        balance.put("Ralph Smith", -19.34);

        names = balance.keys();
        while(names.hasMoreElements()){
            str = names.nextElement();
            System.out.println(str + ":" + balance.get(str));
        }
        System.out.println();
        bal = balance.get("John Joe");
        balance.put("John Joe", bal+10002);
        System.out.println("New summ of John Joe: "+
                balance.get("John Joe"));

    }
}
