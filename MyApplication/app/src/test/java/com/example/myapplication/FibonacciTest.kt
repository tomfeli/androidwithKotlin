package com.example.myapplication


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class FibonacciTest {
    @Test
    fun `test fibonacci for 0` (){
        var result = HomeworkVideo3.fib(0)
        assertThat(result).isEqualTo(0)
    }

    @Test
    fun `test fibonacci for 1` (){
        var result = HomeworkVideo3.fib(1)
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun `test fibonacci for n` (){
        var result = HomeworkVideo3.fib(2)
        assertThat(result).isEqualTo(1)
        result = HomeworkVideo3.fib(4)
        assertThat(result).isEqualTo(3)

        result = HomeworkVideo3.fib(5)
        assertThat(result).isEqualTo(5)


        result = HomeworkVideo3.fib(6)
        assertThat(result).isEqualTo(8)
    }

    @Test
    fun `test no parentesis` (){
        var result = HomeworkVideo3.checkBraces("hcuheiufdbuei")
        assertThat(result).isTrue()
    }

    @Test
    fun `test one parentesis` (){
        var result = HomeworkVideo3.checkBraces("hcuh(eiufdbuei")
        assertThat(result).isFalse()
    }

    @Test
    fun `test parentesis in wrong order` (){
        var result = HomeworkVideo3.checkBraces("hc)uh(eiufdbuei")
        assertThat(result).isFalse()
    }

    fun `test many parentesis ordered wrongly` (){
        var result = HomeworkVideo3.checkBraces("hc)u(h(eiufdb)u)e((i)")
        assertThat(result).isFalse()
    }

    @Test
    fun `test ok parentesis` (){
        var result = HomeworkVideo3.checkBraces("hcu(heiufdbu)ei")
        assertThat(result).isTrue()
    }

    @Test
    fun `test parentesis inside parentesis` (){
        var result = HomeworkVideo3.checkBraces("h(cu(heiu)fd)buei")
        assertThat(result).isTrue()
    }

    @Test
    fun `test sets of parentesis` (){
        var result = HomeworkVideo3.checkBraces("(h)(cu)heiufdbuei")
        assertThat(result).isTrue()
    }

}