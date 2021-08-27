package in.pdigital.whattheluck;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_main);
        final TextView textView = (TextView) findViewById(R.id.textView2);
        ((Button) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String str;
                String str2;
                int round = (int) Math.round(Math.random() * 100.0d);
                if (round >= 90) {
                    str2 = "Woo Hoo!!!!";
                    str = "Wish something.";
                } else {
                    str2 = "Hey!";
                    str = "Work hard and Pray to increase your Luck.";
                }
                TextView textView = textView;
                textView.setText(str2 + " Random numbers says you are " + round + "% Lucky Rightnow \n" + str);
            }
        });
    }
}
