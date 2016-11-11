package unicauca.movil.colores;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView color;
    CheckBox az, ro, ve;

    int a = 0,r = 0, v = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        color = (TextView) findViewById(R.id.color);
        az = (CheckBox) findViewById(R.id.azul);
        ro = (CheckBox) findViewById(R.id.rojo);
        ve = (CheckBox) findViewById(R.id.verde);

        az.setOnClickListener(this);
        ro.setOnClickListener(this);
        ve.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.azul:
                a = az.isChecked() ? 0xff : 0x00;
                break;
            case R.id.verde:
                v = ve.isChecked() ? 0xff : 0x00;
                break;
            case R.id.rojo:
                r = ro.isChecked() ? 0xff : 0x00;
                break;
        }

        color.setBackgroundColor(Color.rgb(r, v, a));
    }
}
