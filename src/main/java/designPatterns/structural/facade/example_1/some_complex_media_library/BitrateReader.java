package designPatterns.structural.facade.example_1.some_complex_media_library;

/**
 * Created by IFatkullina on 26.09.2018.
 * Bitrate-конвертер
 */
public class BitrateReader {
    public static VideoFile read(VideoFile file, Codec codec) {
        System.out.println("BitrateReader: reading file...");
        return file;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec) {
        System.out.println("BitrateReader: writing file...");
        return buffer;
    }
}
