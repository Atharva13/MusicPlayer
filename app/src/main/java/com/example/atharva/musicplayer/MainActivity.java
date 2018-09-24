package com.example.atharva.musicplayer;

        import android.os.Bundle;
        import android.support.annotation.Nullable;
        import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        song_ui songFragment = new song_ui();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.OpeningContainer,songFragment,"SONG LIST FRAGMENT")
                .commit();
    }

    @Override
    public void onBackPressed() {

        if(getFragmentManager().getBackStackEntryCount() > 0)
        {
            getFragmentManager().popBackStack();
        }
        else {
            super.onBackPressed();
        }
    }
}

