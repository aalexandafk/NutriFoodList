package pro.gr.ams.nutrifood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class PostActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner spinner;
    private String category_id;
    private Button btnpost;
    private TextView txtrecipetitle;
    private TextView txtcontent;
    private TextView txtnutrition;
    private String recipeTitle;
    private String content;
    private String nutrition;

    SQLiteDatabase db;
    SQLiteOpenHelper openHelper;
    private String CHANNEL_ID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

        openHelper = new SQLiteDBHelper(this);

        getView();
        setSpinner();
    }

    private void getView() {
        btnpost = (Button)findViewById(R.id.btnpost);
        txtrecipetitle = (TextView)findViewById(R.id.txtrecipetitle);
        txtcontent = (TextView)findViewById(R.id.txtcontent);
        txtnutrition = (TextView)findViewById(R.id.txtnutrition);
        btnpost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recipeTitle = txtrecipetitle.getText().toString();
                content = txtcontent.getText().toString();
                nutrition = txtnutrition.getText().toString();
                if (recipeTitle.length() == 0 || content.length() == 0 || nutrition.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Please complete the required fields!", Toast.LENGTH_SHORT).show();
                }
                else {
                    db = openHelper.getWritableDatabase();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("RecipeTitle", recipeTitle);
                    contentValues.put("ContentOne", content);
                    contentValues.put("ContentTwo", "");
                    contentValues.put("ContentThree", "");
                    contentValues.put("ConvertedCalories", nutrition);
                    contentValues.put("Category", category_id);
                    contentValues.put("AssetOne", "");
                    contentValues.put("AssetTwo", "");
                    contentValues.put("AssetThree", "");
                    long id = db.insert("tblRecipes", null, contentValues);
                    Toast.makeText(getApplicationContext(), "Recipe posted", Toast.LENGTH_LONG).show();

                    CHANNEL_ID = "My Notification";

                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                        NotificationChannel channel = new NotificationChannel("My Notification", "My Notification", NotificationManager.IMPORTANCE_DEFAULT);
                        NotificationManager manager = getSystemService(NotificationManager.class);
                        manager.createNotificationChannel(channel);
                    }

                    NotificationCompat.Builder builder = new NotificationCompat.Builder(PostActivity.this, CHANNEL_ID)
                            .setSmallIcon(R.drawable.notification_icon)
                            .setContentTitle("New recipe posted.")
                            .setContentText("Check " + recipeTitle + ".")
                            .setAutoCancel(true);

                    NotificationManagerCompat managerCompat = NotificationManagerCompat.from(PostActivity.this);
                    managerCompat.notify(1, builder.build());


                    finish();
                }
            }
        });
    }


    private void setSpinner() {
        spinner = findViewById(R.id.spinner);

        spinner.setOnItemSelectedListener(this);

        List<String> categories = new ArrayList<String>();
        categories.add("Quick and Easy");
        categories.add("Diet");
        categories.add("Low Sugar");
        categories.add("Low Calories");
        categories.add("Healthy Breakfast");
        categories.add("Healthy Launch");
        categories.add("Healthy Dinner");
        categories.add("Healthy Snacks");
        categories.add("Healthy Deserts");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(dataAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String item = parent.getItemAtPosition(position).toString();
        if (item.equals("Quick and Easy")) {
            category_id = "1";
        }
        else if (item.equals("Diet")) {
            category_id = "2";
        }
        else if (item.equals("Low Sugar")) {
            category_id = "3";
        }
        else if (item.equals("Low Calories")) {
            category_id = "4";
        }
        else if (item.equals("Healthy Breakfast")) {
            category_id = "5";
        }
        else if (item.equals("Healthy Launch")) {
            category_id = "6";
        }
        else if (item.equals("Healthy Dinner")) {
            category_id = "7";
        }
        else if (item.equals("Healthy Snacks")) {
            category_id = "8";
        }
        else if (item.equals("Healthy Deserts")) {
            category_id = "9";
        }
    }
    public void onNothingSelected(AdapterView<?> arg0) {

    }
}