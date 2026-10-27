import utiles.Depurar
class Cajero(var saldo: Double = 500.0) {

    fun comenzar() {
        var salir = false;
        while (!salir) {
            val seleccion = Depurar.leerInt(menu());
            when (seleccion) {
                1 -> divisas();
                2 -> distancias();
                3 -> temperaturas();
                4 -> salir = true;
                else -> print("Opción no válida.")
            }
        }
        print("\nCajero Cerrado. Vuelva pronto")

    }


    // Funcion que muestra el menu
    fun menu(): String{

        return "===== CAJERO AUTOMÁTICO =====\n1. Consultar saldo\n2. Ingresar dinero\n3. Retirar dinero\n4. Salir\nSeleccione una opción:";
    }

    // Funcion que muestra el saldo actual
    fun consultarSaldo(){
        print("Su saldo actual es: "+ saldo+ "€\n");
    }

    // Funcion para ingresar dinero
    fun ingresarDinero(){
        
    }
}