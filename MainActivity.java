/*
 * This program shows a creeper image when the password "creeper" is input, otherwise it tells the
 * user the password is invalid.
 *
 * @author Jay Bigelow
 */

package com.example.jgb23.passwordimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //declarations of objects
    private EditText editText;
    private TextView textView2;
    private ImageView phone_icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize objects
        View inflatedView = getLayoutInflater().inflate(R.layout.activity_main, null);
        editText = (EditText) inflatedView.findViewById(R.id.editText);
        textView2 = (TextView) inflatedView.findViewById(R.id.textView2);
        phone_icon = (ImageView) inflatedView.findViewById(R.id.phone_icon);

        //make action listener
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                //if password is correct show image
                if(editText.getText().toString() == "creeper"){
                    phone_icon.setVisibility(View.VISIBLE);
                    return true;
                } else {
                    //if incorrect say password is incorrect
                    textView2.setText("incorrect password...");
                }
                return false;
            }
        });
    }


}
