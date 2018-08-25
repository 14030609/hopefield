package matrixOperations

class Substract{

    fun sub(matriz1: ArrayList<IntArray>,matriz2: ArrayList<IntArray>)
    {
        val resultado = Array(matriz1.size) { IntArray(matriz1[0].size) }


        for (x in 0 until resultado.size) {
            for (y in 0 until resultado[x].size) {
                resultado[x][y] = matriz1[x][y] - matriz2[x][y]
            }
        }
    }
}