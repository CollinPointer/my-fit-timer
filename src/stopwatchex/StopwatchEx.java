/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stopwatchex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author keek
 */
public class StopwatchEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ApplicationContext context;
        context = new AnnotationConfigApplicationContext(AppConfig.class);
        Countdown t = context.getBean(Countdown.class); 
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Countdown().setVisible(true);
            }
        });
    }
    
}
