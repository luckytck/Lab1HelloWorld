package my.edu.tarc.lab1helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Global Variable
    EditText editTextName, editTextAge;
    TextView textViewMessage;

    //onCreate() = main() function in Java
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView() = show the UI
        //R = resources class
        setContentView(R.layout.activity_main);

        //Link UI to program
        editTextAge = (EditText)findViewById(R.id.editTextAge);
        editTextName = (EditText)findViewById(R.id.editTextName);
        textViewMessage = (TextView)findViewById(R.id.textViewMessage);
    }

    public void displayMessage(View view){
        String name = editTextName.getText().toString();
        int age = Integer.parseInt(editTextAge.getText().toString());
        age += 1;
        textViewMessage.setText("Hi " + name + ", you will be " + age + " in 2018.");
    }

    public void resetMessage(View view){
        editTextAge.setText("");
        editTextName.setText("");
        textViewMessage.setText("Hello World");
    }
}
