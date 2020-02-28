package df.rathma.lab02e4;

import android.view.View;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Controller {
    private Model model;
    public ProsciuttoListener prosciuttoListener;
    public Controller(Model model){
        this.model = model;
        this.prosciuttoListener = new ProsciuttoListener();
    }

    public void on_slider(int progress){
        model.set_caviar_amount(progress / 100.0);
        System.out.println(model.get_cal_string());
    }
    public void on_cheese_clicked(View view){
        switch(view.getId()){
            case R.id.creme_radio:
                model.select_cheese("creme");
                break;
            case R.id.asiago_radio:
                model.select_cheese("asiago");
                break;
        }
        update_calories(view);
    }
    public void on_patty_clicked(View view){
        switch(view.getId()){
            case R.id.lamb_radio:
                model.select_patty("lamb");
                break;
            case R.id.beef_radio:
                model.select_patty("beef");
                break;
            case R.id.ostrich_radio:
                model.select_patty("ostrich");
                break;
        }
        update_calories(view);
    }
    public void update_calories(View view){
        View pv = view.getRootView();
        TextView tv = (TextView) pv.findViewById(R.id.calorie_val);
        tv.setText(model.get_cal_string());
    }
    private class ProsciuttoListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            CheckBox cb = (CheckBox)v;
            model.set_prosciutto(cb.isChecked());
            update_calories(v);
        }
    }
}
