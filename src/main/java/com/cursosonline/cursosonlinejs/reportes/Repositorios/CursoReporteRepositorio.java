package com.cursosonline.cursosonlinejs.reportes.Repositorios;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Document(collection = "cursos") // AJUSTAR SI ES NECESARIO
class CursoDoc {
    @Id
    private String id;
}

@Repository
public interface CursoReporteRepositorio extends MongoRepository<CursoDoc, String> {
}
