import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Data {
    private static final Data data = new Data();
    private ArrayList<User>users=new ArrayList<>();
    private ArrayList<String> day=new ArrayList<>();
    private ArrayList<String>city=new ArrayList<>();
    private ArrayList<Integer>time=new ArrayList<>();
    private ArrayList<Integer>id=new ArrayList<>();
    static final Random random=new Random();

    private String cityName1,cityName2,cityName3,cityName4,cityName5,cityName6,cityName7;
    private String day1,day2,day3,day4,day5,day6,day7;
    private int time1,time2,time3,time4,time5,time6,time7;
    private int id1,id2,id3,id4,id5,id6,id7;
    private String cityS,cityD,Day;
    private int Time;
//تابع گت
    public Flight getFlight() {
        return new Flight(cityS,cityD,Day,id1,Time);
    }
// کانستراکتور دیتا
    private Data() {
        users.add((new User("mohebi","123456")));
        users.add((new User("anita","12345678")));
    }

    public static Data getInstance() {
        return data;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void addUser(User user){
        users.add(user);
    }
    //متد نشان دادن پرواز ها به صورت رندم
    //در اینجا اول مقادیر را داخل لیست ها add کردم بعد به صورت جدا جدا رندم گرفتم به تعدادی که میخواستم
    //در اینجا متغیر های cityname را به صورت گلوبال تعریف کردم تا در تابع سرچ از آن ها استفاده کنم
    public void showListOfFlights() {
        System.out.println("LIST OF FLIGHTS");
        day.add("Saturday");
        day.add("Sunday");
        day.add("Monday");
        day.add("Tuesday");
        day.add("Wednesday");
        day.add("Thursday");
        city.add("Yazd");
        city.add("Tehran");
        city.add("Shiraz");
        city.add("Mashhad");
        city.add("Qom");
        city.add("Kermanshah");
        city.add("Kerman");
        time.add(11);
        time.add(23);
        time.add(12);
        time.add(13);
        time.add(14);
        time.add(20);
        time.add(19);
        id.add(235);
        id.add(358);
        id.add(698);
        id.add(699);
        id.add(700);
        id.add(777);
        id.add(435);
//        Random random = new Random();
        int indexOfcity = random.nextInt(city.size());
        cityName1 = (String) city.get(indexOfcity);
        indexOfcity = random.nextInt(city.size());
        cityName2 = (String) city.get(indexOfcity);
        indexOfcity = random.nextInt(city.size());
        cityName3 = (String) city.get(indexOfcity);
        indexOfcity = random.nextInt(city.size());
        cityName4 = (String) city.get(indexOfcity);
        indexOfcity = random.nextInt(city.size());
        cityName5 = (String) city.get(indexOfcity);
        indexOfcity = random.nextInt(city.size());
        cityName6 = (String) city.get(indexOfcity);
        indexOfcity = random.nextInt(city.size());
        cityName7 = (String) city.get(indexOfcity);
        //----------------------------------------------------------------------
        int indexOfday = random.nextInt(day.size());
        day1 = (String) day.get(indexOfday);
        indexOfday = random.nextInt(day.size());
        day2 = (String) day.get(indexOfday);
        indexOfday = random.nextInt(day.size());
        day3 = (String) day.get(indexOfday);
        indexOfday = random.nextInt(day.size());
        day4 = (String) day.get(indexOfday);
        indexOfday = random.nextInt(day.size());
        day5 = (String) day.get(indexOfday);
        indexOfday = random.nextInt(day.size());
        day6 = (String) day.get(indexOfday);
        indexOfday = random.nextInt(day.size());
        day7 = (String) day.get(indexOfday);
        //------------------------------------------------------------------------------
        int indexOftime = random.nextInt(time.size());
        time1 = (int) time.get(indexOftime);
        indexOftime = random.nextInt(time.size());
        time2 = (int) time.get(indexOftime);
        indexOftime = random.nextInt(time.size());
        time3 = (int) time.get(indexOftime);
        indexOftime = random.nextInt(time.size());
        time4 = (int) time.get(indexOftime);
        indexOftime = random.nextInt(time.size());
        time5 = (int) time.get(indexOftime);
        indexOftime = random.nextInt(time.size());
        time6 = (int) time.get(indexOftime);
        indexOftime = random.nextInt(time.size());
        time7 = (int) time.get(indexOftime);
        //--------------------------------------------------------------------------------------
        int indexOfid = random.nextInt(id.size());
        id1 = (int) id.get(indexOfid);
        indexOfid = random.nextInt(id.size());
        id2 = (int) id.get(indexOfid);
        indexOfid = random.nextInt(id.size());
        id3 = (int) id.get(indexOfid);
        indexOfid = random.nextInt(id.size());
        id4 = (int) id.get(indexOfid);
        indexOfid = random.nextInt(id.size());
        id5 = (int) id.get(indexOfid);
        indexOfid = random.nextInt(id.size());
        id6 = (int) id.get(indexOfid);
        indexOfid = random.nextInt(id.size());
        id7 = (int) id.get(indexOfid);
        System.out.println("Id  \t   From   \t  to  \t  Day  \t  Time ");
        System.out.println();
        System.out.printf("%d \t %s \t %s \t %s \t %d", id1, cityName1, cityName2, day1, time1);
        System.out.println();
        System.out.printf("%d \t %s \t %s \t %s \t %d", id2, cityName2, cityName3, day2, time2);
        System.out.println();
        System.out.printf("%d \t %s \t %s \t %s \t %d", id3, cityName3, cityName4, day3, time3);
        System.out.println();
        System.out.printf("%d \t %s \t %s \t %s \t %d", id4, cityName4, cityName5, day4, time4);
        System.out.println();
        System.out.printf("%d \t %s \t %s \t %s \t %d", id5, cityName5, cityName6, day5, time5);
        System.out.println();
        System.out.printf("%d \t %s \t %s \t %s \t %d", id6, cityName6, cityName7, day6, time6);
        System.out.println();
        System.out.printf("%d \t %s \t %s \t %s \t %d", id7, cityName7, cityName1, day7, time7);
        System.out.println();
    }
    // تابع سرچ که اومدم از همون متغیر های گلوبال استفاده کردم
    //مثلا کاربر وقتی شهر مبدا رو وارد میکنه شهر مبدا رو با اسم cityS وارد میکنه
    public void Search(){
        Scanner input=new Scanner(System.in);
        System.out.println("enter your starting city:");
        cityS=input.next();
        System.out.println("Id \t From \t To \t Day \t Time");
        System.out.printf("%d %s %s %s %d",id1,cityS,cityName1,day1,time1);//در اینجا cityS ها ثابت اند و برای قسمت های دیگه از همون متغیر های گلوبال استفاده کردم که آخرین مقدار رو دارند نمایش بدن
        System.out.println();
        System.out.printf("%d %s %s %s %d",id2,cityS,cityName2,day2,time2);
        System.out.println();
        System.out.printf("%d %s %s %s %d",id3,cityS,cityName3,day3,time3);
        System.out.println();
        System.out.printf("%d %s %s %s %d",id4,cityS,cityName4,day4,time4);
        System.out.println();
        //کارکرد قسمت های بعدی مثل مورد اولی است
        System.out.println("enter your destination:");
        cityD=input.next();
        System.out.println("Id \t From \t To \t Day \t Time");
        System.out.printf("%d %s %s %s %d",id1,cityS,cityD,day1,time1);
        System.out.println();
        System.out.printf("%d %s %s %s %d",id2,cityS,cityD,day2,time2);
        System.out.println();
        System.out.printf("%d %s %s %s %d",id3,cityS,cityD,day3,time3);
        System.out.println();
        System.out.printf("%d %s %s %s %d",id4,cityS,cityD,day4,time4);
        System.out.println();
        System.out.println("enter your day:");
        Day=input.next();
        System.out.println("Id \t From \t To \t Day \t Time");
        System.out.printf("%d %s %s %s %d",id1,cityS,cityD,Day,time1);
        System.out.println();
        System.out.printf("%d %s %s %s %d",id2,cityS,cityD,Day,time2);
        System.out.println();
        System.out.printf("%d %s %s %s %d",id3,cityS,cityD,Day,time3);
        System.out.println();
        System.out.printf("%d %s %s %s %d",id4,cityS,cityD,Day,time4);
        System.out.println();
        System.out.println("enter your time:");
        Time=input.nextInt();
        System.out.println("Id \t From \t To \t Day \t Time");
        //در آخر این متغیر هارو وارد تابع گت فلایت کردم که وارد کانستراکتور فلایت ذخیره شوند
        System.out.printf("%d %s %s %s %d",id1,cityS,cityD,Day,Time);
        System.out.println();
    }
}