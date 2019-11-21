package dk.dtu.philipsclockradio;

class StateRadioAM implements State {

    int freq;

    @Override
    public void onEnterState(ContextClockradio context) {
        context.ui.setDisplayText("1AM");
    }

    @Override
    public void onExitState(ContextClockradio context) {

    }

    @Override
    public void onClick_Hour(ContextClockradio context) {
        if (freq == 0){
            freq = 137;
        }else{
            freq--;
        }
        context.ui.setDisplayText(freq+"AM");

    }

    @Override
    public void onClick_Min(ContextClockradio context) {
        if (freq == 137){
            freq = 0;
        } else{
            freq++;
        }
        context.ui.setDisplayText(freq+"AM");

    }

    @Override
    public void onClick_Preset(ContextClockradio context) {

    }

    @Override
    public void onClick_Power(ContextClockradio context) {
        context.setState(new StateRadioFM());

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
        context.setState(new Preset(freq));

    }

    @Override
    public void onLongClick_Power(ContextClockradio context) {
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
