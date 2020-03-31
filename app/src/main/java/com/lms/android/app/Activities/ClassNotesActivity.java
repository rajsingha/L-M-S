package com.lms.android.app.Activities;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.lms.android.app.R;

import net.cachapa.expandablelayout.ExpandableLayout;


public class ClassNotesActivity extends AppCompatActivity {

    CardView cardView;
    ExpandableLayout expandableLayout;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_activity);

        cardView = findViewById(R.id.card_vie);
        expandableLayout = findViewById(R.id.expandable_layout);

        cardView.setOnClickListener(v->{
            if (expandableLayout.isExpanded()){
                expandableLayout.collapse();
            }else {
                expandableLayout.expand();

            }

        });
    }
}
