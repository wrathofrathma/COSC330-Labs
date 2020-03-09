package df.rathma.lab01e3;

public class Model {
    private int count;
    public Model(){
        count = 0;
    }
    public int get_count(){
        return count;
    }
    public void set_count(int c){
        count = c;
    }
    public String inc_count(){
        count++;
        return Integer.toString(count);
    }

}
