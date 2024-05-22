package com.example.mathematicsforimprovement;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mathematicsforimprovement.databinding.ActivityMainBinding;

//import javax.xml.bind.JAXBContext;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarMain.toolbar);
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_account, R.id.nav_task_author, R.id.nav_task_community, R.id.nav_bookmarks)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

//        LinearLayout btn = findViewById(R.id.taskZero);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActi();
//            }
//        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    public void startActi(){
        Intent intent = new Intent(MainActivity.this, TaskActivity.class);
        intent.putExtra("taskNumber", "0");
        startActivity(intent);
    }

    public void addTask(String taskNum) {
//        LinearLayout rootLayout = new LinearLayout(this);
//        rootLayout.setAndroid__layout_width("match_parent");
//        rootLayout.setAndroid__layout_height("72dp");
//// Установите остальные поля
//
//        ImageView imageView = new ImageView();
//        imageView.("7dp");
//// Установите остальные поля
//        rootLayout.setImageView(imageView);
//
//        LinearLayout innerLayout = new LinearLayout();
//// Создайте и установите TextView элементы
//        rootLayout.setInnerLinearLayout(innerLayout);
//
//        try {
//            JAXBContext context = JAXBContext.newInstance(LinearLayout.class);
//            Marshaller marshaller = context.createMarshaller();
//            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//            marshaller.marshal(rootLayout, System.out);
//        } catch (JAXBException e) {
//            e.printStackTrace();
//        }

    }
}