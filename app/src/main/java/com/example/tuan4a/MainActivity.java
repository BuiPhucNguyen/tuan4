package com.example.tuan4a;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView;
        ArrayList<HangHoa> arrayList;
        AdapterHangHoa adapter;

        listView = findViewById(R.id.listviewhanghoa);
        arrayList = new ArrayList<>();
        arrayList.add(new HangHoa("Ca nấu lẩu, mấu mì mini","Shop Devang",R.drawable.ca_nau_lau));
        arrayList.add(new HangHoa("1KG KHÔ GÀ BƠ TỎI","Shop LTD Food",R.drawable.ga_bo_toi));
        arrayList.add(new HangHoa("Xe cần cẩu đa năng","Shop Thế giới đồ chơi",R.drawable.xa_can_cau));
        arrayList.add(new HangHoa("Đồ chơi dạng mô hình","Shop thế giới đồ chơi",R.drawable.do_choi_dang_mo_hinh));
        arrayList.add(new HangHoa("Lãnh đạo giản đơn","Shop Minh Long Book",R.drawable.lanh_dao_gian_don));
        arrayList.add(new HangHoa("Hiểu lòng con trẻ","Shop Minh Long Book",R.drawable.hieu_long_con_tre));
        arrayList.add(new HangHoa("Donald Trump - Thiên tài lãnh đạo","Shop Minh Long Book",R.drawable.trump));

        adapter = new AdapterHangHoa(MainActivity.this,R.layout.layout_hanghoa,arrayList);
        listView.setAdapter(adapter);


    }
}