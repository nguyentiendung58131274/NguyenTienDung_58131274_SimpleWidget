package vn.edu.ntu.nguyentiendung.nguyentiendung_58131274_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtName, edtDate, edtKhac;
    RadioGroup rgbGT;
    CheckBox cbMovie, cbMusic, cbFriend, cbAtHome, cbCooking;
    Button bntResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addView();
        addEvent();
    }

    private void addView()
    {
        edtName = findViewById(R.id.edtName);
        edtDate = findViewById(R.id.edtDate);
        edtKhac = findViewById(R.id.editKhac);
        rgbGT = findViewById(R.id.rgbGT);
        bntResult = findViewById(R.id.bntResult);
        cbMovie = findViewById(R.id.cbMovie);
        cbMusic = findViewById(R.id.cbMusic);
        cbFriend = findViewById(R.id.cbFriend);
        cbAtHome = findViewById(R.id.cbAtHome);
        cbCooking = findViewById(R.id.cbCooking);
    }

    private void addEvent()
    {
        bntResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KetQua();
            }
        });
    }

    private void KetQua()
    {
        StringBuilder result = new StringBuilder();
        result.append(edtName.getText().toString());
        result.append("\nNgày sinh: " + edtDate.getText().toString());
        switch (rgbGT.getCheckedRadioButtonId())
        {
            case R.id.rbNam:
                result.append("\nGiới tính: Nam");
                break;
            case R.id.rbNu:
                result.append("\nGiới tính: Nữ");
                break;
        }
        result.append("\nSở thích: ");
        if (cbMovie.isChecked())
            result.append(cbMovie.getText().toString());
        if (cbMusic.isChecked())
            result.append("; " + cbMusic.getText().toString());
        if (cbFriend.isChecked())
            result.append("; " + cbFriend.getText().toString());
        if (cbAtHome.isChecked())
            result.append("; " + cbAtHome.getText().toString());
        if (cbCooking.isChecked())
            result.append("; " + cbCooking.getText().toString());
        if (edtKhac!=null)
            result.append("; " + edtKhac.getText().toString());
        Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
    }
}
