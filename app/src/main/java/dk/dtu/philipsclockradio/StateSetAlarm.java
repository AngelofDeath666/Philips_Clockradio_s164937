package dk.dtu.philipsclockradio;

class StateSetAlarm implements State {

    int hour = 0;
    int minute = 0;

    @Override
    public void onEnterState(ContextClockradio context) {
        context.ui.setDisplayText(hour+":"+minute);


    }

    @Override
    public void onExitState(ContextClockradio context) {

    }

    @Override
    public void onClick_Hour(ContextClockradio context) {
        if (hour == 23){
            hour = 0;
        }else {
            hour++;
        }
        context.ui.setDisplayText(hour+":"+minute);

    }

    @Override
    public void onClick_Min(ContextClockradio context) {
        if (minute == 59){
            minute = 0;
        }else {
            minute++;
        }
        context.ui.setDisplayText(hour+":"+minute);

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
        context.setState(new StateAlarmActive(hour, minute));

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
