package matrixOperations
class Transpose (  ) {



    fun transpose(matrix: Array<IntArray>) : Array<IntArray>
    {
        val matrixT = Array(matrix[0].size) { IntArray(matrix.size) }

        for (x in 0 until matrix.size) {
            for (y in 0 until matrix[x].size) {
                matrixT[y][x] = matrix[x][y]
            }
        }
        return matrixT
    }
}