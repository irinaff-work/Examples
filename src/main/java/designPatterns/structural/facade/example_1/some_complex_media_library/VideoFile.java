package designPatterns.structural.facade.example_1.some_complex_media_library;

/**
 * Created by IFatkullina on 26.09.2018.
 * Класс видеофайла
 */
public class VideoFile {
    private String name;
    private String codecType;

    public VideoFile(String name) {
        this.name = name;
        this.codecType = name.substring(name.indexOf(".") + 1, name.length());
    }

    public String getCodecType() {
        return codecType;
    }

    public String getName() {
        return name;
    }
}
