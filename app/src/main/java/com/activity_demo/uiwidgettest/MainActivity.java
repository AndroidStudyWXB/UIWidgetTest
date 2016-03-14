package com.activity_demo.uiwidgettest;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private EditText editText;
    private ImageView imageView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button      = (Button) findViewById(R.id.button);
        button2     = (Button) findViewById(R.id.button2);
        button3     = (Button) findViewById(R.id.button3);
        button4     = (Button) findViewById(R.id.button4);
        button5     = (Button) findViewById(R.id.button5);
        editText    = (EditText)    findViewById(R.id.edit_text);
        imageView   = (ImageView)   findViewById(R.id.image_view);
        progressBar = (ProgressBar) findViewById(R.id.progress_bar);

        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                String inputText = editText.getText().toString();
                Toast.makeText(MainActivity.this, inputText, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("This is Dialog");
                dialog.setMessage("Something important...");
                dialog.setCancelable(false);
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                dialog.show();
                break;
            case R.id.button3:
                ProgressDialog progressDialg = new ProgressDialog(MainActivity.this);
                progressDialg.setTitle("This is ProgressDialog");
                progressDialg.setMessage("Loading...");
                progressDialg.setCancelable(true);
                progressDialg.show();
                break;
            case R.id.button4:
                imageView.setImageResource(R.drawable.potrait);
                break;
            case R.id.button5:
                int progerss = progressBar.getProgress();
                progerss = progerss + 10;
                progressBar.setProgress(progerss);
                break;
            default:
                break;
        }
    }
}
