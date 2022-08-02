package pro.gr.ams.nutrifood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class RegisterActivity extends AppCompatActivity {

    SQLiteDatabase db;
    SQLiteOpenHelper openHelper;
    Cursor cursor;
    Button _btnLogin, _btnreg;
    EditText _txtEmail, _txtlname, _txtfname, _txtmname, _txtpass, _txtcpass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        openHelper = new SQLiteDBHelper(this);
        _txtEmail = (EditText) findViewById(R.id.txtEmail);
        _txtlname = (EditText) findViewById(R.id.txtlname);
        _txtfname = (EditText) findViewById(R.id.txtfname);
        _txtmname = (EditText) findViewById(R.id.txtmname);
        _txtpass = (EditText) findViewById(R.id.txtupass);
        _txtcpass = (EditText) findViewById(R.id.txtcpass);
        _btnreg = (Button) findViewById(R.id.btnreg);
        _btnLogin = (Button) findViewById(R.id.btnlog);


        _btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {

                    db = openHelper.getReadableDatabase();
                    String email = _txtEmail.getText().toString();
                    String lname = _txtlname.getText().toString();
                    String fname = _txtfname.getText().toString();
                    String mname = _txtmname.getText().toString();
                    String pass = _txtpass.getText().toString();
                    String cpass = _txtcpass.getText().toString();
                    String mySQL = "select *from tblregistration where Email=?";
                    String [] args = {email};
                    cursor = db.rawQuery(mySQL, args);
                    if (cursor !=null) {
                        if (cursor.getCount() > 0) {
                            Toast.makeText(RegisterActivity.this, "Some info are already used",Toast.LENGTH_SHORT).show();
                        }
                        else if (email.equals("") || lname.equals("") || fname.equals("") || mname.equals("") || pass.equals("")  || cpass.equals("")) {
                            Toast.makeText(RegisterActivity.this, "Please fill all the informations",Toast.LENGTH_SHORT).show();
                        }
                        else if (pass.length() < 8) {
                            Toast.makeText(RegisterActivity.this, "Password must me atleast 8 characters", Toast.LENGTH_SHORT).show();
                        }
                        else if (pass.equals(cpass) == false) {
                            Toast.makeText(RegisterActivity.this, "Password didn't match.",Toast.LENGTH_SHORT).show();
                        }

                        else {
                            db = openHelper.getWritableDatabase();
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("Email", _txtEmail.getText().toString());
                            contentValues.put("FirstName", _txtfname.getText().toString());
                            contentValues.put("MiddleName", _txtmname.getText().toString());
                            contentValues.put("LastName", _txtlname.getText().toString());
                            contentValues.put("Password", _txtpass.getText().toString());
                            long id = db.insert("tblRegistration", null, contentValues);
                            Toast.makeText(getApplicationContext(), "Registration Success", Toast.LENGTH_LONG).show();
                            Intent i = new Intent(getApplicationContext(), LogInActivity.class);
                            startActivity(i);
                            finish();
                        }
                    }
                    else {
                        Toast.makeText(RegisterActivity.this, "SOMEBODY USED THAT",Toast.LENGTH_SHORT).show();
                    }
                }
                catch (Exception ex) {
                    Toast.makeText(RegisterActivity.this, ""+ex,Toast.LENGTH_SHORT).show();
                }
            }
        });




        _btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), LogInActivity.class);
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