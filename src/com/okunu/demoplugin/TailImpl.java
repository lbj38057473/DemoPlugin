package com.okunu.demoplugin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import com.okunu.demoplugin.R;
import com.okunu.plugin.ITail;

public class TailImpl implements ITail{

    @Override
    public int getImageId() {
        return R.drawable.man;
    }

    @Override
    public View getView(Context context) {
        return LayoutInflater.from(context).inflate(R.layout.plugin_text, null);
    }
}
