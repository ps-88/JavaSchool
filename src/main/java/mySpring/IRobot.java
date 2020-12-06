package mySpring;


public class IRobot {


    @InjectByType
    private Speaker speaker;
    @InjectByType
    private Cleaner cleaner;

    public void cleanRoom (){

        speaker.speak("I start to clean.");
        cleaner.clean();
        speaker.speak("I finish to clean.");

    }
}
