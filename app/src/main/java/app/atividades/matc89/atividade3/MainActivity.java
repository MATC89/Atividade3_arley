package app.atividades.matc89.atividade3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "app.atividades.matc89.atividade3.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void sendMessage(View v) {
            Intent intent = new Intent(this, Activity2.class);
            EditText editText = (EditText) findViewById(R.id.editText);
            String message = editText.getText().toString();
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivityForResult(intent, 1);
        }

        public void onActivityResult(int requestCode, int resultCode, Intent data) {
            super.onActivityResult(requestCode, resultCode, data);
            if (requestCode == 1) {
                if(resultCode == RESULT_OK){
                    String message = data.getStringExtra(EXTRA_MESSAGE);
                    TextView textView = (TextView) findViewById(R.id.textView);
                    textView.setText(message);
                }
            }
        }
}
