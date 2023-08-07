package com.tedawf.contentcalendar.model;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public record Content(
        @Id
        Integer id,
        @NotBlank
        String title,
        String desc,
        Status status,
        Type contentType,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated,
        String url
) {

    public Content(
            Integer id, @NotBlank
    String title, String desc, Status status, Type contentType, LocalDateTime dateCreated, LocalDateTime dateUpdated, String url) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.status = status;
        this.contentType = contentType;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
        this.url = url;
    }

}
