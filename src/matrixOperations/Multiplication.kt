package matrixOperations

class Multiplication{

    fun multiplyMatrices(m1: Array<IntArray>, m2: Array<IntArray>) : Array<IntArray>{

        val fil_m1 = m1.size
        val col_m1 = m1[0].size

        val fil_m2 = m2.size
        val col_m2 = m2[0].size

        val multiplicacion = Array(fil_m1) { IntArray(col_m2) }
        if (col_m1 != fil_m2)
            println(("No se pueden multiplicar las matrices"))
        else{
            val multiplicacion = Array(fil_m1) { IntArray(col_m2) }

            for (x in 0 until multiplicacion.size) {
                for (y in 0 until multiplicacion[x].size) {
                     for (z in 0 until col_m1) {
                        multiplicacion[x][y] += m1[x][z] * m2[z][y]
                     }
                }
            }
            return multiplicacion
        }
        return multiplicacion
    }
}