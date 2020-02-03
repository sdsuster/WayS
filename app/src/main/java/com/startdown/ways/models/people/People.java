package com.startdown.ways.models.people;

import com.startdown.ways.models.base.BaseEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class People extends BaseEntity {

    @Getter
    private String name;
    private int height;
    private int mass;
    private String hair_color;
}
