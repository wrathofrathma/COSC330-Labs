package df.rathma.lab03e04;

import java.util.ArrayList;

public class Calculator {
    private String current_text;
    private double last_num;
    private boolean num_set;
    private String operation;
    public Calculator(){
        current_text = "0";
        operation = "none";
        last_num = 0.0;
        num_set = false;
    }

    public void num_pressed(int n){
        if(current_text.equals("0")){
            if(n!=0){
                current_text=Integer.toString(n);
            }
        }
        else {
            current_text += Integer.toString(n);
        }
    }
    public String getResults(){
        return current_text;
    }

    public void clear(){
        last_num = Double.valueOf(current_text);
        current_text="0";
        operation = "none";
        num_set = false;
    }

    public void multiply(){
        last_num = Double.valueOf(current_text);
        operation = "multiply";
        current_text="0";
        num_set = true;
    }

    public void divide(){
        last_num = Double.valueOf(current_text);
        current_text="0";
        operation = "divide";
        num_set = true;
    }

    public void minus(){
        last_num = Double.valueOf(current_text);
        current_text="0";
        num_set = true;
        operation = "minus";
    }

    public void add(){
        last_num = Double.valueOf(current_text);
        num_set = true;
        current_text="0";
        operation = "add";
    }

    public void equals(){
        if(!num_set)
            return;
        double current = Double.valueOf(current_text);
        if(operation.equals("add")){
            current_text = String.valueOf(last_num + current);
            last_num = current;
        }
        else if(operation.equals("divide")){
            current_text = String.valueOf(last_num / current);
            last_num = current;
        }
        else if(operation.equals("multiply")){
            current_text = String.valueOf(last_num * current);
            last_num = current;
        }
        else if(operation.equals("minus")){
            current_text = String.valueOf(last_num - current);
            last_num = current;
        }
    }

    public void percent(){
        current_text = Double.toString(Double.valueOf(current_text) / 100.0);
    }
}
