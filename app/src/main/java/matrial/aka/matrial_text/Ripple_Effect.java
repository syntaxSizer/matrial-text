package matrial.aka.matrial_text;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.andexert.library.RippleView;


/**
 * Created by geckozila on 31/05/16.
 */
public class Ripple_Effect extends AppCompatActivity{


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_ripple);


            final RippleView rippleView = (RippleView) findViewById(R.id.more);
            rippleView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //TODO: onRippleViewClick
                }
            });


// to use the Ripple view you have to use image view eg. icon ...
            // this one is not working because i was trying t use button instead of image view
//        final RippleView rippleView2 = (RippleView) findViewById(R.id.more2);
//        rippleView2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //TODO: onRippleViewClick
//            }
//        });

        }

    }


