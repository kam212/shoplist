import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.shoplisttwo.MainActivity;
import com.example.shoplisttwo.R;
import com.example.shoplisttwo.myListActivity;

public class Fruit extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fruit_checklist);

        ImageButton homeFruit = findViewById(R.id.imageHomeFruit);
        homeFruit.setOnClickListener(view -> startActivity(new Intent(Fruit.this, MainActivity.class)));
    }
}