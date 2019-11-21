package dk.dtu.philipsclockradio;

import android.os.CountDownTimer;

class StateAlarmHowling implements State {
    int isSnoozed = 0;
    CountDownTimer snoozeyTimer;


    StateAlarmHowling (int isSnoozed){
        this.isSnoozed = isSnoozed;

    }


    @Override
    public void onEnterState(final ContextClockradio context) {
        if (isSnoozed == 1){
            snoozeyTimer = new CountDownTimer(540000, 60000) {
                @Override
                public void onTick(long millisUntilFinished) {

                }

                @Override
                public void onFinish() {
                    context.ui.turnOnTextBlink();
                    context.ui.turnOnLED(2);
                    context.ui.setDisplayText(context.getTime().toString().substring(11,16));

                }
            };
            snoozeyTimer.start();
        }else {
            context.ui.turnOnLED(2);
            context.ui.turnOnTextBlink();
        }





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
        context.ui.turnOffLED(2);
        context.ui.turnOffTextBlink();
        context.setState(new StateAlarmHowling(1));

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
