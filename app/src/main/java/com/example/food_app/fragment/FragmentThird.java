package com.example.food_app.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.food_app.R;

import java.util.ArrayList;
import java.util.List;


public class FragmentThird extends Fragment{
    private SearchView searchView;
    private EditText ngayBdau, ngayKthuc;
    private TextView tongTien;
    private Spinner spnDanhmuc;
    private Button btnTimkiem;
    private RecyclerView listKetqua;
//    private SQLite sqLiteHelper;
//    private RecyclerviewAdapter recyclerviewAdapter;
//    private List<Item> itemListKetqua = new ArrayList<>();

    public FragmentThird() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_cart, container, false);
    }
}