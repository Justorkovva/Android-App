package justor.prezent2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import java.security.SecureRandom;

import static justor.prezent2.Wszystkie_powody.number;

public class Strona_startowa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strona_startowa);

        findViewById(R.id.imageButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //open new activity

                Intent myIntent = new Intent(Strona_startowa.this, Wszystkie_powody.class);
                startActivity(myIntent);
            }}
        );

        //shows random activity with text only
        findViewById(R.id.Losowanie).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent2 = new Intent(Strona_startowa.this, Powod_1.class);
                startActivity(myIntent2);
                SecureRandom random=new SecureRandom();
                number=random.nextInt(110)+1;
            }});
    }
}