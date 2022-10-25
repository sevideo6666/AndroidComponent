package com.example.component

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activty_nested_scroll_view.*

class MainActivity : AppCompatActivity() {

    lateinit var lists:ArrayList<String>

    init {
        default()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//          堆疊
//        setContentView(R.layout.activity_frame_layout)
//          表格
//        setContentView(R.layout.activity_table_layout)
//          网格类布局
//        setContentView(R.layout.activty_grid_layout)
//      使用NestedScrollView代替ScrollView解决RecycleView滑动冲突
        setContentView(R.layout.activty_nested_scroll_view)
        initFirstRecycleView()
    }



    fun initFirstRecycleView(){
        rv_list.run {
            adapter=RecycleViewAdapter(lists)
        }

        rv_list_2.run {
            adapter=RecycleViewAdapter(lists)
        }

    }


    private fun default(){
        lists= ArrayList(30)
        (0..30).forEach {
            lists.add("index : $it")
        }
    }
}