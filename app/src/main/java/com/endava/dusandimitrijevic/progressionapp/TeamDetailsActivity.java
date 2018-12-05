package com.endava.dusandimitrijevic.progressionapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TeamDetailsActivity extends AppCompatActivity {

    public String ACTIVE_TEAM = "com.example.ListViewTest.ACTIVE_TEAM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_details);

        String team = getIntent().getStringExtra(ACTIVE_TEAM);
        TextView detailTeamView = findViewById(R.id.teamTextView);
        detailTeamView.setText(team);
    }
}
