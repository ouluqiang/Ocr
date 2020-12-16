package com.olq.base

import com.olq.base.loader.BaseUrl
import com.olq.base.loader.getString
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
//        assertEquals(4, 2 + 2)
        getString(BaseUrl.CATEGORY)
    }
}