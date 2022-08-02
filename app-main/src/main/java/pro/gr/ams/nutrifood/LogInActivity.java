package pro.gr.ams.nutrifood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LogInActivity extends AppCompatActivity {

    SQLiteDatabase db;
    SQLiteOpenHelper openHelper;
    Cursor cursor;
    Button _btnlog, _btnreg;
    EditText _txtEmail, _txtPass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        _txtEmail = (EditText) findViewById(R.id.txtemail);
        _txtPass = (EditText) findViewById(R.id.txtpass);
        _btnlog = (Button) findViewById(R.id.btnlog);
        _btnreg = (Button) findViewById(R.id.btnreg);
        openHelper = new SQLiteDBHelper(this);


        _btnlog.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String email = _txtEmail.getText().toString();
                String pass = _txtPass.getText().toString();
                db = openHelper.getWritableDatabase();
                cursor = db.rawQuery("SELECT * FROM tblRegistration WHERE Email=? AND Password=?", new String[]{email, pass});
                if (cursor !=null){
                    if (cursor.getCount() > 0)
                    {
                        //Toast.makeText(LogInActivity.this,"Login Success", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent (LogInActivity.this, FoodListActivity.class);
                        startActivity(intent);
                        finish();
                    }
                    else {
                        Toast.makeText(LogInActivity.this,"Login Failed", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(LogInActivity.this, "Login Error", Toast.LENGTH_SHORT).show();
                }
            }
        });

        _btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(i);
                finish();
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