package task05RadioAlarm;

import lombok.experimental.Delegate;

public class RadioAlarm implements Radio,Alarm{

    @Delegate
    private Radio radio = new RadioImpl();
    @Delegate
    private Alarm alarm = new AlarmImpl();

    public static void main(String[] args) {

        new RadioAlarm().a();
    }


}
