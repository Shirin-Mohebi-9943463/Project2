import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private ArrayList<Flight> flightList;

    //کانستراکتور کلاس یوزر
    public User(String username, String password) {
        this.username = username;
        this.password = password;
        flightList=new ArrayList<>();
    }
    //تابع اد فلایت که فلایت جدید رو به لیست فلایت اضافه کند
    public void addflight(Flight newFlight) {
        flightList.add(newFlight);
    }
    //تابع چاپ برای لیست فلایت
    public void printAllflights() {
        if (flightList.isEmpty())
            System.out.println("No flight Added");

        for (Flight flight : flightList)
            System.out.println(flight);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
