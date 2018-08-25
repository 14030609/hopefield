package Process

class Orthogonality {
    fun checkOrthogonality(m1: Array<IntArray>, m2: Array<IntArray>):Int{
        val m1 = arrayOf(intArrayOf(1, 1,-1), intArrayOf(-1, 1,1), intArrayOf(-1, 1,1))
        val m2 = arrayOf(intArrayOf(-1, 1,-1), intArrayOf(1, -1,1), intArrayOf(1, 1,1))

        var sumatoria = 0
        for (i in 0 until m1.size){
            for (j in 0 until m1[0].size){
                sumatoria += (m1[i][j] * m2[i][j])
            }
        }
        return sumatoria
    }
}
