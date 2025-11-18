package com.cursosonline.cursosonlinejs.reportes.Controladores;

import com.cursosonline.cursosonlinejs.reportes.DTO.ResumenPlataformaDTO;
import com.cursosonline.cursosonlinejs.reportes.Servicios.ReporteServicio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// Swagger / OpenAPI
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/reportes")
@CrossOrigin(
        origins = {
                "http://localhost:3000",                        // React dev
                "http://localhost:9090",                        // si lo usas
                "https://cursosonline-juan-santacruz.vercel.app" // tu frontend en producción
        },
        allowCredentials = "true"
)

@Tag(
        name = "Reportes",
        description = "Microservicio para obtener estadísticas de la plataforma CursosOnlineJS."
)
public class ReporteControlador {

    private final ReporteServicio reporteServicio;

    public ReporteControlador(ReporteServicio reporteServicio) {
        this.reporteServicio = reporteServicio;
    }

    @GetMapping("/resumen")
    @Operation(
            summary = "Obtener resumen de la plataforma",
            description = "Devuelve totales de usuarios, cursos, inscripciones y certificados."
    )
    public ResponseEntity<ResumenPlataformaDTO> resumen() {
        ResumenPlataformaDTO dto = reporteServicio.obtenerResumen();
        return ResponseEntity.ok(dto);
    }
}
