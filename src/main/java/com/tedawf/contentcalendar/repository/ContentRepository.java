package com.tedawf.contentcalendar.repository;

import com.tedawf.contentcalendar.model.Content;
import com.tedawf.contentcalendar.model.Status;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContentRepository extends ListCrudRepository<Content, Integer> {

    List<Content> findAllByTitleContains(String keyword);

    @Query("""
            SELECT * FROM Content 
            WHERE status = :status
            """)
    List<Content> listByStatus(@Param("status") Status status);

}
