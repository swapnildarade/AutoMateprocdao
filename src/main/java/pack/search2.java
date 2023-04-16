package pack;

public abstract class search2 {
    public static String date;
    public static String day;
    public static String from;
    public static String destin;
    public static int persons;

    public static String getQuery() {
        return "SELECT * FROM plane WHERE from = '"+from+"' AND destin='"+destin+"' AND day='"+day+"'";
    }
}
