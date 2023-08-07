package com.tedawf.contentcalendar;

import com.tedawf.contentcalendar.model.Content;
import com.tedawf.contentcalendar.model.Status;
import com.tedawf.contentcalendar.model.Type;
import com.tedawf.contentcalendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class ContentCalendarApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContentCalendarApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ContentRepository contentRepository) {
        return args -> {
            // insert some data into db
            Content content = new Content(null,
                    "Hello Chat GPT",
                    "All about chat GPT",
                    Status.IDEA,
                    Type.VIDEO,
                    LocalDateTime.now(),
                    null,
                    ""
            );
            contentRepository.save(content);
        };
    }

}
