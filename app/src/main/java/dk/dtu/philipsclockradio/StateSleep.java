package dk.dtu.philipsclockradio;

import android.os.CountDownTimer;

class StateSleep implements State {

    int timeToSleep;
    CountDownTimer SleepyTime;
    StateSleep (int timeToSleep){
        this.timeToSleep = timeToSleep;
    }

    @Override
    public void onEnterState(final ContextClockradio context) {
        context.ui.turnOnLED(3);
        SleepyTime = new CountDownTimer(60000*timeToSleep, 60000) {
            @Override
            public void onTick(long l) {
                timeToSleep = timeToSleep-1;
                context.ui.setDisplayText(""+timeToSleep);
            }

            @Override
            public void onFinish() {
                context.ui.turnOffLED(3);
                context.setState(new StateStandby(context.getTime()));

            }
        };
        SleepyTime.start();

    }

    @Override
    public void onExitState(ContextClockradio context) {


    }

    @Override
    public void onClick_Hour(ContextClockradio context) {

    }

    @Override
    public void onClick_Min(ContextClockradio context) {

    }

    @Override
    public void onClick_Preset(ContextClockradio context) {

    }

    @Override
    public void onClick_Power(ContextClockradio context) {

    }

    @Override
    public void onClick_Sleep(ContextClockradio context) {

    }

    @Override
    public void onClick_AL1(ContextClockradio context) {

    }

    @Override
    public void onClick_AL2(ContextClockradio context) {

    }

    @Override
    public void onClick_Snooze(ContextClockradio context) {

    }

    @Override
    public void onLongClick_Hour(ContextClockradio context) {

    }

    @Override
    public void onLongClick_Min(ContextClockradio context) {

    }

    @Override
    public void onLongClick_Preset(ContextClockradio context) {

    }

    @Override
    public void onLongClick_Power(ContextClockradio context) {
        SleepyTime.cancel();
        context.setState(new StateStandby(context.getTime()));

    }

    @Override
    public void onLongClick_Sleep(ContextClockradio context) {

    }

    @Override
    public void onLongClick_AL1(ContextClockradio context) {

    }

    @Override
    public void onLongClick_AL2(ContextClockradio context) {

    }

    @Override
    public void onLongClick_Snooze(ContextClockradio context) {

    }
}
