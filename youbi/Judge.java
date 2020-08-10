import java.util.Calendar;
import java.util.Date;

public class Judge {
  
  public void change() {
    Receive r = new Receive();
    Calendar c = Calendar.getInstance();

    int seireki = r.getSeireki();
    int month = r.getTuki() -1;
    int day = r.getNiti();

    c.set(seireki,month,day);
    Date d = c.getTime();
  
    System.out.println(d);
  }
}