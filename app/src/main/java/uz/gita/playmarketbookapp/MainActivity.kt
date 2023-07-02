package uz.gita.playmarketbookapp

 import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.lifecycle.lifecycleScope
import cafe.adriel.voyager.navigator.*
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.*
import uz.gita.playmarketbookapp.presentation.homescreen.HomeScreen
import uz.gita.playmarketbookapp.ui.theme.PlayMarketBookAppTheme
import uz.gita.playmarketbookapp.util.navigation.NavigationHandler
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var navigationHandler: NavigationHandler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlayMarketBookAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    Navigator(screen = HomeScreen()) { navigator ->
                        LaunchedEffect(navigator) {
                            navigationHandler.navigationStack.onEach { it.invoke(navigator) }
                                .launchIn(lifecycleScope)
                        }
                        CurrentScreen()
                    }
                }
            }
        }
    }

    /*

    private fun add() {
        myLog("add fun")

        val list = ArrayList<BookData>()

        list.add(
            BookData(
                "Alpomish",
                "alpomish.pdf",
                "https://firebasestorage.googleapis.com/v0/b/book-app-a1e84.appspot.com/o/photos%2Fdin%20tarixi%2010.jpg?alt=media&token=cd8841aa-7d27-4901-a9f5-b228e0bdabac",
                "Xalq ogzaki ijodi",
                "DOSTON GULTOJI\n" +
                        "Xalq dostonlari qadimiyatning buyuk bir ehsoni, o`zlari yaratilgan davr- ning umumiy dunyoqarashi, ayni paytda jonli an'anaviy ijod va ijro sharoitlarida xalq ruhining obyektiv holatini davrlararo ifodalab, mazmun va shakl jihatidan goh kengayib, goh torayib, ajdodlardan avlodlarga og'zaki ravishda yetib kel- gan adabiy yodgorliklar hisoblanadi. Zero, ular xalq milliy tarixining afsonalar qobig'iga o'ralgan qahramonlik voqealarining oʻziga xos badiiy ifodasidir.\n" +
                        "O'zbek xalq qahramonlik dostonlari ham asrlar davomida yaratildi va ular- ning eng yaxshi namunalari xalq san'atkorlari-baxshilar tomonidan jonli epik an'analarda og'zaki ravishda bizgacha olib kelindi. Bunday dostonlarning qa- dimiy ildizlari saklar, massagetlar, sug'diylar, xorazmiylarga mansub urug' va qabilalarning afsona va rivoyatlariga borib taqalsa-da, ularning kattagina qismi o'zbeklarning yagona xalq sifatida shakllanishida asos bo'lgan urug' va qabi- lalarda patriarxal-urug'chilik munosabatlarining yemirilishi va ilk feodal tu- zumning yuzaga kela boshlashi davrlarida yaratilgan. Chunki ular xalqimizning o'zligini anglashining buyuk obidalari, uning yagona xalq sifatida shakllanish va birlashish sari tashlagan ulkan qadamining she'riyat sohasidagi tengsiz na- munalari sifatida yuzaga keldi. Dostonlar gultoji «<Alpomish» xalqimiz yaratgan ana shunday epik she'riyat namunalaridan biri, balki birinchisidir.\n" +
                        "«<Alpomish» dostonida bir oila taqdiri tasviri misolida, taqdir taqozosi bilan boʻlinib ketgan qadimiy bir o'zbek urug'ining qayta birlashishini badiiy aks ettirish orqali millat birligi g'oyalari, uning qahramonona shon-shuhrati, el-yurt farovonligi va oila baxti, vatan ravnaqi uchun kurash baralla kuylangan. Shu ma'noda ushbu doston xalqimizning uyg'oq xotirasidir. Shuning uchun ham bu- gun biz uni mustaqil rivojlanish davrida millat birligi va ma'naviy uyg'onishi, milliy g'urur va o'z-o'zini anglash ramzida aylangan doston sifatida bahola- moqdamiz. O'zbekiston Respublikasining Prezidenti I.A. Karimov «Alpomish>> dostonining 1000 yilligiga bag'ishlangan tantanali marosimda so`zlagan 1999- yil 6-noyabrdagi nutqida alohida ta'kidlaganidek: «Alpomish>> - o`zbekning o'zligini namoyon etadigan, mard va tanti xalqimizning yurak-yuragidan chiq- qan, ota-bobolarimiz avlodlardan avlodlarga o'tkazib kelayotgan qahramonlik qo'shig'idir...\n" +
                        "Aslida, xalqimizning qadimiy va shonli tarixi tuganmas bir doston bo'l- sa, «<Alpomish» ana shu dostonning shohbaytidir. Bu mumtoz asarda tarix to'fonlaridan, hayot-mamot sinovlaridan omon chiqib, o'zligini yo'qotmagan xalqimizning bag'rikenglik, matonat, olijanoblik kabi ezgu fazilatlari o'z ifo- dasini topgan»>!.",
                "alpomish"
            )
        )
        list.add(
            BookData(
                "Temur tuzuklari",
                "temur_tuzuklari.pdf",
                "https://firebasestorage.googleapis.com/v0/b/book-app-a1e84.appspot.com/o/photos%2Ffizika%2010.jpg?alt=media&token=d0f269a2-55e8-4714-bf1a-f2102367883a",
                "Temur tzuzklaridan",
                "МИЛЛИЙ ДАВЛАТЧИЛИГИМИЗ ТАРИХИНИНГ МУМТОЗ НАМУНАСИ\n" +
                        "Бугунги куннинг уткир ва долзарб муаммолари биз- дан замонавий тараққиётнинг асосий тамойилларини ҳар томонлама чуқур таҳлил этиш билан бирга, инсо- ниятнинг яқин-олис тарихидаги бой тажрибасини ҳам теран идрок этишни, шу асосда амалий хулосалар чи- қаришни тақозо этмокда, яъни тарих тажрибаси одам- зод учун тобора муҳим аҳамият касб этмоқда.\n" +
                        "Ҳеч бир муболағасиз айтиш мумкинки, узбек хал- кининг куп асрлик тарихи ҳам ана шундай буюк таж- рибалар манбаидир. Бу тарихнинг энг ёрқин ва шон- ли саҳифаларини ташкил этадиган улуғ аждодлари- миз ҳақида суз борганда, буюк давлат арбоби ва сар- карда, соҳибқирон Амир Темур бобомизнинг улмас номини биринчилар қатори тилга олишимиз табиий, албатта. Мана, қарийб етти асрдирки, бу улуғ зотнинг шону шухрати, хаёти ва фаолиятига булган қизиқиш жаҳоннинг турли мамлакатларида тобора ортиб бор- мокда.\n" +
                        "Шуни таъкидлаш жоизки, улуғ аждодимизнинг узи яшаган замонга, шу даврда Осиё ва Европа қитъала- рида руй берган, жуда катта тарихий аҳамиятга мо- лик узгаришларга олиб келган воқеа-ҳодисаларга ҳал қилувчи таъсири, унинг бу жараёнлардаги роли наин- ки тарихчи ва сиёсатчилар, ҳарбий илм мутахассис- лари, балки бадиий ижод аҳлининг ҳам диққат-эъти- борини ҳали-ҳамон узига жалб этиб келмокда.\n" +
                        "Бу беназир зотнинг қандай миллий замин ва тари- хий шароитда усиб-улғайгани, қай тариқа шундай",
                "Temur_tuzuklari"
            )
        )
        list.add(
            BookData(
                "Ozbek xalq ertaklari eng-uzb",
                "Ozbek_xalq_ertaklari__fayl_english-ertaklar.pdf",
                "https://firebasestorage.googleapis.com/v0/b/book-app-a1e84.appspot.com/o/photos%2Fozbek%20xalq%20ertaklari.jpg?alt=media&token=6409ab61-1ae7-4f95-8622-429879312944",
                "ozbek xalq ogzaki ijodi",
                "BALLI, UMIDA! ‘ .\n" +
                        "The fairy-tales of Uzbek\n" +
                        "Umida Nishonovaning ushbu «O'zbek xalq ertaklari» nomli taijima\n" +
                        "kitobini ko'ríb, rosti, quvondim. Bu kitobda, nafaqat o'zbek ertaklari, balki shu\n" +
                        "ertaklar zamirida yotgan qadimiy urf-odatlarimiz, o'zbekona ma’naviyat\n" +
                        "hamda madaniyatni muallif sof ingliz tilida mohirona ko'rsata oigan. Albatta,\n" +
                        "yurtimizning Umida singan yosh iqtidor egalari keng kitobxonlar onunasiga\n" +
                        "o'z ijod namunalarini taqdim etishga jur’at etayotganligi mustaqilligimiz\n" +
                        "sharofoti, desam. aslo mubolag'a emas.\n" +
                        "Fikrimning isboti sifatida muhtaram yurboshimizning 2012 yilning 10-\n" +
                        "dekabrida qabul qiligan «Chet tillarin i o 'rg an ish tizim ini yanada\n" +
                        "takomillashtirish chora-tadbirlari to'g'risida»gi qarorini keltirishim mumkin.\n" +
                        "Bu tarixiy hujjat talablari asosida umumta'lim maktablari, kasb-hunar\n" +
                        "kollejlari va akademik litsey, oliy o'quv yurtlarida chet tillarini o'qitish,\n" +
                        "o'quvchi hamda talaba yoshlarda kasbiy bilimlami shakllantirishda xorijiy\n" +
                        "mamlakatlar tajribalaridan foydalanish, shuningdek. zamonaviy metodlami\n" +
                        "hayotga tatbiq etish dasturi ishlab chiqildi.\n" +
                        "Umida Nishonova ham juda ko'p yoshlarimiz qatori horijiy tillaiga,\n" +
                        "ayniqsa, ingliz tiliga qiziqqanligi va bu borada ma’lum yutuqlarga\n" +
                        "eríshayotgani quvonarli holdir.\n" +
                        "Endigina 17 yoshni qarshilagan Umidaning ilk kitobi o'zi uchun taijima\n" +
                        "yo'nalishida bir tajriba bo'lsa, ingliz tilini o'rganayotgan bolakaylar uchun\n" +
                        "ajoyib sovg'adir. Bu qizimizning kelajagi porloq bo'lishiga qattiq ishongan\n" +
                        "holda unga qarata «Balli. Umida!», degim keldi.\n",
                "Ozbek_xalq_ertaklari_eng-uzb"
            )
        )
        val firestore = Firebase.firestore
        val collection = firestore.collection("books")

        list.forEach { book ->
            myLog(book.name)
            collection.document(book.name).set(book).addOnSuccessListener {
                Toast.makeText(this, "it.toString()", Toast.LENGTH_SHORT).show()
            }.addOnFailureListener {
                Toast.makeText(this, it.message, Toast.LENGTH_SHORT).show()
            }

        }

    }

    private fun addcategory() {

        val firestore = Firebase.firestore
        val collection = firestore.collection("category")
        val list = ArrayList<String>()
        list.add("Alpomish")
        list.add("Ozbek xalq ertaklari")
        list.add("Ozbek xalq ertaklari eng-uzb")
        list.add("Temur tuzuklari")


        val data = CategoryData(
            name = "Xalq ogzaki ijodi",
            list = list
        )

        collection.document(data.name).set(data)
            .addOnSuccessListener {
                Toast.makeText(this, "succes", Toast.LENGTH_SHORT).show()
            }
            .addOnFailureListener {
                Toast.makeText(this, "fail", Toast.LENGTH_SHORT).show()
            }

    }
*/
}
