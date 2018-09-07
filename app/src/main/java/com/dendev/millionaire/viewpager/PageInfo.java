package com.dendev.millionaire.viewpager;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dendev.millionaire.EnterActivity;
import com.dendev.millionaire.R;
import com.dendev.millionaire.room.Info;

public class PageInfo extends Fragment {

    //View
    private TextView name, surname, age, house, transport, educPtu, educIT, educUniv;
    private TextView mac, waiter, santech, factory, tocar, builder, cook;
    private Info info;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        info = EnterActivity.info;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.page_info, container, false);
        findId(rootView);
        name.setText(info.getFirstName());
        surname.setText(info.getSecName());
        
        return rootView;
    }

    private void findId(View view) {
        name = view.findViewById(R.id.name_text);
        surname = view.findViewById(R.id.surname_text);
        age = view.findViewById(R.id.age_text);
        house = view.findViewById(R.id.house_text);
        transport = view.findViewById(R.id.transport_text);
        educPtu = view.findViewById(R.id.ptu_educ);
        educIT = view.findViewById(R.id.it_educ);
        educUniv = view.findViewById(R.id.univer_educ);
        mac = view.findViewById(R.id.mac_title);
        waiter = view.findViewById(R.id.waiter_title);
        santech = view.findViewById(R.id.santech_title);
        factory = view.findViewById(R.id.factory_title);
        tocar = view.findViewById(R.id.tocar_title);
        builder = view.findViewById(R.id.builder_title);
        cook = view.findViewById(R.id.cook_title);
    }
}
