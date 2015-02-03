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
        if (num == 0) {
            0
        } else if (num == 1) {
            1
        } else {
            recursiveFib(num - 1) + recursiveFib(num - 2)
        }
    }

    def iterativeFib(num: Int): Int = {
        if (num == 0) {
            0
        } else {
            var count = num
            var curr: Int = 1
            var firstPrev: Int = 1
            var secondPrev: Int = 0
            while (count > 1) {
                curr = firstPrev + secondPrev 
                secondPrev = firstPrev
                firstPrev = curr
                
                count -= 1
            }

            curr
        }
    }
}
