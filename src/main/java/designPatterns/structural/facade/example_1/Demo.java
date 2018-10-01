package designPatterns.structural.facade.example_1;

/**
 * Created by IFatkullina on 26.09.2018.
 * Клиентский код
 */
import designPatterns.structural.facade.example_1.facade.VideoConversionFacade;

import java.io.File;

public class Demo {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }
}
