class Luminaire : Eclairage {
    var ampoule1 = AmpouleLed()
    var ampoule2 = AmpouleLed()
    var ampoule3 = AmpouleLed()
    var ampoule4 = AmpouleLed()

    constructor(
        ampoule1 : AmpouleLed,
        ampoule2 : AmpouleLed,
        ampoule3 : AmpouleLed,
        ampoule4 : AmpouleLed
    ){
        this.ampoule1 =  ampoule1
        this.ampoule2 =  ampoule2
        this.ampoule3 =  ampoule3
        this.ampoule4 =  ampoule4
    }
    constructor(){
    }
    override fun allumer() {
        ampoule1.allumer()
        ampoule2.allumer()
        ampoule3.allumer()
        ampoule4.allumer()
    }
    override fun eteindre() {
        ampoule1.eteindre()
        ampoule2.eteindre()
        ampoule3.eteindre()
        ampoule4.eteindre()
    }
    override fun intensifier() {
        ampoule1.intensifier()
        ampoule2.intensifier()
        ampoule3.intensifier()
        ampoule4.intensifier()
    }
    override fun diminuer() {
        ampoule1.diminuer()
        ampoule2.diminuer()
        ampoule3.diminuer()
        ampoule4.diminuer()
    }
    override fun etat(): Int {
        return ampoule1.etat() and ampoule2.etat() and ampoule3.etat() and ampoule4.etat()
    }

    override fun toString(): String {
        return this.javaClass.name + " : " + "ampoule1 " + ampoule1.etat() + "ampoule2 " + ampoule2.etat() + "ampoule3 " + ampoule3.etat() + " " +
                "ampoule4 " + ampoule4.etat()
    }

}