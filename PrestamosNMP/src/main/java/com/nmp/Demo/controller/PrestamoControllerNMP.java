package com.nmp.Demo.controller;

import com.nmp.Demo.dto.Prestamos;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrestamoControllerNMP {
    @PostMapping("prestamos/nmp")

    public Prestamos prestamosnmp( String idPrestamo) {

        Prestamos prestaNMP = new  Prestamos();
        prestaNMP.setIdMaterial("001");
        prestaNMP.setDescripcion("Oro puro 24k");
        prestaNMP.setPrecio(1500.00);

        return prestaNMP;
    }
}
