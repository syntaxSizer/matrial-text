package matrial.aka.matrial_text;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Matrial_text extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrial_text);
        btn();
    }



    private void btn() {
        Button butt;
        butt = (Button) findViewById(R.id.button);
        butt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Matrial_text.this, Ripple_Effect.class);
                startActivity(intent);
            }
        });

    }
}