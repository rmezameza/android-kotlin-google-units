package com.example.affirmations

import android.content.Context
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.model.Affirmation
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock

class AffirmationsAdapterTests {

    private val context = mock(Context::class.java)

    // Tests the size of the ItemAdapter against the size of the dataset
    @Test
    fun adapter_size() {

        // Fill the dataset with two affirmations
        val data = listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2)
        )

        // Insert the dataset to the adapter
        val adapter = ItemAdapter(context, data)

        // Adapter should have two items like the dataset.
        assertEquals("ItemAdapter is not the correct size", data.size, adapter.itemCount)
    }
}