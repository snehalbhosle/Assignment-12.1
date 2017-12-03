package com.project.my.assignment12;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by Snehal on 03-12-2017.
 */

public class PreferenceActivity extends AppCompatActivity {
   @Override
    public void onCreate(Bundle savedInstanceState){
       super.onCreate(savedInstanceState);
       getFragmentManager().beginTransaction().replace(android.R.id.content, new SettingsFragment())
               .commit();

   }

    public static class SettingsFragment extends PreferenceFragment {
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.preferences);
        }
    }
}
