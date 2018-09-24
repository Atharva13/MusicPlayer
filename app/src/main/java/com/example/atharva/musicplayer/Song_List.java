package com.example.atharva.musicplayer;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Song_List  extends Fragment{
    private ArrayList<String> mNames = new ArrayList<>();
    public Song_List(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.song_list,container,false);

        initImageBitmaps();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        LinearLayoutManager layoutmanager = new LinearLayoutManager(this.getActivity());
        recyclerView.setLayoutManager(layoutmanager);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mNames,this.getContext());

        recyclerView.setAdapter(adapter);
        return view;
    }

    private void initImageBitmaps() {
        mNames.add("Name 1");
        mNames.add("Name 2");
        mNames.add("Name 3");
        mNames.add("Name 4");
        mNames.add("Name 5");
        mNames.add("Name 6");
        mNames.add("Name 7");
        mNames.add("Name 8");
        mNames.add("Name 9");
        mNames.add("Name 10");
        mNames.add("Name 11");
        mNames.add("Name 12");
        mNames.add("Name 13");
        mNames.add("Name 14");
    }
}
