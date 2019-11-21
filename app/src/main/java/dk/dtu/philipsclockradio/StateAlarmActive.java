package dk.dtu.philipsclockradio;

import android.os.CountDownTimer;

class StateAlarmActive implements State {

    int hour;
    int minute;
    String AlarmDato;
    String NuDato;
    CountDownTimer AlarmyTime;

    StateAlarmActive (int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }

    @Override
    public void onEnterState(final ContextClockradio context) {
        if (minute < 10){
            AlarmDato = hour+":0"+minute;
        }
        if (hour < 10){
            AlarmDato = "0"+hour+":"+minute;
        }
        if (hour < 10 && minute <10)
            AlarmDato = "0"+hour+":0"+minute;

        AlarmyTime = new CountDownTimer(7200000, 60000) {
            @Override
            public void onTick(long millisUntilFinished) {
                NuDato = context.getTime().toString().substring(11,16);
                if (NuDato.equals(AlarmDato)){
                    AlarmyTime.onFinish();
                }
                context.ui.setDisplayText(context.getTime().toString().substring(11,16));
            }

            @Override
            public void onFinish() {
                context.setState(new StateAlarmHowling(0));
                AlarmyTime.cancel();

            }
        };
        AlarmyTime.start();


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
