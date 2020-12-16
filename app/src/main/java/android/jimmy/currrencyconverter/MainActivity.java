package android.jimmy.currrencyconverter;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }


        public void convertCurrency(View view) {
            EditText reaisText = findViewById(R.id.reaisText);
            TextView textView = findViewById(R.id.textView);

            if (!reaisText.getText().toString().equals("")) {
                Float reaisValue = Float.valueOf(reaisText.getText().toString());
                Float poundValue = reaisValue * 0.14F;
                textView.setText(poundValue.toString());
            } else {
                textView.setText(R.string.no_value_string);
            }

            // TODO: need code here
        }

}