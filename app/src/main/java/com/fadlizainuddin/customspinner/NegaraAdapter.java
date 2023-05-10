package com.fadlizainuddin.customspinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class NegaraAdapter extends BaseAdapter {
    private Context _context;
    private List<String> _negaraList;

    public NegaraAdapter(Context context, List<String> negaraList) {
        this._context = context;
        this._negaraList = negaraList;
    }

    @Override
    public int getCount() {
    // Mereturn (negaraList != null) ? negaraList.size() : 0;

        if (_negaraList != null) {
            return _negaraList.size();
        }
        else {
            return 0;
        }
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
        LayoutInflater inflater = LayoutInflater.from(_context);
        view = inflater.inflate(R.layout.spinner_a,null);

        TextView textView = view.findViewById(R.id.textView);
        String negara = _negaraList.get(i);
        textView.setText(negara);

        ImageView imageView = view.findViewById(R.id.imageView);

        switch (negara) {
            case "Albania":
                imageView.setImageResource(R.drawable.albania);
                break;

            case "Belgia":
                imageView.setImageResource(R.drawable.belgia);
                break;

            case "Hungary":
                imageView.setImageResource(R.drawable.hungary);
                break;

            case "Iran":
                imageView.setImageResource(R.drawable.iran);
                break;

            case "Slovenia":
                imageView.setImageResource(R.drawable.slovenia);
                break;
        }
        return view;
    }
}
