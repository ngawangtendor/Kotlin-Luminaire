class AmpouleIncandescente: Eclairage {
    override fun allumer() {
        TODO("Not yet implemented")
    }

    override fun etaindre() {
        TODO("Not yet implemented")
    }

    override fun intensifier() {
        TODO("Not yet implemented")
    }

    override fun diminuer() {
        TODO("Not yet implemented")
    }

    override fun etat(): Int {
        TODO("Not yet implemented")
    }
    override fun toString(): String {
        return this.javaClass.name + " : " + this.etat
    }
}