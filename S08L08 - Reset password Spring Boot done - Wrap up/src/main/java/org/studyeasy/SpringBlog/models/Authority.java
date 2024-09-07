package org.studyeasy.SpringBlog.models;



import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Authority {
    
    @Id
    private Long id;

    private String name;

    @Override
    public String toString() {
        return "Authority [id=" + id + ", name=" + name + "]";
    }

    
}
