package justor.prezent2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Wszystkie_powody extends AppCompatActivity {
    public static int number=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wszystkie_powody);

        //here I've linked every button with activity and I gave them numbers

        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=1;
            }});

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_4.class);
                startActivity(myIntent);
                number=2;

            }});
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=3;
            }});
        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_4.class);
                startActivity(myIntent);
                number=4;
            }});
        findViewById(R.id.button5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=5;
            }});
        findViewById(R.id.button6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_4.class);
                startActivity(myIntent);
                number=6;
            }});
        findViewById(R.id.button7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=7;
            }});
        findViewById(R.id.button8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=8;
            }});
        findViewById(R.id.button9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=9;
            }});
        findViewById(R.id.button10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=10;
            }});

        findViewById(R.id.button11).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=11;
            }});
        findViewById(R.id.button12).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=12;
            }});
        findViewById(R.id.button13).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=13;
            }});
        findViewById(R.id.button14).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=14;
            }});
        findViewById(R.id.button15).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=15;
            }});
        findViewById(R.id.button16).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=16;
            }});
        findViewById(R.id.button17).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=17;
            }});
        findViewById(R.id.button18).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=18;
            }});
        findViewById(R.id.button19).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=19;
            }});
        findViewById(R.id.button20).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=20;
            }});
        findViewById(R.id.button21).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_4.class);
                startActivity(myIntent);
                number=21;
            }});
        findViewById(R.id.button22).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=22;
            }});
        findViewById(R.id.button23).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=23;
            }});
        findViewById(R.id.button24).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=24;
            }});
        findViewById(R.id.button25).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=25;
            }});
        findViewById(R.id.button26).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=26;
            }});
        findViewById(R.id.button27).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=27;
            }});
        findViewById(R.id.button28).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=28;
            }});
        findViewById(R.id.button29).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=29;
            }});
        findViewById(R.id.button30).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=30;
            }});
        findViewById(R.id.button31).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=31;
            }});
        findViewById(R.id.button32).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=32;
            }});
        findViewById(R.id.button33).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_4.class);
                startActivity(myIntent);
                number=33;
            }});
        findViewById(R.id.button34).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=34;
            }});
        findViewById(R.id.button35).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=35;
            }});
        findViewById(R.id.button36).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=36;
            }});
        findViewById(R.id.button37).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_4.class);
                startActivity(myIntent);
                number=37;
            }});
        findViewById(R.id.button38).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=38;
            }});
        findViewById(R.id.button39).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=39;
            }});
        findViewById(R.id.button40).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=40;
            }});
        findViewById(R.id.button41).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=41;
            }});
        findViewById(R.id.button42).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=42;
            }});
        findViewById(R.id.button43).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=43;
            }});
        findViewById(R.id.button44).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=44;
            }});
        findViewById(R.id.button45).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=45;
            }});
        findViewById(R.id.button46).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=46;
            }});
        findViewById(R.id.button47).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=47;
            }});
        findViewById(R.id.button48).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=48;
            }});
        findViewById(R.id.button49).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=49;
            }});
        findViewById(R.id.button50).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_4.class);
                startActivity(myIntent);
                number=50;
            }});
        findViewById(R.id.button51).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=51;
            }});
        findViewById(R.id.button52).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=52;
            }});
        findViewById(R.id.button53).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=53;
            }});
        findViewById(R.id.button54).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=54;
            }});
        findViewById(R.id.button55).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=55;
            }});
        findViewById(R.id.button56).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=56;
            }});
        findViewById(R.id.button57).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=57;
            }});
        findViewById(R.id.button58).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=58;
            }});
        findViewById(R.id.button59).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=59;
            }});
        findViewById(R.id.button60).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=60;
            }});
        findViewById(R.id.button61).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_4.class);
                startActivity(myIntent);
                number=61;
            }});
        findViewById(R.id.button62).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=62;
            }});
        findViewById(R.id.button63).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=63;
            }});
        findViewById(R.id.button64).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=64;
            }});
        findViewById(R.id.button65).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_4.class);
                startActivity(myIntent);
                number=65;
            }});
        findViewById(R.id.button66).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=66;
            }});
        findViewById(R.id.button67).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=67;
            }});
        findViewById(R.id.button68).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=68;
            }});
        findViewById(R.id.button69).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=69;
            }});
        findViewById(R.id.button70).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=70;
            }});
        findViewById(R.id.button71).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=71;
            }});
        findViewById(R.id.button72).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_4.class);
                startActivity(myIntent);
                number=72;
            }});
        findViewById(R.id.button73).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=73;
            }});
        findViewById(R.id.button74).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=74;
            }});
        findViewById(R.id.button75).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=75;
            }});
        findViewById(R.id.button76).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_4.class);
                startActivity(myIntent);
                number=76;
            }});
        findViewById(R.id.button77).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=77;
            }});
        findViewById(R.id.button78).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=78;
            }});
        findViewById(R.id.button79).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=79;
            }});
        findViewById(R.id.button80).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=80;
            }});
        findViewById(R.id.button81).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=81;
            }});
        findViewById(R.id.button82).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=82;
            }});
        findViewById(R.id.button83).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=83;
            }});
        findViewById(R.id.button84).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=84;
            }});
        findViewById(R.id.button85).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=85;
            }});
        findViewById(R.id.button86).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=86;
            }});
        findViewById(R.id.button87).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=87;
            }});
        findViewById(R.id.button88).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_4.class);
                startActivity(myIntent);
                number=88;
            }});
        findViewById(R.id.button89).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=89;
            }});
        findViewById(R.id.button90).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=90;
            }});
        findViewById(R.id.button91).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=91;
            }});
        findViewById(R.id.button92).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=92;
            }});
        findViewById(R.id.button93).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=93;
            }});
        findViewById(R.id.button94).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=94;
            }});
        findViewById(R.id.button95).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=95;
            }});
        findViewById(R.id.button96).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_4.class);
                startActivity(myIntent);
                number=96;
            }});
        findViewById(R.id.button97).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=97;
            }});
        findViewById(R.id.button98).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=98;
            }});
        findViewById(R.id.button99).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=99;
            }});
        findViewById(R.id.button100).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=100;
            }});
        findViewById(R.id.button101).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=101;
            }});
        findViewById(R.id.button102).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=102;
            }});
        findViewById(R.id.button103).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=103;
            }});
        findViewById(R.id.button104).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=104;
            }});
        findViewById(R.id.button105).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_4.class);
                startActivity(myIntent);
                number=105;
            }});
        findViewById(R.id.button106).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=106;
            }});
        findViewById(R.id.button107).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=107;
            }});
        findViewById(R.id.button108).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=108;
            }});
        findViewById(R.id.button109).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=109;
            }});
        findViewById(R.id.button110).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Wszystkie_powody.this, Powod_1.class);
                startActivity(myIntent);
                number=110;
            }});

    }

}