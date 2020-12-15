package org.edu.academic.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Document(collection = "projetos")
public class Projeto {
    @Id
    private String id;
    private String nome;
    private String descricao;
    private Professor professor;
    private String[] integrantes;
}
