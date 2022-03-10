package com.example.tuan4a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterHangHoa extends BaseAdapter {
    private Context context;
    private int layout;
    private List<HangHoa> arr;

    public AdapterHangHoa(Context context, int layout, List<HangHoa> arr) {
        this.context = context;
        this.layout = layout;
        this.arr = arr;
    }

    @Override
    public int getCount() {
        return arr.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view = inflater.inflate(layout, null);

        HangHoa hangHoa = arr.get(i);

        TextView textV1 = view.findViewById(R.id.name);
        TextView textV2 = view.findViewById(R.id.mota);
        ImageView imageV = view.findViewById(R.id.imageHinh);

        textV1.setText(hangHoa.getTenHang());
        textV2.setText(hangHoa.getMota());
        imageV.setImageResource(hangHoa.getHinh());

        return view;
    }
}
