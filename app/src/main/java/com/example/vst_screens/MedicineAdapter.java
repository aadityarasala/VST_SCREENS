package com.example.vst_screens;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.vst_screens.inventory.medicine;

import java.util.List;

public class MedicineAdapter extends BaseAdapter {

    private Context context;
    private List<medicine> medicinelist;

    public MedicineAdapter(Context context, List<medicine> medicinelist) {
        this.context = context;
        this.medicinelist = medicinelist;
    }


    @Override
    public int getCount() {
        return medicinelist != null ? medicinelist.size() : 0;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View rootView = LayoutInflater.from(context)
                .inflate(R.layout.item_medicine,viewGroup,false);
        TextView txtname = rootView.findViewById(R.id.name_MEDICINE);
        txtname.setText(medicinelist.get(i).getName());

        return null;
    }
}
