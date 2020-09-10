package com.example.wishcard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
    }

    fun buttonClick(view: View) {
       val text=Username.editableText.toString();
//        Toast.makeText(this,"Name is $text",Toast.LENGTH_LONG).show();
        val intent = Intent(this, birthday_greetingActivity::class.java)
        intent.putExtra("name",text)
        startActivity(intent);

    }
}
