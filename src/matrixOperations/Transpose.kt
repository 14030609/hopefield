package matrixOperations
class Transpose (  ) {



    fun transpose(matrix: ArrayList<IntArray>) : Array<IntArray>
    {
        //val matrix = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9), intArrayOf(10, 11, 12))
        val matrixT = Array(matrix[0].size) { IntArray(matrix.size) }

        for (x in 0 until matrix.size) {
            for (y in 0 until matrix[x].size) {
                matrixT[y][x] = matrix[x][y]
            }
        }
/*
        matrixT.forEach { fila->
            fila.forEach {x ->
                print(x)
            }
            println("")
        }

        println("")

        matrix.forEach { fila->
            fila.forEach {x ->
                print(x)
            }
            println("")
        }*/

        return matrixT

    }
}