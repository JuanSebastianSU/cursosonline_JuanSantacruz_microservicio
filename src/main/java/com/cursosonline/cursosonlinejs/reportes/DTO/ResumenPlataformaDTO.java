package com.cursosonline.cursosonlinejs.reportes.DTO;

public record ResumenPlataformaDTO(
        long totalUsuarios,
        long totalCursos,
        long totalInscripciones,
        long totalCertificados
) { }
