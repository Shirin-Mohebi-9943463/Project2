public class Flight {
    private String cityS;
    private String cityD;
    private String day;
    private int id;
    private int time;

    //کانستراکتور فلایت
    public Flight(String cityS, String cityD, String day, int id, int time) {
        this.cityS = cityS;
        this.cityD = cityD;
        this.day = day;
        this.id = id;
        this.time = time;
    }
    //برای چاپ کردن
    public String toString(){
        return "your flight---->    "
                +"from: " + cityS +
                "    ,   to: " + cityD +
                "    ,   day: " + day +
                "     ,   id: " + id +
                "     ,time: " + time;
    }
}
