package factorymethod.virusexample

class VirusFactory {
    companion object{
        fun makeVirus (virusType: VirusType) : Virus {
            return when(virusType) {
                VirusType.CORONA -> { CoronaVirus() }
                VirusType.COW_POX -> { CowPoxVirus() }
                VirusType.HIV -> { HIVVirus() }
                VirusType.SMALL_POX -> { SmallPoxVirus() }
            }
        }
    }
}