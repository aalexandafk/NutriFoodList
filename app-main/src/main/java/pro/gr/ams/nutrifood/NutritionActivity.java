package pro.gr.ams.nutrifood;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;

public class NutritionActivity extends AppCompatActivity {

    private String ConvertedCalories;
    private ImageView nutritionMGVW;
    private TextView nutritionTXTVW;
    private ScrollView nutritionSCRLLVW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition);

        getRecipeData();
        getView();
    }

    private void getView() {

        nutritionMGVW = (ImageView)findViewById(R.id.nutritionMGVW);
        nutritionTXTVW = (TextView)findViewById(R.id.nutritionTXTVW);
        nutritionSCRLLVW = (ScrollView)findViewById(R.id.nutritionSCRLLVW);
        
        InputStream is = null;
        try {
            is = this.getResources().getAssets().open(ConvertedCalories);
        } catch (IOException e) {
            //Log.w("EL", e);
            nutritionMGVW.setVisibility(View.GONE);
            nutritionTXTVW.setText(ConvertedCalories);
            nutritionSCRLLVW.setVisibility(View.VISIBLE);
        }
        Bitmap image = BitmapFactory.decodeStream(is);
        nutritionMGVW.setImageBitmap( image);
    }


    private void getRecipeData() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            ConvertedCalories = extras.getString("ConvertedCalories");;
        } else {
            finish();
        }
    }
}