package org.huexxx.device.Preference;

import android.content.Context;
import android.graphics.PixelFormat;
import android.util.AttributeSet;
import android.view.WindowManager;

import org.huexxx.device.R;
import org.huexxx.device.utils.UtilsKCAL;

public final class KcalSeekBarPreference extends SeekBarPreferenceCham {


    public KcalSeekBarPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
        // hide icon for kcal
        setIconSpaceReserved(false);
    }

    public int reset() {
        int currentValue = (int) UtilsKCAL.clamp(mDefaultValue, mMinValue, mMaxValue);
        setProgress(currentValue);
        notifyChanged();
        return currentValue;
    }

    public void setValue(int progress) {
        setProgress((int) UtilsKCAL.clamp(progress, mMinValue, mMaxValue));
        notifyChanged();
    }
}
