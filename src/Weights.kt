package matrixOperations


class Weights {

    fun Weights(m1: Array<IntArray>,m2: Array<IntArray>):Array<IntArray>
    {

        val i = arrayOf(intArrayOf(1,0,0), intArrayOf(0,1,0), intArrayOf(0,0,1))

//        val m1 = arrayOf(intArrayOf(1, 1), intArrayOf(-1, 1), intArrayOf(-1, 1))
  //      val m2 = arrayOf(intArrayOf(-1, 1), intArrayOf(1, -1), intArrayOf(1, 1))
//        val m3 = arrayOf(intArrayOf(3, 1), intArrayOf(2, 1), intArrayOf(1, 0))

        val m= Multiplication()
        val t= Transpose()
        val s= Addition()

        val transpose1=t.transpose(m1)
        val transpose2=t.transpose(m2)
  //      val transpose3=t.transpose(m3)


        val multiplicacion =m.multiplyMatrices(m1,transpose1)
        val multiplicacion2 =m.multiplyMatrices(m2,transpose2)
    //    val multiplicacion3 =m.multiplyMatrices(m3,transpose3)


        var suma=s.sum(multiplicacion,multiplicacion2)
      //  suma=s.sum(suma,multiplicacion3)
        suma=s.sum(suma,i)

        return suma
    }
}