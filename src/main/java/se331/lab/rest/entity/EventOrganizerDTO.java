package se331.lab.rest.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@Builder
//@Entity
@NoArgsConstructor
@AllArgsConstructor

public class EventOrganizerDTO {
    Long id;
    String name;
}
