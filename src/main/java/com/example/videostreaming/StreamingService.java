package com.example.videostreaming;


import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class StreamingService {

    private final ResourceLoader resourceLoader;
    private static final String FORMAT = "classpath:videos/%s.mp4";

    public Mono<Resource>  getVideo(String title){
        return Mono.fromSupplier(() -> resourceLoader.getResource(String.format(FORMAT,title)));
    }

}
