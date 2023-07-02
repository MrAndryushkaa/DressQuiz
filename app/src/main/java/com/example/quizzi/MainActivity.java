package com.example.quizzi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String selectedTopic = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout medium = findViewById(R.id.medium);
        final LinearLayout easy = findViewById(R.id.easy);
        final LinearLayout hard = findViewById(R.id.hard);
        final LinearLayout hardcore = findViewById(R.id.hardcore);

        final Button startQuizBtn = findViewById(R.id.StartQuizBtn);

        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopic = "medium";
                medium.setBackgroundResource(R.drawable.round_back_idi);

                easy.setBackgroundResource(R.drawable.round_back_white10);
                hard.setBackgroundResource(R.drawable.round_back_white10);
                hardcore.setBackgroundResource(R.drawable.round_back_white10);
                startQuizBtn.setBackgroundResource(R.drawable.round_back_btn_green);
            }
        });

        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopic = "easy";

                easy.setBackgroundResource(R.drawable.round_back_idi);

                medium.setBackgroundResource(R.drawable.round_back_white10);
                hard.setBackgroundResource(R.drawable.round_back_white10);
                hardcore.setBackgroundResource(R.drawable.round_back_white10);
                startQuizBtn.setBackgroundResource(R.drawable.round_back_btn_green);

            }
        });

        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopic = "hard";

                hard.setBackgroundResource(R.drawable.round_back_idi);

                medium.setBackgroundResource(R.drawable.round_back_white10);
                easy.setBackgroundResource(R.drawable.round_back_white10);
                hardcore.setBackgroundResource(R.drawable.round_back_white10);
                startQuizBtn.setBackgroundResource(R.drawable.round_back_btn_green);

            }
        });

        hardcore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopic = "hardcore";

                hardcore.setBackgroundResource(R.drawable.round_back_idi);

                medium.setBackgroundResource(R.drawable.round_back_white10);
                easy.setBackgroundResource(R.drawable.round_back_white10);
                hard.setBackgroundResource(R.drawable.round_back_white10);
                startQuizBtn.setBackgroundResource(R.drawable.round_back_btn_green);

            }
        });

        startQuizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (selectedTopic.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Выберите викторину", Toast.LENGTH_LONG).show();
                } else {
                    Intent intent = new Intent(MainActivity.this, QuizziActivity.class );
                    intent.putExtra("selectedTopic", selectedTopic);
                    startActivity(intent);
                    finish();
                }
            }

        });

    }
}