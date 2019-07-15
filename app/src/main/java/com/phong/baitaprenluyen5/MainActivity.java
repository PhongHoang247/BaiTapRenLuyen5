package com.phong.baitaprenluyen5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edtTen, edtChieuCao, edtCanNang;
    Button btnBMI;
    TextView txtBMI, txtChanDoan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
        btnBMI.setOnClickListener(this);
    }

    private void addControls() {
        edtTen = (EditText) findViewById(R.id.edtTen);
        edtChieuCao = (EditText) findViewById(R.id.edtChieuCao);
        edtCanNang = (EditText) findViewById(R.id.edtCanNang);
        btnBMI = (Button) findViewById(R.id.btnBMI);
        txtBMI = (TextView) findViewById(R.id.txtBMI);
        txtChanDoan = (TextView) findViewById(R.id.txtChanDoan);
    }

    @Override
    public void onClick(View view) {
        if (view.equals(btnBMI))
        {
            XuLyTinhBMI();
        }
    }

    private void XuLyTinhBMI() {
        double h = Double.parseDouble(edtChieuCao.getText().toString());
        double w = Double.parseDouble(edtCanNang.getText().toString());
        double BMI = w/Math.pow(h,2);
        txtBMI.setText(BMI+"");//Nhớ cộng thêm "" vì text gán vào là chuỗi
        if (BMI<18)
        {
            txtChanDoan.setText(edtTen.getText().toString() + " là người gầy!");
        }
        else if (BMI<=24.9)
        {
            txtChanDoan.setText(edtTen.getText().toString() + " là người bình thường!");
        }
        else if (BMI<=29.9)
        {
            txtChanDoan.setText(edtTen.getText().toString() + " là người béo phì độ 1!");
        }
        else if (BMI<=34.9)
        {
            txtChanDoan.setText(edtTen.getText().toString() + " là người béo phì độ 2!");
        }
        else
        {
            txtChanDoan.setText(edtTen.getText().toString() + " là người béo phì độ 3!");
        }
    }
}
