package com.example.azisdotid.orderojol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    public static final String INTENT_DETAIL="detail_news";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        String detail_news = getIntent()
                .getStringExtra(INTENT_DETAIL);
        TextView tv_detail_news = findViewById(R.id.tv_detail_news);
        tv_detail_news.setText(detail_news);
    }
}
