package com.example.shoplist;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CheckActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_checklist);

        TextView title = findViewById(R.id.txtChecklistTitle);
    ListView listView = findViewById(R.id.listChecklist);

    String category = getIntent().getStringExtra("category");
    title.setText(category + " Checklist");


    String[] items = getItemsForCategory(category);


    ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
            android.R.layout.simple_list_item_multiple_choice, items);
    listView.setAdapter(adapter);
    listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
}

private String[] getItemsForCategory(String category) {
    switch (category) {
        case "Fruits":
            return new String[]{"Apples", "Bananas", "Oranges", "Grapes", "Mangoes"};
        case "Dairy":
            return new String[]{"Milk", "Cheese", "Butter", "Yogurt", "Cream"};
        case "Snacks":
            return new String[]{"Chips", "Cookies", "Popcorn", "Candy", "Crackers"};
        case "Supplies":
            return new String[]{"Notebooks", "Pens", "Pencils", "Markers", "Folders"};
        default:
            return new String[]{};
    }
}
}