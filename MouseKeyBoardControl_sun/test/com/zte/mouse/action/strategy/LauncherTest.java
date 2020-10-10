package com.zte.mouse.action.strategy;

import org.junit.Test;

import com.zte.mouse.app.Launcher;
import com.zte.mouse.task.MouseTimerTask;
import com.zte.mouse.util.HotKeyUtil;

public class LauncherTest
{
    @Test
    public void launcher()
    {
        Launcher launcher = new Launcher();
        MouseTimerTask timerTask = new MouseTimerTask();
        MoveStrategy mousesStrategy = new MoveStrategy();
        mousesStrategy.setEndPosition(100, 200);
        timerTask.addStrategy(mousesStrategy);
        launcher.addTimerTask(timerTask);
        launcher.start();

    }

    public static void main(String[] args)
    {

        HotKeyUtil hotKeyUtil = new HotKeyUtil();
        Launcher launcher = new Launcher();
        MouseTimerTask timerTask = new MouseTimerTask();
        MoveStrategy mousesStrategy = new MoveStrategy();
        mousesStrategy.setEndPosition(100, 200);
        timerTask.addStrategy(mousesStrategy);
        launcher.addTimerTask(timerTask);
        hotKeyUtil.setLauncher(launcher);
    }
}
