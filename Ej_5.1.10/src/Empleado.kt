class Empleado(nombre: String, edad: Int, val salarioBase: Double, val porcentajeImpuestos: Double = 10.0): Persona(nombre, edad) {

    override fun calcularSalario(): Double {
        return salarioBase * (1 - porcentajeImpuestos / 100)
    }

    override fun toString(): String {
        return "${super.toString()}, Salario: ${"%.2f".format(calcularSalario())}€"
    }

    fun trabajar(): String {
        return "$nombre está trabajando en la empresa."
    }

}