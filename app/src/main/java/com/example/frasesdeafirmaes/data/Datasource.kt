package com.example.frasesdeafirmaes.data

import com.example.frasesdeafirmaes.R
import com.example.frasesdeafirmaes.model.Affirmation

/**
 * [Datasource] generates a list of [Affirmation]
 */
class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(

            Affirmation(R.string.afirmacao1, R.drawable.image1),
            Affirmation(R.string.afirmacao2, R.drawable.image2),
            Affirmation(R.string.afirmacao3, R.drawable.image3),
            Affirmation(R.string.afirmacao4, R.drawable.image4),
            Affirmation(R.string.afirmacao5, R.drawable.image5),
            Affirmation(R.string.afirmacao6, R.drawable.image6),
            Affirmation(R.string.afirmacao7, R.drawable.image7),
            Affirmation(R.string.afirmacao8, R.drawable.image8),
            Affirmation(R.string.afirmacao9, R.drawable.image9),
            Affirmation(R.string.afirmacao10, R.drawable.image10)
        )

    }
}
