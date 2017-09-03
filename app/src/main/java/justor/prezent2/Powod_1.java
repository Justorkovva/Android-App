package justor.prezent2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.security.SecureRandom;
import static justor.prezent2.R.layout.powod_1;
import static justor.prezent2.Wszystkie_powody.number;

public class Powod_1 extends Activity {
int number_bg=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(powod_1);

        TextView Powod = (TextView) findViewById(R.id.Powod);
        LinearLayout aplikacja = (LinearLayout) findViewById(R.id.aplikacja);

        SecureRandom random=new SecureRandom();
        number_bg=random.nextInt(12)+1;

        // random backgrounds for activities
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

            /*every button in "wszystkie_powody" has a different number, and used to show unique content
         (in the original app - in this one I removed all of it, and left framework only.
         Some of the generated activities had only text, and the others had images as well ("powod_4") :)
          I left only 4 of 110 cases below, because as I said in readme file it was
          a private app - gift for a friend */

switch(number) {
    case 1:
        Powod.setText("Something");
        break;
    case 2:
        Powod.setText("Test");
        break;
    case 3:
        Powod.setText("1,2,3");
        break;
    case 5:
        Powod.setText("Hello");
        break;

    default:
        Powod.setText("105 buttons have this line. Hope it's good");
        break;

}}
}