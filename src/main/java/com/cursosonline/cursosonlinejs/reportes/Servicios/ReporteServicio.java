package com.cursosonline.cursosonlinejs.reportes.Servicios;

import com.cursosonline.cursosonlinejs.reportes.DTO.ResumenPlataformaDTO;
import com.cursosonline.cursosonlinejs.reportes.Repositorios.UsuarioReporteRepositorio;
import com.cursosonline.cursosonlinejs.reportes.Repositorios.CursoReporteRepositorio;
import com.cursosonline.cursosonlinejs.reportes.Repositorios.InscripcionReporteRepositorio;
import com.cursosonline.cursosonlinejs.reportes.Repositorios.CertificadoReporteRepositorio;
import org.springframework.stereotype.Service;

@Service
public class ReporteServicio {

    private final UsuarioReporteRepositorio usuarioRepo;
    private final CursoReporteRepositorio cursoRepo;
    private final InscripcionReporteRepositorio inscripcionRepo;
    private final CertificadoReporteRepositorio certificadoRepo;

    public ReporteServicio(UsuarioReporteRepositorio usuarioRepo,
                           CursoReporteRepositorio cursoRepo,
                           InscripcionReporteRepositorio inscripcionRepo,
                           CertificadoReporteRepositorio certificadoRepo) {
        this.usuarioRepo = usuarioRepo;
        this.cursoRepo = cursoRepo;
        this.inscripcionRepo = inscripcionRepo;
        this.certificadoRepo = certificadoRepo;
    }

    public ResumenPlataformaDTO obtenerResumen() {
        long totalUsuarios = usuarioRepo.count();
        long totalCursos = cursoRepo.count();
        long totalInscripciones = inscripcionRepo.count();
        long totalCertificados = certificadoRepo.count();

        return new ResumenPlataformaDTO(
                totalUsuarios,
                totalCursos,
                totalInscripciones,
                totalCertificados
        );
    }
}
