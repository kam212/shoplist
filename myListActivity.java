package com.example.shoplist;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


public class myListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_list);

        ImageButton imageButton2 = findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(view -> startActivity(new Intent(myListActivity.this, MainActivity.class)));
}
}
