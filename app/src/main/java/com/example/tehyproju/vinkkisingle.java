/**
 * @author Heini Näppä
 * @version 9.12.2019
 */

package com.example.tehyproju;

import java.util.ArrayList;
import java.util.List;

/**luodaan singelton luokka vinkeille, joista siis jokainen näkyy omalla sivullaan (activity_view_vinkit)
 * määritellään vinkeille lista, johon ne kasataan
 */
class vinkkisingle {
    private static final vinkkisingle ourInstance = new vinkkisingle();

    private List<Vinkki> vinkit;

    /**
     *
     * @return ourInstance
     */
    static vinkkisingle getInstance() {
        return ourInstance;
    }

    /** Luodaan uusi lista
     * määritellään listan sisältö
     */
    private vinkkisingle() {
        vinkit = new ArrayList<Vinkki>();

        vinkit.add(new Vinkki("Haittavaikutus: Hiustenlähtö", "Hiusten ja muiden ihokarvojen kasvu voi tiettyjä solunsalpaajia käytettäessä pysähtyä, mikä johtaa osittaiseen tai täydelliseen kaljuuntumiseen ja ihokarvojen lähtöön myös muualta kehosta. Solunsalpaajahoidon päätyttyä karvat kasvavat takaisin. Voit saada maksutta peruukin sairaalasta saatavalla maksusitoumuksella."));
        vinkit.add(new Vinkki("Haittavaikutus: Pahoinvointi", "Pahoinvointi on todella yleistä. Kuten muutkin solunsalpaajien haitat, pahoinvointioireet riippuvat sekä lääkeaineista että käytettävästä annoksesta. Saatat kokea oksentelua muutaman tunnin kuluttua hoidosta tai pitkittyneenä kuvotuksena, joka saattaa kestää muutamia vuorokausia. Pahoinvointiin on onneksi saatavilla estolääkitys, josta kannattaa sopia hoitavan lääkärin kanssa."));
        vinkit.add(new Vinkki("Haittavaikutus: Limakalvovauriot", "Limakalvot ovat nopeasti uusiutuvia kudoksia ja siksi alttiita solunsalpaajien haitoille. Solunsalpaajahoidon jälkeen suun ja nielun limakalvot voivat alkaa punoittaa ja limakalvoon saattaa ilmaantua katteita sekä haavaumia. Juominen ja syöminen aiheuttavat kipua, ja hankalimmillaan jopa syljen nieleminen on vaikeaa. Hiivatulehdukset ovat yleisiä ja herpestulehdus on mahdollinen. Solunsalpaajahoidon alkuvaiheessa kannattaa käydä hammaslääkärissä, joka korjaa tulehduspesäkkeet. Muista pitää erityisen hyvää huolta suusi hygieniasta!"));
        vinkit.add(new Vinkki("Haittavaikutus: Ripuli", "Ripuli on tavallinen solunsalpaajahoidon haittavaikutus. Se johtuu hoidon aiheuttamista suoliston limakalvovaurioista. Jos ripuli vaivaa usein ja on vaikeaa, kannattaa käyttää ripulilääkkeitä hidastamaan suolen toimintaa."));
        vinkit.add(new Vinkki("Haittavaikutus: Luuydinvauriot", "Verisolut muodostuvat luuytimessä, jota on ihmisen suurissa luissa. Solunsalpaajahoito voi aiheuttaa veren valkosolujen ja verihiutaleiden sekä hemoglobiinin laskun. Merkittävin haitta on yleensä valkosolujen määrän lasku. Tavallisesti luuydinhaitat ovat ohimeneviä ja veriarvot korjaantuvat vähitellen. Luuytimeen kohdistuvat haittavaikutukset rajoittavat monen solunsalpaajan annostusta. Luuytimen vaurioituminen lisää tulehdusten ja tartuntatautien riskiä. Luuydinvauriot voivat näkyä myös muunnoksina kynsissä."));
        vinkit.add(new Vinkki("Haittavaikutus: Ummetus", "Ummetus on yleinen solunsalpaajahoidon haittavaikutus. Siihen vaikuttaa limakalvovauriot ja ruoansulatuselimistön toiminnan muutokset. Ummetus on yleensä ohimenevää, mutta sitä voi helpottaa ummetukseen tarkoitetuilla itsehoitolääkkeillä. "));
        vinkit.add(new Vinkki("Kuntoutuminen: Fyysinen hyvinvointi", "Liikunta hoidon aikana on turvallista ja edistää toipumistasi. Harrasta liikuntaa kuitenkin vointisi sallimmissa rajoissa. \n On suositeltavaa, että liikut vähintään 30 minuuttia päivittäin. Muista! Puolustusjärjestelmäsi on syöpähoidon aikana heikoimmillaan ja keho joutuu kokemaan kovimpia koettelemuksiaan. Älä siis yritä raskaita liikuntasuorituksia, vaan nauti kevyestä liikunnasta, joka ylläpitää virkeää oloa. Suorituskykysi kyllä paranee hiljalleen. \n Hyviä liikuntavaihtoehtoja ovat esimerkiksi ulkona kävely tai kevyt pyöräily, rauhallinen uinti, jooga, kevyt kuntosaliharjoittelu tai muu itsellesi mieluisa harrastus, kunhan muistat ottaa rauhallisesti ja lopettaa liikunnan jos tunnet yhtään uupumusta, huimausta tai pahoinvointia."));
        vinkit.add(new Vinkki("Kuntoutuminen: Psyykkinen hyvinvointi", "Syöpään sairastuminen on henkisesti uuvuttava prosessi. Epätoivon, ahdistuksen, pelon ja epävarmuuden tunteet ovat täysin normaaleja ja hyväksyttäviä. Mielen hyvinvointi on tärkeää toipumisen kannalta. Voit edistää mielesi hyvinvointia tekemällä jokapäivä itsellesi mieluisia asioita, jotka ovat ennen syöpää saaneet sivut tuntemaan olosi hyväksi. Näitä voivat olla erilaiset harrastukset tai puuhat, hyvän ruoan syöminen, jokin liikunta tai läheisten/ystävien kanssa oleminen. Kiinnitä huomiosi positiivisiin asioihin elämässäsi. Älä lannistu, jos tekemisen aloittaminen tuntuu raskaalta, koska mieli on luonnollisesti maassa, tärkeitä on että saat itsesi tekemään kivoja asioita. Jos minkään aloittaminen tuntuu mahdottoman vaikealta, ota rohkeasti yhteyttä lääkäriin, syöpäyhdistykseen tai esimerkiksi Syöpäjärjestön sivuilta löytyviin kuntoutuskursseihin. Sinun ei kuulu jäädä murheidesi kanssa yksin. :)"));
        vinkit.add(new Vinkki("Kuntoutuminen: Ravitsemus", "Ruokahalu usein häviää tai alenee merkittävästi syöpähoitojen aikana. On kuitenkin toipumisen kannalta tärkeää, että saat soluillesi ravintoaineita ja kehoon riittävästi energiaa, jotta se jaksaa korjata itseään. \n Monipuolinen ravitsemus tukee myös liikunnan harrastamista ja auttaa aivoja erittämään erilaisia hormoneja, jotka tukevat positiivisena pysymistä. Pyri syömään päivittäin mahdollisimman paljon värejä. \n Koosta ruokavaliosi pohja salaateista, erivärisistä paprikoista, tomaateista, eri sipuleista, marjoista ja hedelmistä. Näiden lisäksi syö myös riittävästi hyviä rasvoja, niistä saat energiaa ja rasvahappoja. Niitä saat mm. avocadosta, macadamia-öljystä, lohesta, hampunsiemenistä ja chiasiemenistä. Joistakin näistä rasvan lähteistä saat myös hyvin proteiinia, mutta sitä saat myös esimerkiksi kanasta, kananmunista, linsseistä ja pavuista. Kuitua ja energiaa saat lisäksi mm. viljahiutaleista ja -leseistä, perunasta ja tummasta riisistä."));
        vinkit.add(new Vinkki("Kuntoutuminen: Uni ja lepo", " Riittävä nukkuminen ja lepääminen on tärkeää toipumisvaiheessa. \n On täysin hyväksyttävää, jos haluat levätä enemmän kuin ennen syöpää. Joskus unta voi kuitenkin häiritä erilaiset pelon tunteet tai kehon liika rasitus. \n Kotikonstein voit edistää unen laatuasi pitämällä kiinni säännöllisestä unirytmistä, se auttaa melatoniinin eritystä aina tiettyyn kellonaikaan, joka saa sinut nukahtamaan. Sen lisäksi vaihda lakanat säännöllisesti ja tuuleta makuuhuonetta, jotta sielä olisi raikas ja puhdas ilma nukkua. \n Unen laatuun vaikuttaa myös harrastettu liikunta, joten esimerkiksi 20 minuutin rauhallinen kävely ulkona alle kaksi tuntia ennen nukkumaanmenoa voi auttaa nukahtamisessa. Voit esimerkiksi mennä käveylle ja sieltä takaisin tultaessa keittää kupin kamomillateetä ja alkaa iltatoimiin. Vältä siniselle valolle altistumista enää sen jälkeen, sillä sein häiritsee melatoniinin eritystä. Voit lukea esimerkiksi kirjaa, joka saa sinut hyvälle mielelle tai kuunnella rentouttavaa musiikkia."));

    }

    /**
     * metodit, jolla palautetaan listan sisältö sekä sisältö omalla indeksillään
     * @return Vinkki-lista sekä käyttäjän valitsema indeksi
     */
    public List<Vinkki> getVinkit() {
        return vinkit;
    }
    public Vinkki getVinkit(int i){
        return vinkit.get(i);
    }
}
