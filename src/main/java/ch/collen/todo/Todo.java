package ch.collen.todo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by cyril on 16/10/17.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Todo {

    @Id @GeneratedValue
    private long id;
    @Column
    private String description;
    private String title;



}
