package com.chenqiao.aspectjdemo;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by chenqiao on 2019/2/13.
 * e-mail : mrjctech@gmail.com
 */
@Aspect
public class TraceAspect {

    private static final String TAG = "TraceAspect";

    @Before("execution(* android.app.Activity.on*(..))")
    public void onActivityMethodBefore(JoinPoint joinPoint) throws Throwable {
        String key = joinPoint.getSignature().toString();
        Log.e(TAG, "onActivityMethodBefore: 切面的点执行了！" + key);
    }
}