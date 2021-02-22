/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stopwatchex;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author keek
 */
@RestController 
@Configuration
@ComponentScan("StopwatchEx")
public class AppConfig {
    @RequestMapping("/")
    public Countdown getTimer(){
        return new Countdown();
    } 
}
