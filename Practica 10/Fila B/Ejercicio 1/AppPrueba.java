public class AppPrueba {
    public static void main(String[] args) {
        Planta planta = new Planta();
        planta.especie = "Quinua Andina";
        planta.zonaHabitat = "Altiplano";
        planta.tipoSemilla = "Pequena";
        planta.prospera = false;

        planta.adaptarseCondiciones();
        planta.dispersarse();

        CondicionAmbiental clima = new CondicionAmbiental();
        clima.clima = "Frio seco";
        clima.tipoSuelo = "Arenoso";
        clima.temperaturaMedia = 10;
        clima.precipitacionAnual = 300;

        clima.evaluarIdoneidad();
        clima.cambiarCondiciones("Humedo tropical", 25);

        BarreraGeografica cordillera = new BarreraGeografica();
        cordillera.tipo = "Montana";
        cordillera.ubicacion = "Cordillera Real";
        cordillera.extensionKm = 400.5;
        cordillera.esCruzarleFacil = false;

        cordillera.describirBarrera();
        cordillera.bloquearDispersion();
    }
}
