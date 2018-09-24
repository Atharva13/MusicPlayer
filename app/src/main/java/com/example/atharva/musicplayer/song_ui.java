package com.example.atharva.musicplayer;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

public class song_ui extends Fragment {

    private static final String TAG = "Song_UI";

    public song_ui() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.songui,container,false);

        Button listicon = (Button) view.findViewById(R.id.btn_list);

        listicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Song_List songFragment = new Song_List();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right).replace(R.id.OpeningContainer,songFragment,"SONG LLST").addToBackStack(null).commit();
            }
        });
        return view;
    }
}
