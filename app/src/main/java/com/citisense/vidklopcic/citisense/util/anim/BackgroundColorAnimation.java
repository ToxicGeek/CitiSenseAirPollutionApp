package com.citisense.vidklopcic.citisense.util.anim;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.LinearLayout;

import com.citisense.vidklopcic.citisense.fragments.AqiOverviewGraph;
import com.citisense.vidklopcic.citisense.util.Conversion;

public class BackgroundColorAnimation extends Animation {
    private static final long DURATION = 200;
    View mView;
    int mStartColor;
    int mEndColor;

    public BackgroundColorAnimation(View view, int start_color, int end_color) {
        mView = view;
        mStartColor = start_color;
        mEndColor = end_color;
        setDuration(DURATION);
    }

    @Override
    protected void applyTransformation(float percentage, Transformation t) {
        mView.setBackgroundColor(Conversion.interpolateColor(mStartColor, mEndColor, percentage));
    }
}
