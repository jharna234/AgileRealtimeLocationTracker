package com.acegroup.livelocationtracker.test;

import android.os.Bundle;
import androidx.test.runner.MonitoringInstrumentation;
import cucumber.api.CucumberOptions;
import cucumber.api.android.CucumberInstrumentationCore;


@CucumberOptions(
        features = "features",
        glue = "com.acegroup.livelocationtracker.test")
public class Instrumentation extends MonitoringInstrumentation {

    private final CucumberInstrumentationCore instrumentationCore = new CucumberInstrumentationCore(this);
    private Object BuildConfig;

    @Override
    public void onCreate(Bundle arguments) {
        super.onCreate(arguments);

        String tags = BuildConfig.TEST_TAGS;
        if (!tags.isEmpty()) {
            arguments.putString("tags", tags.replaceAll(",", "--").replaceAll("\\s",""));
        }

        instrumentationCore.create(arguments);
        start();
    }

    @Override
    public void onStart() {
        super.onStart();

        waitForIdleSync();
        instrumentationCore.start();
    }
}
