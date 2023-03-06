package com.example.test3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Button b_return = findViewById(R.id.button_return);
        b_return.setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.putExtra("data_return","Hello by button");
            setResult(RESULT_OK,intent);
            finish();
        });

        Button b_change_view = findViewById(R.id.button_change_image);
        ImageView imageView = findViewById(R.id.imageViewTest);
        b_change_view.setOnClickListener(view -> imageView.setImageResource(R.drawable.oasis_1080));

        Button b_change_progressBar = findViewById(R.id.button_change_progressBar);
        ProgressBar progressBar = findViewById(R.id.progressBarTest);
        b_change_progressBar.setOnClickListener(view -> {if (progressBar.getVisibility() == View.VISIBLE) progressBar.setVisibility(View.GONE);
            else progressBar.setVisibility(View.VISIBLE);});

        Button b_add_progressBar = findViewById(R.id.button_add_progressBar);
        b_add_progressBar.setOnClickListener(view -> progressBar.setProgress(progressBar.getProgress()+10));

        Button b_alertDialog = findViewById(R.id.button_alertDialog);
        b_alertDialog.setOnClickListener(view -> {
            AlertDialog dialog = new AlertDialog.Builder(this).setTitle("This is a Dialog").setMessage("Something Important").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(ThirdActivity.this, "OK", Toast.LENGTH_SHORT).show();
                    dialogInterface.dismiss();
                }
            }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(ThirdActivity.this, "Cancel", Toast.LENGTH_SHORT).show();
                    dialogInterface.dismiss();
                }
            }).show();
        });

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("data_return","Hello by finish");
        setResult(RESULT_OK,intent);
        finish();
    }
}