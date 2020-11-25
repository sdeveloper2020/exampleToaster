package ir.sinabase.toasterexample;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import ir.sinabase.toasterlibrary.ToasterMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToasterMessage.toasty(this,"hello");
    }
}