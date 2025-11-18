package com.cursosonline.cursosonlinejs.reportes.Repositorios;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Document(collection = "certificados") // AJUSTAR SI ES NECESARIO
class CertificadoDoc {
    @Id
    private String id;
}

@Repository
public interface CertificadoReporteRepositorio extends MongoRepository<CertificadoDoc, String> {
}
