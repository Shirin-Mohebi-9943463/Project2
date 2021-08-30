import java.util.ArrayList;
import java.util.Scanner;

public class Others {
    String username,password;
    //تابع منوی خوشامد گویی
    public void mainmenue(){
        Scanner in=new Scanner(System.in);
        System.out.println("Welcome to Iran Air site");
        System.out.println("Enter 1 to Register");
        System.out.println("Enter 2 to Login");
        switch (in.nextInt()){
            case 1:
                Register();
                break;
            case 2:
                login();
                break;
            default://اگر کاربر چیزی به غیر از 1 یا 2 وارد کرد دوباره وارد منوی خوشامد گویی بشه
                mainmenue();
        }
    }
    //این تابع برای ثبت نام کاربر هست
    public void Register(){
        Scanner in=new Scanner(System.in);
        System.out.println("Register");
        System.out.println("Enter your username(your username must be less than 10 char):");
        username=in.next();
        checkUsername(username);//در اینجا محدودیت های یوزرنیم چک میشود
        for (User user1 : Data.getInstance().getUsers()){//دراینجا چک میشه که آیا ما همچین یوزر نیمی داریم یا خیر
            if (user1.getUsername().equals(username)) {
                System.out.println("change your username(your username was taken by another user):");
                Register();
                break;
            }
        }
        System.out.println("Enter your password(your password must be less than 10 char):");
        password=in.next();
        checkPassword(password);// در اینجا محدودیت های پسورد چک میشود
        User user=new User(username,password);//بعد در اینجا یوزر نیم و پسورد نهایی رو وارد کانستراکتور کلاس یوزر کردیم
        System.out.println("register successfully");
        Data.getInstance().addUser(user);//در اینجا یوزر مورد نظر رو وارد لیست یوزر ها کردیم
        mainmenue();
    }
    //تابع ورود
    public void login() {
        Scanner in = new Scanner(System.in);
        System.out.println("Login");
        System.out.println("Enter username:");
        String userName = in.next();
        System.out.println("Enter password:");
        String passWord=in.next();

        for (User user : Data.getInstance().getUsers()){//در اینجا چک میشه که آیا همجین یوزرنیم و پسوردی داریم یا خیر
            if (user.getUsername().equals(userName) && user.getPassword().equals(passWord)) {
                System.out.println("login Successfully");
                guidancepanel(user);
                break;
            }
        }
        System.out.println("please enter one more time:");
        login();
    }

    //تابع برای چک کردن محدودیت های مورد نظر برای یوزر نیم
    //(یوزرنیم از 10 تا کاراکتر کمتر یا مساوی باشد)
    public void checkUsername(String check_username){
        Scanner in=new Scanner(System.in);
        while (true){
            if(check_username.length()>=10){
                System.out.println("enter again:");
                check_username=in.next();
                username=check_username;
            }
            else{
                break;
            }
        }
    }

    //تابع برای چک کردن محدودیت های مورد نظر برای پسورد
    //(پسورد از 10 تا کاراکتر کمتر یا مساوی باشد)
    public void checkPassword(String check_password){
        Scanner in=new Scanner(System.in);
        while (true) {
            if(check_password.length()>=10){
                System.out.println("enter again:");
                check_password=in.next();
                password=check_password;
            }
            else{
                break;
            }
        }
    }

    //در اینجا وارد پنل اصلی میشه کاربر
    public void guidancepanel(User user) {
        Scanner in = new Scanner(System.in);

        System.out.println("guidance panel");
        System.out.println("enter 1 to show list of flights");
        System.out.println("enter 2 to search flights");
        System.out.println("enter 3 to show your flights");
        System.out.println("enter 4 logout");
        int number=in.nextInt();
        switch (number){
            case 1://اگر کاربر 1 رو وارد کرد
                Data.getInstance().showListOfFlights();//متد لیست کل پرواز ها نمایش داده میشود
                System.out.println("enter 0 to back to guidance panel");
                Scanner input=new Scanner(System.in);
                Others others=new Others();
                int x=input.nextInt();
                switch (x){
                    case 0://اگر 0 رو وارد کرد
                        others.guidancepanel(user);//به پنل اصلی بر میگردد
                        break;
                    default://و اگر هرچیزی به غیر از 0 و 1 وارد کرد وارد پنل اصلی شود
                        guidancepanel(user);
                }
                break;
            case 2:// اگر 2 را وارد کرد
                Data.getInstance().Search();//تابع سرچ عمل کند
                System.out.println("if you want to buy it enter 9 unless enter 0 to back to guidance panel");
                int y=in.nextInt();
                switch (y){
                    case 9:// اگر 9 رو وارد کرد فلایت انتخاب شده در لیست فلایت ها اد شود و بعد دوباره وارد پنل اصلی شود
                        user.addflight(Data.getInstance().getFlight());
                        System.out.println("this flight added");
                        guidancepanel(user);
                        break;
                    case 0:// اگر 0 وارد کرد به پتل اصلی بازگردد
                        guidancepanel(user);
                        break;
                    default://اگر هرچیزی به غیر از 0 و 9 وارد کرد وارد پنل اصلی شود
                        guidancepanel(user);
                }
                break;
            case 3:// اگر 3 وارد کرد فلایت های خریداری شده توسط این کابر نمایش داده شود و باز به پنل اصلی برگردد
                user.printAllflights();
                guidancepanel(user);
                break;
            case 4:// اگر 4 وارد کرد به منظور لاگ اوت کردن است که وارد منوی خوشامد گویی میشود
                mainmenue();
                break;
            default://اگر هرچیزی به غیر از 1 و 2 و 3 و 4  وارد کرد وارد پنل اصلی شود
                guidancepanel(user);
        }
    }
}
