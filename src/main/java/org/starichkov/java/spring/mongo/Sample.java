package org.starichkov.java.spring.mongo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Vadim Starichkov
 * @since 09.01.2018 11:56
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "samples")
public class Sample {
    @Id
    private Long id;
    private String name;

    @Override
    public String toString() {
        return "(@" + Integer.toHexString(System.identityHashCode(this)) + ") Sample{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
