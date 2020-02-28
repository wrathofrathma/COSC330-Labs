package df.rathma.lab01e3;


import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Controller {
    private Model model;
    public Controller(Model model){
        this.model = model;
    }
    public void on_click(View v){
        View vv = (View) v.getParent();
        TextView tv = (TextView) vv.findViewById(R.id.textView);
        tv.setText(model.inc_count());
        Log.v("MainActivity", "Christopher - " + Integer.toString(model.get_count()));
    }
}
