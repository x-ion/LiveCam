package edu.pace.xf90360n.livecam2;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;


/**
 * Created by HeBii on 11/20/2014.
 */
public class ListViewExample extends MainActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View.OnClickListener handler = new View.OnClickListener() {
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button:
                        showPopUp();
                        break;
                }
            }
        };
        findViewById(R.id.button).setOnClickListener(handler);
    }
        public void showPopUp(){

            ObjectItem[] ObjectItemData = new ObjectItem[20];

            ObjectItemData[0] = new ObjectItem(91,"DownTown");
            ArrayAdapter adapter = new ArrayAdapter(this, R.layout.activity_main,ObjectItemData);


    }
  }


