package pl.jaskot.turistportal.frontend.views.assistant.buttonsOptions;

import com.vaadin.flow.component.progressbar.ProgressBar;
import pl.jaskot.turistportal.frontend.views.assistant.AssistantMethods;

public abstract class ButtonFalseQuestion {
    /**
     * False options to next question
     * @param number of last question
     * @param progressBar to control
     * @return number of next question
     */
    public static int option(int number, ProgressBar progressBar) {
        switch (number){
            case 1:{
                AssistantMethods.controlProgressBar(progressBar, 1);
                return 3;
            }
            case 2:{
                AssistantMethods.controlProgressBar(progressBar, 2);
                return 5;
            }
            case 3:{
                AssistantMethods.controlProgressBar(progressBar, 2);
                return 7;
            }
            case 4:{
                AssistantMethods.controlProgressBar(progressBar, 3);
                return 9;
            }
            case 5:{
                AssistantMethods.controlProgressBar(progressBar, 3);
                return 11;
            }
            case 6:{
                AssistantMethods.controlProgressBar(progressBar, 3);
                return 13;
            }
            case 7:{
                AssistantMethods.controlProgressBar(progressBar, 3);
                return 15;
            }
            default:{
                return Integer.parseInt(null);
            }
        }
    }
}