package com.endava.dusandimitrijevic.progressionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] teams;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teams = new String[] {"Arsenal", "Nice", "Inter"};
        ArrayAdapter<String> teamsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, teams);
        ListView teamsListView = (ListView) findViewById(R.id.teamsListView);
        teamsListView.setAdapter(teamsAdapter);

    }

    public void addNewTeam(View view) {
        Intent intent = new Intent(this, NewTeamActivity.class);
        startActivity(intent);
    }
}
