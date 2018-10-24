package matrixOperations

class Multiplication{

    fun multiplyMatrices(m1: ArrayList<IntArray>,m2: ArrayList<IntArray>) : Array<IntArray>{

        //val m1 = arrayOf(intArrayOf(1, 0, 2), intArrayOf(-1, 3, 1))
        //val m2 = arrayOf(intArrayOf(3, 1), intArrayOf(2, 1), intArrayOf(1, 0))

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

           /* multiplicacion.forEach { res->
                res.forEach { s->
                    print(s)
                }
                println("")
            }*/

            return multiplicacion

        }
        return multiplicacion


    }
}