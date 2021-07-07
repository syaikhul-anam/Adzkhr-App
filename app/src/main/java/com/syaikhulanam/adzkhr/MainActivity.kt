package com.syaikhulanam.adzkhr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iv_morn.setOnClickListener(this)
        iv_even.setOnClickListener(this)
        tv_even.setOnClickListener(this)
        tv_morn.setOnClickListener(this)

        //button share
        btn_share.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id){
            R.id.iv_morn -> {
                val i = Intent(this, DzikirPagi::class.java)
                startActivity(i)
            }
            R.id.iv_even -> {
                val i = Intent(this,DzikirPetang::class.java)
                startActivity(i)
            }
            R.id.tv_morn -> {
                val i = Intent(this,DzikirPagi::class.java)
                startActivity(i)
            }
            R.id.tv_even  ->{
                val i = Intent(this,DzikirPetang::class.java)
                startActivity(i)
            }
            //btn share
            R.id.btn_share ->{
                val shareIntent = Intent()
                shareIntent.action = Intent.ACTION_SEND
                shareIntent.type = "text/plan"
                shareIntent.putExtra(
                    Intent.EXTRA_TEXT,
                    "*Assalamu'alaikum!* \n\nApa kabar sobat Muslim & Muslimah semua.. \n\nSudahkah teman-teman Berdzikir Pagi & Petang hari ini ? \n \n" +
                            "*فَاصْبِرْ إِنَّ وَعْدَ اللَّهِ حَقٌّ وَاسْتَغْفِرْ لِذَنْبِكَ وَسَبِّحْ بِحَمْدِ رَبِّكَ بِالْعَشِيِّ وَالْإِبْكَارِ*\n\n “Maka bersabarlah kamu, karena sesungguhnya janji Allah itu benar, dan mohonlah ampunan untuk dosa mu dan bertasbihlah seraya memuji Tuhanmu pada waktu sore dan pagi,” (QS. Ghafir: 55).\n\n" +
                            "Yuk baca dzikir Pagi & Petang dan lebih tahu keutamaan lainnya dengan mendownload aplikasi *Dzikir Pagi & Petang sesuai Al-qur'an dan Sunnah* disini:\n\n\nhttps://play.google.com/store/apps/details?id=com.syaikhulanam.adzkhr"
                )
                shareIntent.putExtra(Intent.EXTRA_SUBJECT,"Fadhilah Dzikir Pagi dan Petang")
                startActivity(Intent.createChooser(shareIntent,"Share text via"))
            }
        }
    }
}