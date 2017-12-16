package com.harjot.goverment;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by Harjot on 11/27/2017.
 */

public class Passportadapter extends PagerAdapter {
    private int[] image_resource={R.drawable.a,R.drawable.ma,R.drawable.one};

    private Context context;

    private LayoutInflater layoutInflater;

    public Passportadapter(Context context)
    {
        this.context=context;
    }
    @Override
    public int getCount()
    {
        return image_resource.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object o) {
        return (view==(LinearLayout)o);
    }
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = layoutInflater.inflate(R.layout.panswipe, container, false);
        ImageView imageView = (ImageView) item_view.findViewById(R.id.bannerpan);
        imageView.setImageResource(image_resource[position]);
        container.addView(item_view);
        return item_view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}
