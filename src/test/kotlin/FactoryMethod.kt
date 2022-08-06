import factorymethod.virusexample.VirusFactory
import factorymethod.virusexample.VirusType
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

sealed class Country {
    object Germany : Country()

}

data class Nigeria (val type : String) : Country()
data class USA (val type : String) : Country()
object Finland : Country()

class Currency (val type : String)

object CurrentFactory {
    fun createCurrencyBaseOnCountry (country: Country) : Currency =
        when(country) {
            Finland -> Currency("FIN")
            Country.Germany -> Currency("GER")
            is Nigeria -> Currency("NGR")
            is USA -> Currency("USD")
        }

}

class CurrentFactoryTest {
    @Test
    fun currencyTest() {
        val nigeriaCurrent = CurrentFactory.createCurrencyBaseOnCountry(Nigeria("")).type
        println("Nigeria Currency : $nigeriaCurrent")

        val germanyCurrency = CurrentFactory.createCurrencyBaseOnCountry(Country.Germany).type
        println("Germany Currency : $germanyCurrency")

        Assertions.assertThat(nigeriaCurrent).isEqualTo("NGR")
        Assertions.assertThat(germanyCurrency).isEqualTo("GER")
    }
}

