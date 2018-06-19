package com.yuyakaido.android.cardstackview.internal;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by Prabodh Dhabaria on 26-03-2018.
 */

public abstract class CardStackAdapterHelper extends BaseAdapter {

    public abstract boolean isDraggable(int position);

    public abstract boolean isReverseAllowed(int position);

    public abstract String getNoDragMessage(int position);

}
