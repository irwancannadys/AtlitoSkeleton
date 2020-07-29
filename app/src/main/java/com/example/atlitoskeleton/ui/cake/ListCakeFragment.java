package com.example.atlitoskeleton.ui.cake;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.atlitoskeleton.R;
import com.example.atlitoskeleton.model.CakeModel;

import java.util.ArrayList;

public class ListCakeFragment extends Fragment {

    RecyclerView recyclerView;
    TextView textView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list_cake, container, false);
        textView = view.findViewById(R.id.tv_title_cake);
        textView.setText("List of Cake");
        initializationView(view);
        return view;
    }

    private ArrayList<CakeModel> initializationData() {
        ArrayList<CakeModel> arrayData = new ArrayList<>();
        arrayData.add(new CakeModel("Bolu Pandan"));
        arrayData.add(new CakeModel("Bolu Pisang"));
        arrayData.add(new CakeModel("Nastar"));
        arrayData.add(new CakeModel("Sagu Keju"));
        arrayData.add(new CakeModel("njksabd"));
        arrayData.add(new CakeModel("dasbfkjsdb"));
        return arrayData;
    }

    private void initializationView(View view) {
        recyclerView = view.findViewById(R.id.rv_list_cake);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        CakeAdapter cakeAdapter = new CakeAdapter(initializationData());
        recyclerView.setAdapter(cakeAdapter);
    }
}
