package com.example.nasaneo.features.list

import com.example.nasaneo.data.model.Neo
import org.junit.Test

class ListViewModelTest {

    private val neo = Neo("id", "refid", "name", "url")


    @Test
    fun `should fetch items`() {
        // given

        // when
        val viewModel = createViewModel()

        // then
    }

    private fun createViewModel() =
        ListViewModel()
}
