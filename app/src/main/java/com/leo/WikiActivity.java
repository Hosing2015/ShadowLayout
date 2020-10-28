package com.leo;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.leo.databinding.ActivityWikiBinding;
import com.lihang.ShadowLayout;

/**
 * Created by leo
 * on 2020/8/5.
 */
public class WikiActivity extends AppCompatActivity {
    ActivityWikiBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_wiki);
        binding.shadowLayoutBarLeft.setOnClickListener(v -> {
            finish();
        });
    }
}
