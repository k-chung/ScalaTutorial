object Exercise1 {
    def main(args: Array[String]) = {
        // recursive
        assert(recursiveFib(0) == 0)
        assert(recursiveFib(1) == 1)
        assert(recursiveFib(8) == 21)

        // iterative
        assert(iterativeFib(0) == 0)
        assert(iterativeFib(1) == 1)
        assert(iterativeFib(8) == 21)

        println("Success!")
    }

    def recursiveFib(num: Int): Int = {
    }

    def iterativeFib(num: Int): Int = {
    }
}
