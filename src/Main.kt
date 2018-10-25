import matrixOperations.Multiplication
import matrixOperations.Substract
import matrixOperations.Weights
import Process.Orthogonality

fun main(args: Array<String>) {
    //definicion de patrones
    val m1 = arrayOf(intArrayOf(1, 1,-1,1), intArrayOf(-1, 1,1,1), intArrayOf(-1, 1,1,1),intArrayOf(1, 1,1,-1))
    val m2 = arrayOf(intArrayOf(1, 1,-1,1), intArrayOf(-1, 1,1,1), intArrayOf(-1, 1,1,1),intArrayOf(1, 1,-1,1))

    val pf = arrayOf(intArrayOf(-1, 1,1,1), intArrayOf(1, -1,-1,1), intArrayOf(1, 1,1,1), intArrayOf(1, 1,1,1))
    val m= Multiplication()

    val mul = Weights()
    val orth = Orthogonality()
    val n= m1.size*m1[0].size
    println(n*0.138)


    //recuperacion

    if (2<=0.138*n){
        println("recuperacion buena")

        if (2<=(n/(4*Math.log(n.toDouble()))))
        {
            println(" pronta recuperacion")

            //ortogonalidad

            if(orth.checkOrthogonality(m1,m2)<=0)
            {
               println("Es ortogonal")
            }
            else
                println("No es ortogonal")

        }else
        {
            println(" no pronta recuperacion")
        }

    }else
        println("recuperacion mala ")

    val weights= mul.Weights(m1,m2)
    //funcionamiento
    val fe =m.multiplyMatrices(pf,weights)
    val resultado = Array(fe.size) { IntArray(fe[0].size) }
    for (x in 0 until resultado.size) {
        for (y in 0 until resultado[x].size) {
            if (fe[x][y]>0)
            {
                resultado[x][y] = 1
            }else
            {
                resultado[x][y] = -1
            }
        }
    }



    var sumatoria = 0
    for (i in 0 until resultado.size){
        for (j in 0 until resultado[0].size){
            sumatoria += (resultado[i][j] * pf[i][j])
        }
    }

    if (sumatoria==0)
    {
        println("ys = pf")
    }
    else
    {
        println("ys no es igual a pf")

    }

    println("pesos")
    for (x in 0 until weights.size) {
        for (y in 0 until weights[x].size) {
            print(weights[x][y])
        }
        println()
    }

    println("ys")
    for (x in 0 until resultado.size) {
        for (y in 0 until resultado[x].size) {
            print(resultado[x][y])
        }
        println()
    }

    println("pf")

    for (x in 0 until pf.size) {
        for (y in 0 until pf[x].size) {
            print(pf[x][y])
        }
        println()
    }





}