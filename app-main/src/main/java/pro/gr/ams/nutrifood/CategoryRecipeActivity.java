package pro.gr.ams.nutrifood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class CategoryRecipeActivity extends AppCompatActivity {

    private String category_id;

    private String searchQuery;
    private FloatingActionButton fab;
    private LinearLayout defaultViewLayout;
    private SQLiteDBHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_recipe);

        try {
            myDb = new SQLiteDBHelper(this);
            getCategoryData();
            getView();
            retrieveEmergencies();
        }
        catch (Exception ex) {
            Toast.makeText(getApplicationContext(), ""+ex, Toast.LENGTH_LONG).show();
        }
    }

    private void getView() {
        defaultViewLayout = (LinearLayout)findViewById(R.id.defaultViewLayout);
    }


    private void getCategoryData() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            category_id = extras.getString("category_id");
        } else {
            finish();
        }
    }


    public void retrieveEmergencies() {
        defaultViewLayout.removeAllViews();
        Cursor res = myDb.getRecipes(category_id);
        while (res.moveToNext()) {
            String ID = res.getString(0) + "";
            String RecipeTitle = res.getString(1) + "";
            String ContentOne = res.getString(2) + "";
            String ContentTwo = res.getString(3) + "";
            String ContentThree = res.getString(4) + "";
            String ConvertedCalories = res.getString(5) + "";
            String Video = res.getString(6) + "";
            String Category = res.getString(7) + "";
            String AssetOne = res.getString(8) + "";
            String AssetTwo = res.getString(9) + "";
            String AssetThree = res.getString(10) + "";

            displayData(ID ,RecipeTitle, ContentOne, ContentTwo, ContentThree, ConvertedCalories, Video, Category, AssetOne, AssetTwo, AssetThree);
        }
    }
    private void displayData(String id, String emergencyTitle, String contentOne, String contentTwo, String contentThree, String convertedCalories, String video, String category, String assetOne, String assetTwo, String assetThree) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.weight = 1.0f;
        layoutParams.setMargins(0, 0, 0, 0);

        LinearLayout.LayoutParams wrapWidthParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        wrapWidthParams.weight = 1.0f;
        wrapWidthParams.setMargins(0, 0, 0, 0);

        LinearLayout dataLinearLayout = new LinearLayout(this);
        dataLinearLayout.setOrientation(LinearLayout.VERTICAL);
        dataLinearLayout.setLayoutParams(layoutParams);

        LinearLayout imageAndDataLinearLayout = new LinearLayout(this);
        imageAndDataLinearLayout.setOrientation(LinearLayout.HORIZONTAL);
        imageAndDataLinearLayout.setLayoutParams(wrapWidthParams);

        LinearLayout userDataLinearLayout = new LinearLayout(this);
        userDataLinearLayout.setOrientation(LinearLayout.VERTICAL);
        userDataLinearLayout.setLayoutParams(wrapWidthParams);

        TextView nameTXTVW = new TextView(this);
        nameTXTVW.setPadding(5, 2, 5, 0);
        nameTXTVW.setText(emergencyTitle);
        nameTXTVW.setTextSize(16);
        nameTXTVW.setTypeface(null, Typeface.BOLD);
        nameTXTVW.setTextColor(Color.LTGRAY);

        String contentCut = "";
        try {
            contentCut = (contentOne + contentTwo + contentThree).substring(0, 5);
            contentCut = contentOne.substring(0, 100) + "...";
        }catch (Exception ex) {
            contentCut = "...";
        }

        TextView defTXTVW = new TextView(this);
        defTXTVW.setPadding(5, 2, 5, 0);
        defTXTVW.setText(contentCut);
        defTXTVW.setTextSize(14);
        defTXTVW.setTextColor(Color.LTGRAY);

        TextView lineTXTVW = new TextView(this);
        //lineTXTVW.setBackgroundColor(Color.parseColor("#f0f0f0"));
        lineTXTVW.setHeight(5);

        imageAndDataLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), RecipeActivity.class);
                i.putExtra("ID", id);
                i.putExtra("RecipeTitle", emergencyTitle);
                i.putExtra("ContentOne", contentOne);
                i.putExtra("ContentTwo", contentTwo);
                i.putExtra("ContentThree", contentThree);
                i.putExtra("ConvertedCalories", convertedCalories);
                i.putExtra("Video", video);
                i.putExtra("Category", category);
                i.putExtra("AssetOne", assetOne);
                i.putExtra("AssetTwo", assetTwo);
                i.putExtra("AssetThree", assetThree);
                startActivity(i);
            }
        });

        imageAndDataLinearLayout.setPadding(30, 30, 30, 30);
        userDataLinearLayout.addView(nameTXTVW);
        userDataLinearLayout.addView(defTXTVW);
        userDataLinearLayout.setPadding(15, 0, 0, 0);
        userDataLinearLayout.setBackgroundColor(Color.parseColor("#aa6628"));
        imageAndDataLinearLayout.addView(userDataLinearLayout);
        dataLinearLayout.addView(imageAndDataLinearLayout);
        dataLinearLayout.addView(lineTXTVW);
        defaultViewLayout.addView(dataLinearLayout);
    }
}