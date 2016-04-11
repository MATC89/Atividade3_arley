package app.atividades.matc89.atividade3;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by arleyprates on 4/10/16.
 */
public class Activity2 extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "app.atividades.matc89.atividade3.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(message);
    }

    public void sendMessage(View v) {
        Intent intent = new Intent();
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        setResult(RESULT_OK, intent);
        finish();
    }
}
