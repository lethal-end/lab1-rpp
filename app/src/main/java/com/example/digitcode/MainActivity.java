package com.example.digitcode;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ListView;
import com.example.digitcode.Elem;
import com.example.digitcode.ElemAdapter;
import com.example.digitcode.R;
import com.example.digitcode.Transleter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Elem> states = new ArrayList();
    ListView MainList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setInitialData(); // начальная инициализация списка
        MainList = (ListView) findViewById(R.id.MainList); // получаем элемент ListView
        ElemAdapter stateAdapter = new ElemAdapter(this, R.layout.list_item, states); // создаем адаптер
        MainList.setAdapter(stateAdapter); // устанавливаем адаптер
    }
    private void setInitialData() {
        for (int i = 1; i <= 1000000; i++) {
            if(i%2==0) {
                states.add(new Elem (Transleter.fromIntToString(i), R.drawable.smile, 0xFFCCCCCC));
            }
            else {
                states.add(new Elem (Transleter.fromIntToString(i), R.drawable.smile, 0xFFFFFFFF));
            }
        }
    }
}