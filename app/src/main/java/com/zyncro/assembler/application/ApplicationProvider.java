package com.zyncro.assembler.application;

import android.content.Context;

import com.zyncro.assembler.ZyncroApplication;

public interface ApplicationProvider {
    ZyncroApplication application();

    Context context();
}
