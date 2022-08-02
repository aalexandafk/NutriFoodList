package pro.gr.ams.nutrifood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class FoodListActivity extends AppCompatActivity {

    private ImageButton category001MGBTTN;
    private ImageButton category002MGBTTN;
    private ImageButton category003MGBTTN;
    private ImageButton category004MGBTTN;
    private ImageButton category005MGBTTN;
    private ImageButton category006MGBTTN;
    private ImageButton category007MGBTTN;
    private ImageButton category008MGBTTN;
    private ImageButton category009MGBTTN;
    private FloatingActionButton postFLTNGCTNBTTN;
    private FloatingActionButton searchFLTNGCTNBTTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);

        getView();

    }

    private void getView() {
        category001MGBTTN = (ImageButton)findViewById(R.id.category001MGBTTN);
        category002MGBTTN = (ImageButton)findViewById(R.id.category002MGBTTN);
        category003MGBTTN = (ImageButton)findViewById(R.id.category003MGBTTN);
        category004MGBTTN = (ImageButton)findViewById(R.id.category004MGBTTN);
        category005MGBTTN = (ImageButton)findViewById(R.id.category005MGBTTN);
        category006MGBTTN = (ImageButton)findViewById(R.id.category006MGBTTN);
        category007MGBTTN = (ImageButton)findViewById(R.id.category007MGBTTN);
        category008MGBTTN = (ImageButton)findViewById(R.id.category008MGBTTN);
        category009MGBTTN = (ImageButton)findViewById(R.id.category009MGBTTN);
        postFLTNGCTNBTTN = (FloatingActionButton)findViewById(R.id.postFLTNGCTNBTTN);
        searchFLTNGCTNBTTN = (FloatingActionButton)findViewById(R.id.searchFLTNGCTNBTTN);

        category001MGBTTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), CategoryRecipeActivity.class);
                i.putExtra("category_id", "1");
                startActivity(i);
            }
        });

        category002MGBTTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), CategoryRecipeActivity.class);
                i.putExtra("category_id", "2");
                startActivity(i);
            }
        });

        category003MGBTTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), CategoryRecipeActivity.class);
                i.putExtra("category_id", "3");
                startActivity(i);
            }
        });


        category004MGBTTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), CategoryRecipeActivity.class);
                i.putExtra("category_id", "4");
                startActivity(i);
            }
        });


        category005MGBTTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), CategoryRecipeActivity.class);
                i.putExtra("category_id", "5");
                startActivity(i);
            }
        });


        category006MGBTTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), CategoryRecipeActivity.class);
                i.putExtra("category_id", "6");
                startActivity(i);
            }
        });


        category007MGBTTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), CategoryRecipeActivity.class);
                i.putExtra("category_id", "7");
                startActivity(i);
            }
        });


        category008MGBTTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), CategoryRecipeActivity.class);
                i.putExtra("category_id", "8");
                startActivity(i);
            }
        });


        category009MGBTTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), CategoryRecipeActivity.class);
                i.putExtra("category_id", "9");
                startActivity(i);
            }
        });

        searchFLTNGCTNBTTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), SearchActivity.class);
                startActivity(i);
            }
        });


        postFLTNGCTNBTTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), PostActivity.class);
                startActivity(i);
            }
        });


    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
        finish();
    }
}