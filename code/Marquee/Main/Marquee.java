package com.example.a17718.appdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by 17718 on 2016/4/15 0015.
 */
public class Marquee extends TextView {

    public Marquee(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Marquee(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public Marquee(Context context) {

        super(context);
    }
    public  boolean isFocused ()
    {
        return  true;
    }
}
