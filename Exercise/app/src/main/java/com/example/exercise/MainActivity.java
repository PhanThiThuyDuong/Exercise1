package com.example.exercise;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtTextUser,edtTextPassword;
    Button btnDangki,btnDangnhap,btnThoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        ThoatApp();
    }

    private void ThoatApp() {
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this,android.R.style.Theme_Black_NoTitleBar);
                        builder.setTitle("Bạn có chắc thoát khỏi app");
                        builder.setMessage("Hãy lựa chọn xác nhận");
                        builder.setIcon(android.R.drawable.ic_dialog_alert);
                        builder.setPositiveButton("CÓ", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                onBackPressed();
                            }
                        });
                        builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                        builder.show();
            }
        });
    }
    private void AnhXa(){
        edtTextUser = (EditText)findViewById(R.id.edtTextUser);
        edtTextPassword =(EditText)findViewById(R.id.edtTextPassword);
        btnDangki = (Button)findViewById(R.id.btnDangki);
        btnDangnhap=(Button)findViewById(R.id.btnDangnhap);
        btnThoat=(Button)findViewById(R.id.btnThoat);

    }
}
