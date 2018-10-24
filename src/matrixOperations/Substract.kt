package matrixOperations

class Substract{

    fun sub(matriz1: ArrayList<IntArray>,matriz2: ArrayList<IntArray>)
    {
        //val matriz1 = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6))
        //val matriz2 = arrayOf(intArrayOf(6, 5, 4), intArrayOf(3, 2, 1))

        val resultado = Array(matriz1.size) { IntArray(matriz1[0].size) }


        for (x in 0 until resultado.size) {
            for (y in 0 until resultado[x].size) {
                resultado[x][y] = matriz1[x][y] - matriz2[x][y]
            }
        }


        /*resultado.forEach { res ->
            res.forEach { v->
                print(v)
            }
            println("")
        }*/

    }
}