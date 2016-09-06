package com.moviereel.moviereel.views.introduction;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;


import com.github.paolorotolo.appintro.AppIntro2;
import com.github.paolorotolo.appintro.AppIntroFragment;
import com.moviereel.moviereel.R;

/**
 * Project: Movie Reel
 * Package: com.moviereel.moviereel.views.introduction
 * Created by lusinabrian on 05/09/16 at 15:24
 * Description: Simple app introduction class
 */
public class AppIntroduction extends AppIntro2 {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //TODO: change app introduction
        /*1st Fragment*/
        addSlide(AppIntroFragment.newInstance(getString(R.string.app_name), "Reeling in the shows", R.mipmap.ic_launcher, ContextCompat.getColor(this,R.color.cadet_blue)));

        /*2nd Fragment*/
        addSlide(AppIntroFragment.newInstance(getString(R.string.app_name), "desc", R.mipmap.ic_launcher, ContextCompat.getColor(this,R.color.cadet_blue)));

        /*3rd Fragment*/
        addSlide(AppIntroFragment.newInstance(getString(R.string.app_name), "desc", R.mipmap.ic_launcher, ContextCompat.getColor(this,R.color.cadet_blue)));

        /*4th Fragment*/
        addSlide(AppIntroFragment.newInstance(getString(R.string.app_name), "GET STARTED", R.mipmap.ic_launcher,ContextCompat.getColor(this,R.color.cadet_blue)));
        setProgressButtonEnabled(true);

        /*animation*/
        setDepthAnimation();
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        finish();
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        finish();
    }

    @Override
    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
        super.onSlideChanged(oldFragment, newFragment);
    }

}