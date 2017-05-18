package appewtc.masterung.fetlqrcode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ServiceActivity extends AppCompatActivity {

    //Explicit
    private TextView textView ;
    private ImageView barImageView,qrImageView;
    private ListView listView;
    private String nameString;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        //Initial view
        initialView();

        //Show Text
        nameString = getIntent().getStringExtra("Login");
        textView.setText(nameString);



    }   // Main Method

    private void initialView() {
        textView = (TextView) findViewById(R.id.txtNameLogin);
        barImageView = (ImageView) findViewById(R.id.imvBarCode);
        qrImageView = (ImageView) findViewById(R.id.imvQRCode);
        listView = (ListView) findViewById(R.id.livProduct);
    }

}   // Main Class
