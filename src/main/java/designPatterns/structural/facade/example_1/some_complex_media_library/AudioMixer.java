package designPatterns.structural.facade.example_1.some_complex_media_library;

/**
 * Created by IFatkullina on 26.09.2018.
 * Микширование аудио
 */
import java.io.File;

public class AudioMixer {
    public File fix(VideoFile result){
        System.out.println("AudioMixer: fixing audio...");
        return new File("tmp");
    }
}
