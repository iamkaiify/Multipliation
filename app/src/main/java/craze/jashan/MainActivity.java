package craze.jashan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView printdata;
    EditText input;
    Button calculate;
    Button clear;
    String result;




    void initViews(){
        printdata=(TextView)findViewById(R.id.Output);
        input=(EditText) findViewById(R.id.editInput);
        calculate=(Button) findViewById(R.id.Calculate);
        clear=(Button) findViewById(R.id.Clear);
        /////

         calculate.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if (input.getText().length() == 0) {
                     printdata.setText(R.string.Error);
                 } else {
                     printdata.setText("");
                     int input1 = Integer.parseInt(input.getText().toString());

                     for (int i = 1; i <= 10; i++) {
                         result = (input1 + "  X  " + i + " = " + i * input1);
                         printdata.append("\n" + result);

                     }
                 }
             }
         });

                          clear.setOnClickListener(new View.OnClickListener() {
                              @Override
                              public void onClick(View view) {
                                  printdata.setText("");
                                  input.setText("");
                              }
                          });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }
}
