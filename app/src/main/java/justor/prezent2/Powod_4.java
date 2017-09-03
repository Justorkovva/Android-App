package justor.prezent2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.security.SecureRandom;
import static justor.prezent2.Wszystkie_powody.number;

public class Powod_4 extends Activity {
int number_bg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.powod_4);
        TextView powod= (TextView) findViewById(R.id.text_powod_4);
        ImageView image= (ImageView) findViewById(R.id.imageView_powod_4);
        RelativeLayout aplikacja = (RelativeLayout) findViewById(R.id.aplikacja);
        SecureRandom random=new SecureRandom();
        number_bg=random.nextInt(12)+1;

        //random backgrounds
        switch(number_bg) {
            case 1:
                aplikacja.setBackgroundResource(R.drawable.bg1);
                break;
            case 2:
                aplikacja.setBackgroundResource(R.drawable.bg2);
                break;
            case 3:
                aplikacja.setBackgroundResource(R.drawable.bg3);
                break;
            case 4:
                aplikacja.setBackgroundResource(R.drawable.bg4);
                break;
            case 5:
                aplikacja.setBackgroundResource(R.drawable.bg5);
                break;
            case 6:
                aplikacja.setBackgroundResource(R.drawable.bg6);
                break;
            case 7:
                aplikacja.setBackgroundResource(R.drawable.bg7);
                break;
            case 8:
                aplikacja.setBackgroundResource(R.drawable.bg8);
                break;
            case 9:
                aplikacja.setBackgroundResource(R.drawable.bg9);
                break;
            case 10:
                aplikacja.setBackgroundResource(R.drawable.bg10);
                break;
            case 11:
                aplikacja.setBackgroundResource(R.drawable.bg11);
                break;
            case 12:
                aplikacja.setBackgroundResource(R.drawable.bg12);
                break;
            default:
                aplikacja.setBackgroundResource(R.drawable.bg1);
                break;
        }
        /*just like in "powod_1" - I'll leave only 2 cases to show how I did it.
        I replaced my images with some cats*/

        switch(number) {

            case 2:
                powod.setText("Fluffy Norwegian Forest Cat");
                image.setImageResource(R.drawable.fluff);
                break;
            case 4:
                powod.setText("Weird Cat");
                image.setImageResource(R.drawable.weird_cat);
                break;
            default:
                powod.setText("Smart Cat");
                image.setImageResource(R.drawable.smart_cat);
                break;
        }
    }
}