package dk.dtu.philipsclockradio;

import android.os.CountDownTimer;

class StateSetSleep implements State {

    CountDownTimer Sleep;
    int sleepIntervals = 0;

    @Override
    public void onEnterState(final ContextClockradio context) {
        context.ui.setDisplayText("120");
        Sleep = new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                System.out.println("got here");

                if (sleepIntervals == 0){
                    context.setState(new StateSleep(120));
                }else if (sleepIntervals == 1){
                    context.setState(new StateSleep(90));
                }else if (sleepIntervals == 2){
                    context.setState(new StateSleep(60));
                }else if (sleepIntervals == 3){
                    context.setState(new StateSleep(30));
                }else if (sleepIntervals == 4){
                    context.setState(new StateSleep(15));
                }else if (sleepIntervals == 5){
                    context.setState(new StateSleep(0));
                }

            }
        };

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
        Sleep.cancel();
        if (sleepIntervals == 5){
            sleepIntervals = 0;
        }else {
            sleepIntervals++;
        }
        if (sleepIntervals == 0){
            context.ui.setDisplayText("120");
        }else if (sleepIntervals == 1){
            context.ui.setDisplayText("90");
        }else if (sleepIntervals == 2){
            context.ui.setDisplayText("60");
        }else if (sleepIntervals == 3){
            context.ui.setDisplayText("30");
        }else if (sleepIntervals == 4){
            context.ui.setDisplayText("15");
        }else if (sleepIntervals == 5){
            context.ui.setDisplayText("OFF");
        }


        Sleep.start();

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
