package org.arquitectura.hexagonal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    private Integer id;
    private String nombre;
    private String identificacion;
}
