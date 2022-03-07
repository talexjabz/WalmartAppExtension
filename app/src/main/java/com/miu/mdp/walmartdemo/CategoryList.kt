package com.miu.mdp.walmartdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.miu.mdp.walmartdemo.databinding.ActivityCategoryListBinding

class CategoryList : AppCompatActivity() {
    private lateinit var binder: ActivityCategoryListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binder = ActivityCategoryListBinding.inflate(layoutInflater)
        setContentView(binder.root)

        with(binder) {
            recycler.layoutManager = LinearLayoutManager(this@CategoryList)
            recycler.adapter = CategoryAdapter(
                arrayListOf(
                    Product(
                        "RGA Voyager 7 16GB Android Tablet",
                        35.00,
                        "Black",
                        itemId = "5551883493",
                        desc = "Another description here",
                        image = R.drawable.lcd
                    ),
                    Product(
                        "HP Flyer Red 15.6 Laptop",
                        299.00,
                        "Black & Red",
                        itemId = "5551883493",
                        desc = "Decription here",
                        image = R.drawable.jacket
                    )
                ),
                this@CategoryList
            )
        }
    }
}

