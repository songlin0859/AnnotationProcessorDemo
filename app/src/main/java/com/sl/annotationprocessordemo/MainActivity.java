package com.sl.annotationprocessordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.sl.anno_core.BindView;

/**
 * @author differ
 */
public class MainActivity extends AppCompatActivity {

    @BindView(viewId = R.id.textView)
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}