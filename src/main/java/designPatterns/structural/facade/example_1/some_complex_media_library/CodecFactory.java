package designPatterns.structural.facade.example_1.some_complex_media_library;

/**
 * Created by IFatkullina on 26.09.2018.
 * Фабрика видеокодеков кодеков
 */
public class CodecFactory {
    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            System.out.println("CodecFactory: extracting mpeg audio...");
            return new MPEG4CompressionCodec();
        } else {
            System.out.println("CodecFactory: extracting ogg audio...");
            return new OggCompressionCodec();
        }
    }
}
