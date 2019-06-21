package nl.workingspirit.butterflies.config;

import nl.workingspirit.butterflies.model.Player;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBeansConfiguration {

    @Bean
    public Player eline() {
        Player e = new Player();
        e.setName("Eline");
        e.setAge(23);
        e.setBackNumber("11");

        return e;
    }

    @Bean
    public Player frank() {
        Player f = new Player();
        f.setName("Frank");
        f.setAge(46);
        f.setBackNumber("12");

        return f;
    }

    @Bean
    public Player wietse() {
        Player w = new Player();
        w.setName("Wietse");
        w.setAge(26);
        w.setBackNumber("13");

        return w;
    }
}
