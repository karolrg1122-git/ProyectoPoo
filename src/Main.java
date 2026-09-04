//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    java.util.Scanner entrada = new java.util.Scanner(System.in);
    // Objeto 1
    Atraccion atraccion1 = new Atraccion("Carrusel");

    // Objeto 2
    Atraccion atraccion2 = new Atraccion("Rueda de la Fortuna", 40, 18000.0);

    // OBJETOS DE LA SUBCLASE MONTANARUSA
    // Objeto 3
    MontanaRusa montana1 = new MontanaRusa("Dragon Volador");

    // Objeto 4
    MontanaRusa montana2 = new MontanaRusa("Tornado", 25, 25000.0);

    // OBJETOS DE LA SUBCLASE JUEGOPREMIO
    // Objeto 5
    JuegoPremio juego1 = new JuegoPremio("Tiro al Blanco");

    // Objeto 6
    JuegoPremio juego2 = new JuegoPremio(
                    "Canastas",
                    10,
                    8.000,
                    true,
                    "Baloncesto",
                    100L,
                    6.000f,
                    'D'
            );

    // OBJETOS DE LA SUBCLASE ESPECTACULO
    // Objeto 7
    Espectaculo espectaculo1 = new Espectaculo("Show de Magia", 100, 12.000);

    // Objeto 8
    Espectaculo espectaculo2 = new Espectaculo(
                    "Festival de Luces",
                    150,
                    20.000,
                    true,
                    "Artistas del Parque", (short) 60,
                    true,
                    'F'
            );
    // MENU

    int opcion;

    do {

        System.out.println(" PARQUE DE DIVERSIONES");
        System.out.println("1. Ver atracciones generales");
        System.out.println("2. Ver montañas rusas");
        System.out.println("3. Ver juegos de premio");
        System.out.println("4. Ver espectáculos");
        System.out.println("5. Ver todas las atracciones");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opción: ");

        opcion = entrada.nextInt();

        switch (opcion) {

            case 1:

                System.out.println("ATRACCIONES GENERALES ");
                System.out.println(atraccion1);
                System.out.println(atraccion2);

                break;

            case 2:

                System.out.println(" MONTAÑAS RUSAS ");
                System.out.println(montana1);
                System.out.println(montana2);

                break;

            case 3:

                System.out.println("JUEGOS DE PREMIO ");
                System.out.println(juego1);
                System.out.println(juego2);

                break;

            case 4:
                System.out.println(" ESPECTÁCULOS");
                System.out.println(espectaculo1);
                System.out.println(espectaculo2);

                break;

            case 5:
                System.out.println("       TODAS LAS ATRACCIONES");

                System.out.println("ATRACCIONES GENERALES");
                System.out.println(atraccion1);
                System.out.println(atraccion2);

                System.out.println("MONTAÑAS RUSAS");
                System.out.println(montana1);
                System.out.println(montana2);

                System.out.println("JUEGOS DE PREMIO");
                System.out.println(juego1);
                System.out.println(juego2);

                System.out.println("ESPECTÁCULOS");
                System.out.println(espectaculo1);
                System.out.println(espectaculo2);

                break;

            case 6:
                System.out.println("Gracias por visitar el parque de diversiones.");
                break;

            default:
                System.out.println("Opción no válida. Intente nuevamente.");
        }

    } while (opcion != 6);

    entrada.close();
}

