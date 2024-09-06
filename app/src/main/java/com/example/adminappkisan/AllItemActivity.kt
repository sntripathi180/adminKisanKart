package com.example.adminappkisan

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.adminappkisan.adapter.AddItemAdapter
import com.example.adminappkisan.databinding.ActivityAllItemBinding

class AllItemActivity : AppCompatActivity() {
    private val binding : ActivityAllItemBinding by lazy {
        ActivityAllItemBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        val menuFoodName = listOf("Brinjal","Beetroot","Bitter Guard","Bottleguard","Brocolli","Cabbage","Carrot","Cauliflower","Cucumber","Garlic","Ginger","Green Bean","Green Chilli","Ladyfinger","Mushroom","Spinach","Peas","Potato","Pumpkin","Tomato")
        val menuItemPrice = listOf("₹ 60","₹ 120","₹ 20","₹ 55","₹ 110","₹ 35","₹ 20","₹ 15","₹ 12","₹ 150","₹ 110","₹ 90","₹ 25","₹ 25","₹ 20","₹ 40","₹ 200","₹ 15","₹ 35","₹ 40","₹ 25","₹ 200")
        val menuImage = listOf(
            R.drawable.menu1,
            R.drawable.menu2,
            R.drawable.menu3,
            R.drawable.menu4,
            R.drawable.menu5,
            R.drawable.menu6,
            R.drawable.menu7,
            R.drawable.menu8,
            R.drawable.menu9,
            R.drawable.menu10,
            R.drawable.menu11,
            R.drawable.menu12,
            R.drawable.menu13,
            R.drawable.menu14,
            R.drawable.menu16,
            R.drawable.menu17,
            R.drawable.menu18,
            R.drawable.menu19,
            R.drawable.menu20,
            R.drawable.menu21
        )
        binding.backButton.setOnClickListener { finish() }
        val adapter = AddItemAdapter(
            ArrayList(menuFoodName),
            ArrayList(menuItemPrice),
            ArrayList(menuImage)

        )
        binding.MenuRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.MenuRecyclerView.adapter = adapter
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}