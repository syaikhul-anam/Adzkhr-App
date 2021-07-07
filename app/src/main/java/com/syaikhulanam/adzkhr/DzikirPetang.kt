package com.syaikhulanam.adzkhr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.syaikhulanam.adzkhr.adapter.DzikirAdapter
import com.syaikhulanam.adzkhr.model.Dzikir
import kotlinx.android.synthetic.main.activity_dzikir_petang.*
import java.util.ArrayList

class DzikirPetang : AppCompatActivity() {

    private val dzikir = ArrayList<Dzikir>()
    private lateinit var dzikirAdapter: DzikirAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dzikir_petang)
        //init view
        val rv_evening = findViewById<RecyclerView>(R.id.rv_evening)

        //init Layout Manager
        val mlayoutManager = LinearLayoutManager(applicationContext)
        mlayoutManager.orientation = LinearLayoutManager.HORIZONTAL
        mlayoutManager.reverseLayout = true
        mlayoutManager.stackFromEnd = true
        rv_evening.layoutManager = mlayoutManager
        rv_evening.itemAnimator = DefaultItemAnimator()

        //set adapter
        dzikirAdapter = DzikirAdapter(dzikir)
        rv_evening.adapter = dzikirAdapter

        //to Auto Center Views
        val snapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(rv_evening)
        rv_evening.isMotionEventSplittingEnabled = false

        //setting toolbar
        evening_toolbar.setTitle(null)
        setSupportActionBar(evening_toolbar)
        assert(supportActionBar != null)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        prepareDzikirData()
    }
    private fun prepareDzikirData() {
        var dzikirData = Dzikir(
            "[ 17 / 17 ]",
            " Doa Perlindungan dari Kejahatan Makhluk ",
            "( dibaca 3x )",
            "أَعُوْذُ بِكَلِمَاتِ اللهِ التَّامَّاتِ مِنْ شَرِّ مَا خَلَقَ",
            "A’udzu bikalimaatillahit-taammaati min syarri maa kholaq.",
            "“Aku berlindung dengan kalimat-kalimat Allah yang sempurna dari kejahatan makhluk yang diciptakanNya.” ",
            "“Siapa yang mengucapkannya di petang hari, niscaya tidak ada racun atau binatang (seperti: kalajengking) yang mencelakakannya di malam itu.”\n" +
                    "(HR. Ahmad 2: 290. Syaikh Syu’aib Al Arnauth mengatakan bahwa sanad hadits ini shahih sesuai syarat Muslim)",
        )
        dzikir.add(dzikirData)
        dzikirData = Dzikir(
            "[ 16 / 17 ]",
            "Tasbih dan Tahmid",
            "( dibaca 100x )",
            "سُبْحَانَ اللهِ وَبِحَمْدِهِ",
            "Subhanallah wa bi-hamdih",
            "“Maha suci Allah, aku memuji-Nya.”",
            "Barangsiapa yang mengucapkan kalimat ‘subhanallah wa bi hamdih’ di pagi dan petang hari sebanyak 100 x, maka tidak ada yang datang pada hari kiamat yang lebih baik dari yang ia lakukan kecuali orang yang mengucapkan semisal atau lebih dari itu.\n" +
                    "(HR. Muslim no. 2692)",
        )
        dzikir.add(dzikirData)
        dzikirData = Dzikir(
            "[ 15 / 17 ]",
            "Tahlil",
            "( dibaca 1/10/100x )",
            "لاَ إِلَـهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرُ",
            "Laa ilaha illallah wahdahu laa syarika lah, lahul mulku walahul hamdu wa huwa ‘ala kulli syai-in qodiir.",
            " “Kami telah memasuki waktu petang dan kerajaan hanya milik Allah, segala puji bagi Allah. Tidak ada ilah (yang berhak disembah) kecuali Allah semata, tiada sekutu bagi-Nya. Milik Allah kerajaan dan bagi-Nya pujian. Dia-lah Yang Mahakuasa atas segala sesuatu.Wahai Rabbku, aku mohon kepada-Mu kebaikan di malam ini dan kebaikan sesudahnya. Aku berlindung kepadaMu dari kejahatan malam ini dan kejahatan sesudahnya. Wahai Rabbku, aku berlindung kepadaMu dari kemalasan dan kejelekan di hari tua. Wahai Rabbku, aku berlindung kepada-Mu dari siksaan di neraka dan siksaan di kubur.” ",
            "Barangsiapa yang membaca dzikir tersebut di pagi hari sebanyak sepuluh kali, Allah akan mencatatkan baginya 10 kebaikan, menghapuskan baginya 10 kesalahan, ia juga mendapatkan kebaikan semisal memerdekakan 10 budak, Allah akan melindunginya dari gangguan setan hingg petang hari. Siapa yang mengucapkannya di petang hari, ia akan mendapatkan keutamaan semisal itu pula. \n" +
                    "(HR. An Nasai Al Kubra 6: 10)",
        )
        dzikir.add(dzikirData)
        dzikirData = Dzikir(
            "[ 14 / 17 ]",
            "Doa Fitrah",
            "( dibaca 1x )",
            "أَمْسَيْنَا عَلَى فِطْرَةِ اْلإِسْلاَمِ وَعَلَى كَلِمَةِ اْلإِخْلاَصِ، وَعَلَى دِيْنِ نَبِيِّنَا مُحَمَّدٍ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ، وَعَلَى مِلَّةِ أَبِيْنَا إِبْرَاهِيْمَ، حَنِيْفًا مُسْلِمًا وَمَا كَانَ مِنَ الْمُشْرِكِيْنَ ",
            "Amsayna ‘alaa fithrothil islam wa ‘alaa kalimatil ikhlas wa ‘alaa diini nabiyyinaa Muhammad shallahu ‘alaihi wa sallam wa ‘alaa millati abiina ibrohim haniifam muslimaw wa maa kaana minal musyrikin",
            "“Di waktu pagi kami berada diatas fitrah agama Islam, kalimat ikhlas, agama Nabi kami Muhammad صلي الله عليه وسلم dan agama ayah kami, Ibrahim, yang berdiri di atas jalan yang lurus, muslim dan tidak tergolong orang-orang musyrik.” ",
            "(HR. Ahmad III/406, 407, ad-Darimi II/292 dan Ibnus Sunni dalam Amalul Yaum wol Lailah no. 34, Misykaatul Mashaabiih no. 2415, Shahiihal-Jaami’ish Shaghiir no. 4674, shahih)",
        )
        dzikir.add(dzikirData)
        dzikirData = Dzikir(
            "[ 13 / 17 ]",
            "Doa Minta Pertolongan",
            "( dibaca 1x )",
            "يَا حَيُّ يَا قَيُّوْمُ بِرَحْمَتِكَ أَسْتَغِيْثُ، وَأَصْلِحْ لِيْ شَأْنِيْ كُلَّهُ وَلاَ تَكِلْنِيْ إِلَى نَفْسِيْ طَرْفَةَ عَيْنٍ أَبَدًا",
            "Yaa Hayyu Yaa Qoyyum, bi-rohmatika as-taghiits, wa ash-lih lii sya’nii kullahu wa laa takilnii ilaa nafsii thorfata ‘ainin abadan.",
            "“Wahai Rabb Yang Maha Hidup, wahai Rabb Yang Berdiri Sendiri (tidak butuh segala sesuatu), dengan rahmat-Mu aku minta pertolongan, perbaikilah segala urusanku dan jangan diserahkan kepadaku sekali pun sekejap mata (tanpa mendapat pertolongan dariMu).” ",
            "Faedah: \n" +
                    "Dzikir ini diajarkan oleh Nabi shallallahu ‘alaihi wa sallam pada Fathimah supaya diamalkan pagi dan petang. \n" +
                    "(HR. Ibnu As Sunni dalam ‘Amalul Yaum wal Lailah no. 46, An Nasai dalam Al Kubro (381/ 570), Al Bazzar dalam musnadnya (4/ 25/ 3107), Al Hakim (1: 545). Sanad hadits ini hasan sebagaimana dikatakan oleh Syaikh Al Albani dalam As Silsilah Ash Shahihah no. 227.)",
        )
        dzikir.add(dzikirData)
        dzikirData = Dzikir(
            "[ 12 / 17 ]",
            "Doa Keridhaan",
            "( dibaca 3x )",
            "رَضِيْتُ بِاللهِ رَبًّا، وَبِاْلإِسْلاَمِ دِيْنًا، وَبِمُحَمَّدٍ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ نَبِيًّا",
            "Rodhiitu billaahi robbaa wa bil-islaami diinaa, wa bi-muhammadin shallallaahu ‘alaihi wa sallama nabiyyaa.",
            "“Aku ridha Allah sebagai Rabb, Islam sebagai agama dan Muhammad shallallahu ‘alaihi wa sallam sebagai nabi.” ",
            "“Barangsiapa yang mengucapkan hadits ini sebanyak tiga kali di pagi hari dan tiga kali di petang hari, maka pantas baginya mendapatkan ridha Allah.”\n" +
                    "(HR. Abu Daud no. 5072, Tirmidzi no. 3389. Al Hafizh Abu Thohir mengatakan bahwa hadits ini hasan)",
        )
        dzikir.add(dzikirData)
        dzikirData = Dzikir(
            "[ 11 / 17 ]",
            "Doa Agar Terhindar dari Marabahaya",
            "( dibaca 3x )",
            "بِسْمِ اللَّهِ الَّذِى لاَ يَضُرُّ مَعَ اسْمِهِ شَىْءٌ فِى الأَرْضِ وَلاَ فِى السَّمَاءِ وَهُوَ السَّمِيعُ الْعَلِيمُ",
            "Bismillahilladzi laa yadhurru ma’asmihi syai-un fil ardhi wa laa fis samaa’ wa huwas samii’ul ‘aliim.",
            "“Dengan nama Allah yang bila disebut, segala sesuatu di bumi dan langit tidak akan berbahaya, Dia-lah Yang Maha Mendengar lagi Maha Mengetahui.” ",
            "“Barangsiapa yang mengucapkan hadits ini sebanyak tiga kali di pagi hari dan tiga kali di petang hari, maka pantas baginya mendapatkan ridha Allah.”\n" +
                    "(HR. Abu Daud no. 5072, Tirmidzi no. 3389. Al Hafizh Abu Thohir mengatakan bahwa hadits ini hasan)",
        )
        dzikir.add(dzikirData)
        dzikirData = Dzikir(
            "[ 10 / 17 ]",
            "Doa Perlindungan",
            "( dibaca 1x )",
            "اَللَّهُمَّ عَالِمَ الْغَيْبِ وَالشَّهَادَةِ فَاطِرَ السَّمَاوَاتِ وَاْلأَرْضِ، رَبَّ كُلِّ شَيْءٍ وَمَلِيْكَهُ، أَشْهَدُ أَنْ لاَ إِلَـهَ إِلاَّ أَنْتَ، أَعُوْذُ بِكَ مِنْ شَرِّ نَفْسِيْ، وَمِنْ شَرِّ الشَّيْطَانِ وَشِرْكِهِ، وَأَنْ أَقْتَرِفَ عَلَى نَفْسِيْ سُوْءًا أَوْ أَجُرَّهُ إِلَى مُسْلِمٍ",
            "Allahumma ‘aalimal ghoybi wasy-syahaadah faathiros samaawaati wal ardh. Robba kulli syai-in wa maliikah. Asyhadu alla ilaha illa anta. A’udzu bika min syarri nafsii wa min syarrisy-syaythooni wa syirkihi, wa an aqtarifa ‘alaa nafsii suu-an aw ajurrohu ilaa muslim.",
            "“Dengan nama Allah yang bila disebut, segala sesuatu di bumi dan langit tidak akan berbahaya, Dia-lah Yang Maha Mendengar lagi Maha Mengetahui.” ",
            "Faedah: \n" +
                    "Do’a ini diajarkan oleh Rasulullah shallallahu ‘alaihi wa sallam pada Abu Bakr Ash Shiddiq untuk dibaca pada pagi, petang dan saat beranjak tidur.\n" +
                    "(HR. Tirmidzi no. 3392 dan Abu Daud no. 5067. Al Hafizh Abu Thohir mengatakan bahawa sanad hadits ini shahih. Adapun kalimat terakhir (وَأَنْ أَقْتَرِفَ عَلَى نَفْسِيْ سُوْءًا أَوْ أَجُرُّهُ إِلَى مُسْلِمٍ) adalah tambahan dari riwayat Ahmad 2: 196. Dikomentari oleh Syaikh Syu’aib Al Arnauth bahwa hadits tersebut shahih dilihat dari jalur lainnya (shahih lighoirihi))\n",

            )
        dzikir.add(dzikirData)
        dzikirData = Dzikir(
            "[ 9 / 17 ]",
            "Doa Keselamatan",
            "( dibaca 1x )",
            "اَللَّهُمَّ إِنِّيْ أَسْأَلُكَ الْعَفْوَ وَالْعَافِيَةَ فِي الدُّنْيَا وَاْلآخِرَةِ، اَللَّهُمَّ إِنِّيْ أَسْأَلُكَ الْعَفْوَ وَالْعَافِيَةَ فِي دِيْنِيْ وَدُنْيَايَ وَأَهْلِيْ وَمَالِيْ اللَّهُمَّ اسْتُرْ عَوْرَاتِى وَآمِنْ رَوْعَاتِى. اَللَّهُمَّ احْفَظْنِيْ مِنْ بَيْنِ يَدَيَّ، وَمِنْ خَلْفِيْ، وَعَنْ يَمِيْنِيْ وَعَنْ شِمَالِيْ، وَمِنْ فَوْقِيْ، وَأَعُوْذُ بِعَظَمَتِكَ أَنْ أُغْتَالَ مِنْ تَحْتِيْ",
            "Allahumma innii as-alukal ‘afwa wal ‘aafiyah fid dunyaa wal aakhiroh. Allahumma innii as-alukal ‘afwa wal ‘aafiyah fii diinii wa dun-yaaya wa ahlii wa maalii. Allahumas-tur ‘awrootii wa aamin row’aatii. Allahummahfazh-nii mim bayni yadayya wa min kholfii wa ‘an yamiinii wa ‘an syimaalii wa min fawqii wa a’udzu bi ‘azhomatik an ugh-taala min tahtii.",
            "“Ya Allah, sesungguhnya aku memohon kebajikan dan keselamatan di dunia dan akhirat. Ya Allah, sesungguhnya aku memohon kebajikan dan keselamatan dalam agama, dunia, keluarga dan hartaku. Ya Allah, tutupilah auratku (aib dan sesuatu yang tidak layak dilihat orang) dan tenteramkanlah aku dari rasa takut. Ya Allah, peliharalah aku dari muka, belakang, kanan, kiri dan atasku. Aku berlindung dengan kebesaran-Mu, agar aku tidak disambar dari bawahku (oleh ular atau tenggelam dalam bumi dan lain-lain yang membuat aku jatuh).” ",
            "Faedah: \n" +
                    "Rasulullah shallallahu ‘alaihi wa sallam tidaklah pernah meninggalkan do’a ini di pagi dan petang hari. Di dalamnya berisi perlindungan dan keselamatan pada agama, dunia, keluarga dan harta dari berbagai macam gangguan yang datang dari berbagai arah.\n" +
                    "(HR. Abu Daud no. 5074 dan Ibnu Majah no. 3871. Al Hafizh Abu Thohir mengatakan bahwa sanad hadits ini shahih)"
        )
        dzikir.add(dzikirData)
        dzikirData = Dzikir(
            "[ 8 / 17 ]",
            "Doa ‘Afiyat",
            "( dibaca 3x )",
            "اَللَّهُمَّ عَافِنِيْ فِيْ بَدَنِيْ، اَللَّهُمَّ عَافِنِيْ فِيْ سَمْعِيْ، اَللَّهُمَّ عَافِنِيْ فِيْ بَصَرِيْ، لاَ إِلَـهَ إِلاَّ أَنْتَ. اَللَّهُمَّ إِنِّي أَعُوْذُ بِكَ مِنَ الْكُفْرِ وَالْفَقْرِ، وَأَعُوْذُ بِكَ مِنْ عَذَابِ الْقَبْرِ، لاَ إِلَـهَ إِلاَّ أَنْتَ ",
            "Allahumma ‘aafinii fii badanii, Allahumma ‘aafinii fi sam’ii, Allhumma ‘aafinii fii bashorii, Laa ilaaha illa anta. Allhumma innii a’uudzubika minal kufri wal faqr, Allahumma innii a’uudzubika min ‘adzabilqobr, Laa ilaha illa anta.",
            "“Ya Allah, selamatkanlah tubuhku (dari penyakit dan dari apa yang tidak aku inginkan). Ya Allah, selamatkanlah pendengaranku (dari penyakit dan maksiat atau dari apa yang tidak aku inginkan). Ya Allah, selamatkanlah penglihatanku, tidak ada Ilah yang berhak diibadahi dengan benar kecuali Engkau. Ya Allah, sesungguhnya aku berlindung kepada-Mu dari kekufuran dan kefakiran. Aku berlindung kepada-Mu dari siksa kubur, tidak ada Ilah yang berhak diibadahi dengan benar kecuali Engkau.”",
            "(HR. Al-Bukhari dalam Shahiib al-Adabil Mufrad no. 701, Abu Dawud no. 5090, Ahmad V/42, hasan. Lihat Shahiih Al-Adabil Mufrad no.539)"
        )
        dzikir.add(dzikirData)
        dzikirData = Dzikir(
            "[ 7 / 17 ]",
            "Sayyidul Istighfar",
            "( dibaca 1x )",
            "اَللَّهُمَّ أَنْتَ رَبِّيْ لاَ إِلَـهَ إِلاَّ أَنْتَ، خَلَقْتَنِيْ وَأَنَا عَبْدُكَ، وَأَنَا عَلَى عَهْدِكَ وَوَعْدِكَ مَا اسْتَطَعْتُ، أَعُوْذُ بِكَ مِنْ شَرِّ مَا صَنَعْتُ، أَبُوْءُ لَكَ بِنِعْمَتِكَ عَلَيَّ، وَأَبُوْءُ بِذَنْبِيْ فَاغْفِرْ لِيْ فَإِنَّهُ لاَ يَغْفِرُ الذُّنُوْبَ إِلاَّ أَنْتَ",
            "Allahumma anta robbii laa ilaha illa anta, kholaqtanii wa anaa ‘abduka wa anaa ‘ala ‘ahdika wa wa’dika mas-tatho’tu. A’udzu bika min syarri maa shona’tu. Abu-u laka bi ni’matika ‘alayya wa abu-u bi dzambii. Fagh-firlii fainnahu laa yagh-firudz dzunuuba illa anta.",
            "“Ya Allah, Engkau adalah Rabbku, tidak ada ilah yang berhak disembah kecuali Engkau, Engkaulah yang menciptakanku. Aku adalah hamba-Mu. Aku akan setia pada perjanjianku pada-Mu (yaitu aku akan mentauhidkan-Mu) semampuku dan aku yakin akan janji-Mu (berupa surga untukku). Aku berlindung kepada-Mu dari kejelekan yang kuperbuat. Aku mengakui nikmat-Mu kepadaku dan aku mengakui dosaku. Oleh karena itu, ampunilah aku. Sesungguhnya tiada yang mengampuni dosa kecuali Engkau.” ",
            "“Barangsiapa mengucapkan dzikir ini di siang hari dalam keadaan penuh keyakinan, lalu ia mati pada hari tersebut sebelum petang hari, maka ia termasuk penghuni surga. Barangsiapa yang mengucapkannya di malam hari dalam keadaan penuh keyakinan, lalu ia mati sebelum pagi, maka ia termasuk penghuni surga.”\n" +
                    "(HR. Bukhari no. 6306)",
        )
        dzikir.add(dzikirData)
        dzikirData = Dzikir(
            "[ 6 / 17 ]",
            "Doa Berserah diri",
            "( dibaca 1x )",
            "اللَّهُمَّ بِكَ أَمْسَيْنَا، وَبِكَ أَصْبَحْنَا،وَبِكَ نَحْيَا، وَبِكَ نَمُوتُ، وَإِلَيْكَ الْمَصِيْرُ",
            "Allahumma bika amsaynaa wa bika ash-bahnaa wa bika nahyaa wa bika namuutu wa ilaikal mashiir.",
            "“Ya Allah, dengan rahmat dan pertolongan-Mu kami memasuki waktu petang, dan dengan rahmat dan pertolongan-Mu kami memasuki waktu pagi. Dengan rahmat dan pertolonganMu kami hidup dan dengan kehendakMu kami mati. Dan kepada-Mu tempat kembali (bagi semua makhluk).” ",
            "(HR. Tirmidzi no. 3391 dan Abu Daud no. 5068. Al Hafizh Abu Thohir mengatakan bahwa sanad hadits ini shahih)",
        )
        dzikir.add(dzikirData)
        dzikirData = Dzikir(
            "[ 5 / 17 ]",
            "Doa Perlindungan",
            "( dibaca 1x )",
            "أَمْسَيْنَا وَأَمْسَى الْمُلْكُ لِلَّهِ، وَالْحَمْدُ للهِ، لَا إِلَهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ، وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيرٌ، رَبِّ أَسْأَلُكَ خَيْرَ مَا فِي هَذِهِ اللَّيْلَةِ وَخَيْرَ مَا بَعْدَهَا، وَأَعُوذُبِكَ مِنْ شَرِّ مَا فِي هَذِهِ اللَّيْلَةِ وَشَرِّ مَا بَعْدَهَا، رَبِّ أَعُوذُبِكَ مِنَ الْكَسَلِ وَسُوءِ الْكِبَرِ، رَبِّ أَعُوذُبِكَ مِنْ عَذَابٍ فِي النَّارِ وَعَذَابٍ فِي الْقَبْرِ",
            "Amsaynaa wa amsal mulku lillah walhamdulillah, laa ilaha illallah wahdahu laa syarika lah, lahul mulku walahul hamdu wa huwa ‘ala kulli syai-in qodir. Robbi as-aluka khoiro maa fii hadzihil lailah wa khoiro maa ba’dahaa, wa a’udzu bika min syarri maa fii hadzihil lailah wa syarri maa ba’dahaa. Robbi a’udzu bika minal kasali wa suu-il kibar. Robbi a’udzu bika min ‘adzabin fin naari wa ‘adzabin fil qobri.",
            "“Kami telah memasuki waktu petang dan kerajaan hanya milik Allah, segala puji bagi Allah. Tidak ada ilah (yang berhak disembah) kecuali Allah semata, tiada sekutu bagi-Nya. Milik Allah kerajaan dan bagi-Nya pujian. Dia-lah Yang Mahakuasa atas segala sesuatu.Wahai Rabbku, aku mohon kepada-Mu kebaikan di malam ini dan kebaikan sesudahnya. Aku berlindung kepadaMu dari kejahatan malam ini dan kejahatan sesudahnya. Wahai Rabbku, aku berlindung kepadaMu dari kemalasan dan kejelekan di hari tua. Wahai Rabbku, aku berlindung kepada-Mu dari siksaan di neraka dan siksaan di kubur.” ",
            "Faedah: \n" +
                    "Meminta pada Allah kebaikan di malam ini dan kebaikan sesudahnya, juga agar terhindar dari kejelekan di malam ini dan kejelekan sesudahnya. Di dalamnya berisi pula permintaan agar terhindar dari rasa malas padahal mampu untuk beramal, juga agar terhindar dari kejelekan di masa tua. Di dalamnya juga berisi permintaan agar terselamatkan dari siksa kubur dan siksa neraka yang merupakan siksa terberat di hari kiamat kelak.\n" +
                    "(HR. Muslim no. 2723. Lihat keterangan Syarh Hisnul Muslim, hal. 161)"
        )
        dzikir.add(dzikirData)
        dzikirData = Dzikir(
            "[ 4 / 17 ]",
            "Surat An-Naas",
            "( dibaca 3x )",
            "بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ\n" +
                    "قُلْ اَعُوْذُ بِرَبِّ النَّاسِۙ (١) مَلِكِ النَّاسِۙ (٢) اِلٰهِ النَّاسِۙ (٣) مِنْ شَرِّ الْوَسْوَاسِ  الْخَنَّاسِۖ (٤) الَّذِيْ يُوَسْوِسُ فِيْ صُدُوْرِ النَّاسِۙ (٥) مِنَ الْجِنَّةِ وَالنَّاسِ (٦)",
            "Bismillahirrahmannirrahiim\n" +
                    "Qul a'ụżu birabbin-nās(i). Malikin-nās(i). Ilāhin-nās(i). Min syarril-waswāsil-khannās(i). Allażī yuwaswisu fī ṣudụrin-nās(i). Minal-jinnati wan-nās(i).",
            " “Dengan menyebut nama Allah Yang Maha Pengasih lagi Maha Penyayang”\n\n" +
                    "“Katakanlah: Aku berlindung kepada Rabb manusia. Raja manusia. Sembahan manusia, dari kejahatan (bisikan) syaitan yang biasa bersembunyi, yang membisikkan (kejahatan) ke dalam dada manusia, dari jin dan manusia.” \n",
            "“Siapa yang mengucapkannya masing-masing tiga kali ketika pagi dan petang, maka segala sesuatu akan dicukupkan untuknya.”\n" +
                    "(HR. Abu Daud no. 5082, Tirmidzi no. 3575. Al Hafizh Abu Thohir mengatakan bahwa sanad hadits ini hasan)"
        )
        dzikir.add(dzikirData)
        dzikirData = Dzikir(
            "[ 3 / 17 ]",
            "Surat Al-Falaq",
            "( dibaca 3x )",
            "بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ\n" +
                    "قُلْ أَعُوذُ بِرَبِّ الْفَلَقِ (١) مِن شَرِّ مَا خَلَقَ (٢) وَمِن شَرِّ غَاسِقٍ إِذَا وَقَبَ (٣) وَمِن شَرِّ النَّفَّاثَاتِ فِي الْعُقَدِ (٤) وَمِن شَرِّ حَاسِدٍ إِذَا حَسَدَ (٥)",
            "Bismillahirrahmannirrahiim\n" +
                    "Qul a’ụżu birabbil-falaq(i). Min syarri mā khalaq(a). Wa min syarri gāsiqin iżā waqab(a). Wa min syarrin-naffāṡāti fil-‘uqad(i). Wa min syarri ḥāsidin iżā ḥasad(a).",
            "“Dengan menyebut nama Allah Yang Maha Pengasih lagi Maha Penyayang”\n\n" +
                    "“Katakanlah: Aku berlindung kepada Rabb yang menguasai Shubuh, dari kejahatan makhluk-Nya, dan dari kejahatan malam apabila telah gelap gulita, dan dari kejahatan-kejahatan wanita tukang sihir yang menghembus pada buhul-buhul, dan dari kejahatan orang yang dengki apabila ia dengki”. ",
            "“Siapa yang mengucapkannya masing-masing tiga kali ketika pagi dan petang, maka segala sesuatu akan dicukupkan untuknya.”\n" +
                    "(HR. Abu Daud no. 5082, Tirmidzi no. 3575. Al Hafizh Abu Thohir mengatakan bahwa sanad hadits ini hasan)"
        )

        dzikir.add(dzikirData)
        dzikirData = Dzikir(
            "[ 2 / 17 ]",
            "Surat Al-Ikhlas",
            "( dibaca 3x )",
            "بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ\n" +
                    "قُلْ هُوَ اللَّهُ أَحَدٌ (١) اللَّهُ الصَّمَدُ (٢)\n" +
                    " لَمْ يَلِدْ وَلَمْ يُولَدْ (٣) وَلَمْ يَكُن لَّهُ كُفُوًا أَحَدٌ (٤)",
            "Bismillahirrahmannirrahiim\n" +
                    "Qul huwallāhu aḥad(un). Allāhuṣ-ṣamad. Lam yalid wa lam yụlad. Wa lam yakul lahụ kufuwan aḥad.",
            "“Dengan menyebut nama Allah Yang Maha Pengasih lagi Maha Penyayang”\n\n" +
                    "“Katakanlah: Dialah Allah, Yang Maha Esa. Allah adalah ilah yang bergantung kepada-Nya segala urusan. Dia tidak beranak dan tiada pula diperanakkan, dan tidak ada seorang pun yang setara dengan Dia.” ",
            "“Siapa yang mengucapkannya masing-masing tiga kali ketika pagi dan petang, maka segala sesuatu akan dicukupkan untuknya.”\n" +
                    "(HR. Abu Daud no. 5082, Tirmidzi no. 3575. Al Hafizh Abu Thohir mengatakan bahwa sanad hadits ini hasan)"
        )

        dzikir.add(dzikirData)
        dzikirData = Dzikir(
            "[ 1 / 17 ]",
            "Membaca Ayat Kursi",
            "( dibaca 1x )",
            "أَعُوذُ بِاللَّهِ مِنَ الشَّيْطَانِ الرَّجِيمِ\n" +
                    "\n" +
                    "اللَّهُ لاَ إِلَهَ إِلاَّ هُوَ الْحَيُّ الْقَيُّومُ، لاَ تَأْخُذُهُ سِنَةٌ وَلاَ نَوْمٌ، لَهُ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ، مَنْ ذَا الَّذِي يَشْفَعُ عِنْدَهُ إِلاَّ بِإِذْنِهِ، يَعْلَمُ مَا بَيْنَ أَيْدِيهِمْ وَمَا خَلْفَهُمْ، وَلَا يُحِيطُونَ بِشَيْءٍ مِنْ عِلْمِهِ إِلاَّ بِمَا شَاءَ، وَسِعَ كُرْسِيُّهُ السَّمَاوَاتِ وَالْأَرْضَ، وَلَا يَئُودُهُ حِفْظُهُمَا، وَهُوَ الْعَلِيُّ الْعَظِيمُ",
            "",
            "“Aku berlindung kepada Allah dari godaan syaitan yang terkutuk.”\n" +
                    "\n" +
                    "“Allah, tidak ada ilah (yang berhak disembah) melainkan Dia, yang hidup kekal lagi terus menerus mengurus (makhluk-Nya). Dia tidak mengantuk dan tidak tidur. Kepunyaan-Nya apa yang di langit dan di bumi. Tiada yang dapat memberi syafa’at di sisi-Nya tanpa seizin-Nya. Dia mengetahui apa-apa yang di hadapan mereka dan di belakang mereka. Mereka tidak mengetahui apa-apa dari ilmu Allah melainkan apa yang dikehendaki-Nya. Kursi Allah meliputi langit dan bumi. Dia tidak merasa berat memelihara keduanya. Dan Dia Maha Tinggi lagi Maha besar.” (QS. Al Baqarah: 255)",
            "“Siapa yang membacanya ketika petang, maka ia akan dilindungi (oleh Allah dari berbagai gangguan) hingga pagi. Siapa yang membacanya ketika pagi, maka ia akan dilindungi hingga petang.”\n" +
                    "HR. Al Hakim (1: 562). Syaikh Al Albani menshahihkan hadits tersebut dalam Shahih At Targhib wa At Tarhib no. 655."
        )
        dzikir.add(dzikirData)
        dzikirAdapter.notifyDataSetChanged()
    }
}