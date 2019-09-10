package myfirst.isuru.com.temperaturecricket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView ivTemp;
    TextView tvDes;
    EditText etTemp;
    Button btnSubmit;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivTemp=findViewById(R.id.ivTemp);
        tvDes=findViewById(R.id.tvDes);
        etTemp=findViewById(R.id.etTemp);
        btnSubmit=findViewById(R.id.btnSubmit);
        tvResult=findViewById(R.id.tvResult);
        tvResult.setVisibility(View.GONE);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String count=etTemp.getText().toString().trim();
                int count1=Integer.parseInt(count);
                int temp=(count1/3)+4;
                String txt=getString(R.string.txtTemp)+" "+temp;
                tvResult.setText(txt);
                tvResult.setVisibility(View.VISIBLE);
            }
        });
    }
}
