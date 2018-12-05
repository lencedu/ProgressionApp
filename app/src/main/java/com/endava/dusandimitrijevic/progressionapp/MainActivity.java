package com.endava.dusandimitrijevic.progressionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    public String[] teams;
    public String ACTIVE_TEAM = "com.example.ListViewTest.ACTIVE_TEAM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teams = new String[] {"Arsenal", "Nice", "Inter"};
        ArrayAdapter<String> teamsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, teams);
        ListView teamsListView = findViewById(R.id.teamsListView);
        teamsListView.setAdapter(teamsAdapter);

        teamsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, TeamDetailsActivity.class);
                String message = teams[position];
                intent.putExtra(ACTIVE_TEAM, message);
                startActivity(intent);
            }
        });
    }

    public void addNewTeam(View view) {
        Intent intent = new Intent(this, NewTeamActivity.class);
        startActivity(intent);
    }
}
