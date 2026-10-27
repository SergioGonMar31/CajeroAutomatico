import utiles.Depurar

class Cajero(var saldo: Double = 500.0) {

    // Funcion con el bucle del cajero
    fun comenzar() {
        var salir = false
        while (!salir) {
            val seleccion = Depurar.leerInt(menu());
            when (seleccion) {
                1 -> consultarSaldo()
                2 -> ingresarDinero()
                3 -> retirarDinero()
                4 -> salir = true
                else -> println("Opción no válida.")
            }
        }
        println("\nCajero Cerrado. Vuelva pronto")

    }

    // Funcion que muestra el menu
    fun menu(): String {

        return "\n===== CAJERO AUTOMÁTICO =====\n1. Consultar saldo\n2. Ingresar dinero\n3. Retirar dinero\n4. Salir\nSeleccione una opción:"
    }

    // Funcion que muestra el saldo actual
    fun consultarSaldo() {
        println("Su saldo actual es: " + saldo + "€\n");
    }

    // Funcion para ingresar dinero
    fun ingresarDinero() {
        var cantidad = 0.0
        do {
            cantidad = Depurar.leerDecimal("Introduce la cantidad que quiere ingresar: ")
            if(cantidad <= 0){
                println("Introduzca una cantidad positiva")
            }
        } while (cantidad <= 0)
        saldo += cantidad
        println("Su saldo se ha actualizado.")
    }

    // Funcion que retira el dinero
    fun retirarDinero(){
        var cantidad = 0.0
        do {
            cantidad = Depurar.leerDecimal("Introduce la cantidad que quiere retirar: ")
            if(cantidad <= 0){
                println("Introduzca una cantidad positiva")
            }else if(cantidad>saldo){
                println("No puede retirar una cantidad superior al saldo disponible")
            }
        } while (cantidad <= 0 || cantidad>saldo)
        saldo -=cantidad
        println("Se ha retirado el dinero.")
    }
}