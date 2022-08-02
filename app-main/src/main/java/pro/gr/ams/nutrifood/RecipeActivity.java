package pro.gr.ams.nutrifood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.io.IOException;
import java.io.InputStream;

public class RecipeActivity extends AppCompatActivity {

    private TextView contentOneTXTVW;
    private TextView contentTwoTXTVW;
    private TextView contentThreeTXTVW;
    private LinearLayout defaultViewLayout;
    private String ID;
    private String RecipeTitle;
    private String ContentOne;
    private String ContentTwo;
    private String ContentThree;
    private String ConvertedCalories;
    private String Video;
    private String Category;
    private String AssetOne;
    private String AssetTwo;
    private String AssetThree;
    private ImageView backMGVW;
    private TextView titleTXTVW;
    private ImageView assetOneMGVW;
    private ImageView assetTwoMGVW;
    private ImageView assetThreeMGVW;
    private FloatingActionButton nutritionFLTNGCTNBTTN;
    private FloatingActionButton videoFLTNGCTNBTTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        getRecipeData();
        getView();
        checkImage();
        checkContent();
    }

    private void checkContent() {

        if (ContentOne.length() != 0) {
            contentOneTXTVW.setVisibility(View.VISIBLE);
            contentOneTXTVW.setText(ContentOne);
        }
        if (ContentTwo.length() != 0) {
            contentTwoTXTVW.setVisibility(View.VISIBLE);
            contentTwoTXTVW.setText(ContentTwo);
        }
        if (ContentThree.length() != 0) {
            contentThreeTXTVW.setVisibility(View.VISIBLE);
            contentThreeTXTVW.setText(ContentThree);

        }
    }

    private void checkImage() {

        if (AssetOne.length() != 0) {
            assetOneMGVW.setVisibility(View.VISIBLE);

            InputStream is = null;
            try {
                is = this.getResources().getAssets().open(AssetOne);
            } catch (IOException e) {
                Log.w("EL", e);
            }
            Bitmap image = BitmapFactory.decodeStream(is);
            assetOneMGVW.setImageBitmap( image);
        }
        if (AssetTwo.length() != 0) {
            assetTwoMGVW.setVisibility(View.VISIBLE);

            InputStream is = null;
            try {
                is = this.getResources().getAssets().open(AssetTwo);
            } catch (IOException e) {
                Log.w("EL", e);
            }
            Bitmap image = BitmapFactory.decodeStream(is);
            assetTwoMGVW.setImageBitmap( image);
        }
        if (AssetThree.length() != 0) {
            assetThreeMGVW.setVisibility(View.VISIBLE);

            InputStream is = null;
            try {
                is = this.getResources().getAssets().open(AssetThree);
            } catch (IOException e) {
                Log.w("EL", e);
            }
            Bitmap image = BitmapFactory.decodeStream(is);
            assetThreeMGVW.setImageBitmap( image);
        }
    }

    private void getView() {
        contentOneTXTVW = (TextView)findViewById(R.id.contentOneTXTVW);
        contentTwoTXTVW = (TextView)findViewById(R.id.contentTwoTXTVW);
        contentThreeTXTVW = (TextView)findViewById(R.id.contentThreeTXTVW);
        defaultViewLayout = (LinearLayout)findViewById(R.id.defaultViewLayout);
        backMGVW = (ImageView)findViewById(R.id.backMGVW);
        titleTXTVW = (TextView)findViewById(R.id.titleTXTVW);
        titleTXTVW.setText(RecipeTitle);
        assetOneMGVW = (ImageView)findViewById(R.id.assetOneMGVW);
        assetTwoMGVW = (ImageView)findViewById(R.id.assetTwoMGVW);
        assetThreeMGVW = (ImageView)findViewById(R.id.assetThreeMGVW);
        nutritionFLTNGCTNBTTN = (FloatingActionButton)findViewById(R.id.nutritionFLTNGCTNBTTN);
        videoFLTNGCTNBTTN = (FloatingActionButton)findViewById(R.id.videoFLTNGCTNBTTN);

        backMGVW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        nutritionFLTNGCTNBTTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), NutritionActivity.class);
                i.putExtra("ConvertedCalories",ConvertedCalories);
                startActivity(i);
            }
        });


        if (Video.length() != 0) {
            videoFLTNGCTNBTTN.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(Video));
                    startActivity(i);
                }
            });
            videoFLTNGCTNBTTN.setVisibility(View.VISIBLE);
        }
    }


    private void getRecipeData() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            ID = extras.getString("ID");
            RecipeTitle = extras.getString("RecipeTitle");
            ContentOne = extras.getString("ContentOne");
            ContentTwo = extras.getString("ContentTwo");
            ContentThree = extras.getString("ContentThree");;
            ConvertedCalories = extras.getString("ConvertedCalories");;
            Video = extras.getString("Video");;
            Category = extras.getString("Category");
            AssetOne = extras.getString("AssetOne");
            AssetTwo = extras.getString("AssetTwo");
            AssetThree = extras.getString("AssetThree");
        } else {
            finish();
        }
    }
}