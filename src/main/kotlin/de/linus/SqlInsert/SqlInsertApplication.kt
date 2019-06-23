package de.linus.SqlInsert

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.util.*

@SpringBootApplication
class SqlInsertApplication : CommandLineRunner {

    private var statement: String = "insert into "
    private var schema: String? = null
    private var tabelle: String? = null
    private var id: Int? = null
    private var datum: String? = null
    private var ort: String? = null
    private var tiefe: Double? = null
    private var dauer: Int? = null
    private var zeit: String? = null
    private var verbrauch: String? = null
    private var groesse: String? = null
    private var sicht: String? = null
    private var anzug: String? = null
    private var gewicht: Int? = null
    private var wtemp: Int? = null
    private var ltemp: Int? = null
    private var buddy: String? = null
    private var kommentar: String? = null

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            runApplication<SqlInsertApplication>(*args)
        }
    }

    override fun run(vararg args: String?) {
        val input = Scanner(System.`in`)

        //schema
        println("Schema?")
        Thread.sleep(1000)
        schema = input.nextLine().toUpperCase()
        statement += "$schema."

        //tabelle
        println("Tabelle?")
        Thread.sleep(1000)
        tabelle = input.nextLine().toUpperCase()
        statement += "$tabelle values ("

        //id
        println("Id?")
        Thread.sleep(1000)
        id = input.nextInt()
        input.nextLine()
        statement += "$id,"

        //datum
        println("Datum?")
        Thread.sleep(1000)
        datum = input.nextLine()
        statement += "'$datum',"

        //ort
        println("Ort?")
        Thread.sleep(1000)
        ort = input.nextLine()
        statement += "'$ort',"

        //tiefe
        println("Tiefe?")
        Thread.sleep(1000)
        tiefe = input.nextDouble()
        input.nextLine()
        statement += "$tiefe,"

        //dauer
        println("Zeitdauer?")
        Thread.sleep(1000)
        dauer = input.nextInt()
        input.nextLine()
        statement += "$dauer,"

        //zeit
        println("Einstiegszeit?")
        Thread.sleep(1000)
        zeit = input.nextLine()
        statement += "'$zeit',"

        //verbrauch
        println("Verbrauch?")
        Thread.sleep(1000)
        verbrauch = input.nextLine()
        statement += "'$verbrauch',"

        //flaschengroesse
        println("Flaschengroesse?")
        Thread.sleep(1000)
        groesse = input.nextLine()
        statement += "'$groesse',"

        //sicht
        println("Sicht?")
        Thread.sleep(1000)
        sicht = input.nextLine()
        statement += "'$sicht',"

        //anzug
        println("Anzug?")
        Thread.sleep(1000)
        anzug = input.nextLine()
        statement += "'$anzug',"

        //gewicht
        println("Gewicht?")
        Thread.sleep(1000)
        gewicht = input.nextInt()
        input.nextLine()
        statement += "$gewicht,"

        //wasser temp
        println("Wassertemperatur")
        Thread.sleep(1000)
        wtemp = input.nextInt()
        input.nextLine()
        statement += "$wtemp,"

        //luft temp
        println("Lufttemperatur")
        Thread.sleep(1000)
        ltemp = input.nextInt()
        input.nextLine()
        statement += "$ltemp,"

        //buddy
        println("Buddy?")
        Thread.sleep(1000)
        buddy = input.nextLine()
        statement += "'$buddy',"

        //kommentar
        println("Kommentar?")
        Thread.sleep(1000)
        kommentar = input.nextLine()
        statement += "'$kommentar');"

        Thread.sleep(1000)
        println(statement)
    }
}
