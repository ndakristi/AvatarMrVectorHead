package com.example.avatarmrvectorhead

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Declare ImageViews
    private lateinit var imgHead: ImageView
    private lateinit var imgHair: ImageView
    private lateinit var imgMustache: ImageView
    private lateinit var imgEyes: ImageView
    private lateinit var imgEyebrow: ImageView
    private lateinit var imgBeard: ImageView

    // Declare CheckBoxes
    private lateinit var cbHead: CheckBox
    private lateinit var cbHair: CheckBox
    private lateinit var cbMustache: CheckBox
    private lateinit var cbEyes: CheckBox
    private lateinit var cbEyebrow: CheckBox
    private lateinit var cbBeard: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize ImageViews
        imgHead = findViewById(R.id.imgHead)
        imgHair = findViewById(R.id.imgHair)
        imgMustache = findViewById(R.id.imgMustache)
        imgEyes = findViewById(R.id.imgEyes)
        imgEyebrow = findViewById(R.id.imgEyebrow)
        imgBeard = findViewById(R.id.imgBeard)

        // Initialize CheckBoxes
        cbHead = findViewById(R.id.cbHead)
        cbHair = findViewById(R.id.cbHair)
        cbMustache = findViewById(R.id.cbMustache)
        cbEyes = findViewById(R.id.cbEyes)
        cbEyebrow = findViewById(R.id.cbEyebrow)
        cbBeard = findViewById(R.id.cbBeard)

        // Set CheckBox Listeners
        cbHead.setOnCheckedChangeListener { _, isChecked ->
            imgHead.visibility = if (isChecked) View.VISIBLE else View.INVISIBLE
        }

        cbHair.setOnCheckedChangeListener { _, isChecked ->
            imgHair.visibility = if (isChecked) View.VISIBLE else View.INVISIBLE
        }

        cbMustache.setOnCheckedChangeListener { _, isChecked ->
            imgMustache.visibility = if (isChecked) View.VISIBLE else View.INVISIBLE
        }

        cbEyes.setOnCheckedChangeListener { _, isChecked ->
            imgEyes.visibility = if (isChecked) View.VISIBLE else View.INVISIBLE
        }

        cbEyebrow.setOnCheckedChangeListener { _, isChecked ->
            imgEyebrow.visibility = if (isChecked) View.VISIBLE else View.INVISIBLE
        }

        cbBeard.setOnCheckedChangeListener { _, isChecked ->
            imgBeard.visibility = if (isChecked) View.VISIBLE else View.INVISIBLE
        }
    }
}