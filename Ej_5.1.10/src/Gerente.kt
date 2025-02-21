class Gerente(nombre: String, edad: Int, val bonus: Double, val exentoImpuestos: Boolean = false, val salarioBase: Double,  val porcentajeImpuestos: Double = 10.0): Persona(nombre, edad) {

    override fun calcularSalario(): Double {
        return if (exentoImpuestos){
            salarioBase + bonus
        }else{
            (salarioBase - (salarioBase * porcentajeImpuestos)) + bonus
        }

    }

    override fun toString(): String {
        return "${super.toString()}, Bonus: ${"%.2f".format(bonus)}€, Exento de impuestos: $exentoImpuestos"
    }

    fun administrar(): String {
        return "$nombre está administrando la empresa."
    }


}