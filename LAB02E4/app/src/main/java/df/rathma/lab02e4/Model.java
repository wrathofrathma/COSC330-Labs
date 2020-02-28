package df.rathma.lab02e4;

public class Model {
    private static double caviar_cal = 42;
    private static double beef_patty_cals = 204;
    private static double lamb_patty_cals = 216;
    private static double ostrich_patty_cals = 130;
    private static double prosciutto_cals = 203;
    private static double asiago_cals = 130;
    private static double creme_calories = 110;
    private String patty;
    private String cheese;
    private boolean prosciutto;
    private double caviar;

    public Model(){
        patty = "beef";
        cheese = "asiago";
        prosciutto = false;
        caviar = 0;
    }
    public void select_patty(String p){
        if(p.equals("beef")){
            patty = "beef";
        }
        else if(p.equals("lamb")){
            patty = "lamb";
        }
        else if(p.equals("ostrich")){
            patty = "ostrich";
        }
    }
    public void set_prosciutto(boolean p){
        prosciutto = p;
    }
    public void select_cheese(String c){
        if(c.equals("asiago")){
            cheese = c;
        }
        else{
            cheese = c;
        }
    }
    public void set_caviar_amount(double a){
        caviar = a;
    }
    public double get_patty_cals(){
        if(patty.equals("beef")){
            return beef_patty_cals;
        }
        else if(patty.equals("lamb")){
            return lamb_patty_cals;
        }
        else if(patty.equals("ostrich")){
            return ostrich_patty_cals;
        }
        return 0;
    }
    public double get_cheese_cals(){
        if(cheese.equals("asiago")){
            return asiago_cals;
        }
        else{
            return creme_calories;
        }
    }
    public double get_prosciutto_cals(){
        if(prosciutto)
            return prosciutto_cals;
        else
            return 0;
    }
    public double get_caviar_cals(){
        return caviar * caviar_cal;
    }
    public double calculate_calories(){
        return get_patty_cals() + get_caviar_cals() + get_prosciutto_cals() + get_cheese_cals();
    }
    public String get_cal_string(){
        return Double.toString(calculate_calories());
    }
}
