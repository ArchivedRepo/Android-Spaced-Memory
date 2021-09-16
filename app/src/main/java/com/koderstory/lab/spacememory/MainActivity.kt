package com.koderstory.lab.spacememory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.koderstory.lab.spacememory.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var mScore:Int = 0
    private var mLevel:Int = 0
    private var data = arrayListOf(
        "ي",
        "و",
        "ه",
        "ن",
        "م",
        "ل",
        "ك",
        "ق",
        "ف",
        "غ",
        "ع",
        "ظ",
        "ط",
        "ض",
        "ص",
        "ش",
        "س",
        "ز",
        "ر",
        "ذ",
        "د",
        "خ",
        "ح",
        "ج",
        "ث",
        "ت",
        "ب",
        "ا"
    )
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.tvWord.text = data.get(27)
        binding.btnRight.setOnClickListener {
            mLevel++
            if(mLevel<28)
                binding.tvWord.text = data.get(27 - mLevel)



        }
        binding.btnWrong.setOnClickListener {
            mLevel--
            if(mLevel>=0) binding.tvWord.text = data.get(27 + mLevel)


        }
    }
}