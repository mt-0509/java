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

    String[] week = new String[7];
    week[0] = "日";
    week[1] = "月";
    week[2] = "火";
    week[3] = "水";
    week[4] = "木";
    week[5] = "金";
    week[6] = "土";

    int week_int = c.get(c.DAY_OF_WEEK);
    System.out.println("その日は" + week[week_int - 1] + "曜日です");
  }
}