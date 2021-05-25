package com.faprayyy.tonton.utils

import com.faprayyy.tonton.BuildConfig
import com.faprayyy.tonton.data.remote.response.DiscoverMovieResponse
import com.faprayyy.tonton.data.remote.response.DiscoverSeriesResponse
import com.faprayyy.tonton.data.remote.response.MovieDetail
import com.faprayyy.tonton.data.remote.response.SeriesDetail
import ir.logicbase.mockfit.Mock
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

//import com.aniketbhoite.assume.annotations.Assume
//import com.aniketbhoite.assume.interceptor.AssumeInterceptor
//import com.faprayyy.tonton.data.remote.response.DiscoverMovieResponse
//import okhttp3.OkHttpClient
//import okhttp3.logging.HttpLoggingInterceptor
//import retrofit2.Retrofit
//import retrofit2.converter.gson.GsonConverterFactory
//import retrofit2.http.GET

interface MockApiService {

    @GET("3/movie/{movie_id}?")
    fun getMovie(
        @Path("movie_id") movie_id: Int,
        @Query("api_key") api_key: String = BuildConfig.THEMOVIEDB_TOKEN
    ): Call<MovieDetail>

    @GET("3/tv/{series_id}?")
    fun getSeries(
        @Path("series_id") series_id: Int,
        @Query("api_key") api_key: String = BuildConfig.THEMOVIEDB_TOKEN
    ): Call<SeriesDetail>


    @Mock(DataDummy.stringListMovieResponse)
    @GET("3/discover/movie")
    fun getDiscoverMovies(
        @Query("api_key") api_key: String = BuildConfig.THEMOVIEDB_TOKEN
    ): Call<DiscoverMovieResponse>

    @GET("3/discover/tv")
    fun getDiscoverSeries(
        @Query("api_key") api_key: String = BuildConfig.THEMOVIEDB_TOKEN
    ): Call<DiscoverSeriesResponse>

//    @Assume(
//        responseCode = 200,
//        response = "{\"page\":1,\"results\":[" +
//                "{\"adult\":false,\"backdrop_path\":\"/fPGeS6jgdLovQAKunNHX8l0avCy.jpg\",\"genre_ids\":[28,12,53,10752],\"id\":567189,\"original_language\":\"en\",\"original_title\":\"Tom Clancy's Without Remorse\",\"overview\":\"An elite Navy SEAL uncovers an international conspiracy while seeking justice for the murder of his pregnant wife.\",\"popularity\":3143.69,\"poster_path\":\"/rEm96ib0sPiZBADNKBHKBv5bve9.jpg\",\"release_date\":\"2021-04-29\",\"title\":\"Tom Clancy's Without Remorse\",\"video\":false,\"vote_average\":7.3,\"vote_count\":876}," +
//                "{\"adult\":false,\"backdrop_path\":\"/6ELCZlTA5lGUops70hKdB83WJxH.jpg\",\"genre_ids\":[28,14,12],\"id\":460465,\"original_language\":\"en\",\"original_title\":\"Mortal Kombat\",\"overview\":\"Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.\",\"popularity\":2681.013,\"poster_path\":\"/nkayOAUBUu4mMvyNf9iHSUiPjF1.jpg\",\"release_date\":\"2021-04-07\",\"title\":\"Mortal Kombat\",\"video\":false,\"vote_average\":7.6,\"vote_count\":2482}," +
//                "{\"adult\":false,\"backdrop_path\":\"/6zbKgwgaaCyyBXE4Sun4oWQfQmi.jpg\",\"genre_ids\":[28,53,80,35],\"id\":615457,\"original_language\":\"en\",\"original_title\":\"Nobody\",\"overview\":\"Hutch Mansell, a suburban dad, overlooked husband, nothing neighbor — a \\\"nobody.\\\" When two thieves break into his home one night, Hutch's unknown long-simmering rage is ignited and propels him on a brutal path that will uncover dark secrets he fought to leave behind.\",\"popularity\":1602.076,\"poster_path\":\"/oBgWY00bEFeZ9N25wWVyuQddbAo.jpg\",\"release_date\":\"2021-03-26\",\"title\":\"Nobody\",\"video\":false,\"vote_average\":8.4,\"vote_count\":1483}," +
//                "{\"adult\":false,\"backdrop_path\":\"/inJjDhCjfhh3RtrJWBmmDqeuSYC.jpg\",\"genre_ids\":[878,28,18],\"id\":399566,\"original_language\":\"en\",\"original_title\":\"Godzilla vs. Kong\",\"overview\":\"In a time when monsters walk the Earth, humanity’s fight for its future sets Godzilla and Kong on a collision course that will see the two most powerful forces of nature on the planet collide in a spectacular battle for the ages.\",\"popularity\":1658.18,\"poster_path\":\"/pgqgaUx1cJb5oZQQ5v0tNARCeBp.jpg\",\"release_date\":\"2021-03-24\",\"title\":\"Godzilla vs. Kong\",\"video\":false,\"vote_average\":8.1,\"vote_count\":5505}," +
//                "{\"adult\":false,\"backdrop_path\":\"/n2y7T8wJVjJ8yLhQXQgNCpsC3ga.jpg\",\"genre_ids\":[10751,16,35],\"id\":811367,\"original_language\":\"en\",\"original_title\":\"22 vs. Earth\",\"overview\":\"Set before the events of ‘Soul’, 22 refuses to go to Earth, enlisting a gang of 5 new souls in attempt of rebellion. However, 22’s subversive plot leads to a surprising revelation about the meaning of life.\",\"popularity\":1299.426,\"poster_path\":\"/32vLDKSzcCMh55zqqaSqqUA8naz.jpg\",\"release_date\":\"2021-04-30\",\"title\":\"22 vs. Earth\",\"video\":false,\"vote_average\":7.2,\"vote_count\":72}," +
//                "{\"adult\":false,\"backdrop_path\":\"/lkInRiMtLgl9u9xE0By5hqf66K8.jpg\",\"genre_ids\":[27],\"id\":632357,\"original_language\":\"en\",\"original_title\":\"The Unholy\",\"overview\":\"Alice, a young hearing-impaired girl who, after a supposed visitation from the Virgin Mary, is inexplicably able to hear, speak and heal the sick. As word spreads and people from near and far flock to witness her miracles, a disgraced journalist hoping to revive his career visits the small New England town to investigate. When terrifying events begin to happen all around, he starts to question if these phenomena are the works of the Virgin Mary or something much more sinister.\",\"popularity\":1165.637,\"poster_path\":\"/b4gYVcl8pParX8AjkN90iQrWrWO.jpg\",\"release_date\":\"2021-03-31\",\"title\":\"The Unholy\",\"video\":false,\"vote_average\":5.6,\"vote_count\":86}," +
//                "{\"adult\":false,\"backdrop_path\":\"/pcDc2WJAYGJTTvRSEIpRZwM3Ola.jpg\",\"genre_ids\":[28,12,14,878],\"id\":791373,\"original_language\":\"en\",\"original_title\":\"Zack Snyder's Justice League\",\"overview\":\"Determined to ensure Superman's ultimate sacrifice was not in vain, Bruce Wayne aligns forces with Diana Prince with plans to recruit a team of metahumans to protect the world from an approaching threat of catastrophic proportions.\",\"popularity\":1045.51,\"poster_path\":\"/tnAuB8q5vv7Ax9UAEje5Xi4BXik.jpg\",\"release_date\":\"2021-03-18\",\"title\":\"Zack Snyder's Justice League\",\"video\":false,\"vote_average\":8.5,\"vote_count\":5445}," +
//                "{\"adult\":false,\"backdrop_path\":\"/xPpXYnCWfjkt3zzE0dpCNME1pXF.jpg\",\"genre_ids\":[16,28,12,14,18],\"id\":635302,\"original_language\":\"ja\",\"original_title\":\"劇場版「鬼滅の刃」無限列車編\",\"overview\":\"Tanjirō Kamado, joined with Inosuke Hashibira, a boy raised by boars who wears a boar's head, and Zenitsu Agatsuma, a scared boy who reveals his true power when he sleeps, boards the Infinity Train on a new mission with the Fire Hashira, Kyōjurō Rengoku, to defeat a demon who has been tormenting the people and killing the demon slayers who oppose it!\",\"popularity\":1058.705,\"poster_path\":\"/h8Rb9gBr48ODIwYUttZNYeMWeUU.jpg\",\"release_date\":\"2020-10-16\",\"title\":\"Demon Slayer -Kimetsu no Yaiba- The Movie: Mugen Train\",\"video\":false,\"vote_average\":8.4,\"vote_count\":948}," +
//                "{\"adult\":false,\"backdrop_path\":\"/lHhc60NXYzswU4TvKSo45nY9Jzs.jpg\",\"genre_ids\":[16,35,10751,12],\"id\":726684,\"original_language\":\"fr\",\"original_title\":\"Miraculous World Shanghai, la légende de Ladydragon\",\"overview\":\"To join Adrien in Shanghai, Marinette is going to visit her uncle Wang who is celebrating his anniversary. But, as soon as she arrives in China, her purse gets stolen with Tikki inside, whom she needs to secretly transform into Ladybug! Without money and alone in the immense city, Marinette accepts the help of a young and resourceful girl, Fei. The two girls will ally and discover the existence of a new magical jewel, the Prodigious. Hawk Moth, also present in Shanghai, seeks to finding it since a long time...\",\"popularity\":1044.088,\"poster_path\":\"/msI5a9TPnepx47JUb2vl88hb80R.jpg\",\"release_date\":\"2021-04-04\",\"title\":\"Miraculous World: Shanghai – The Legend of Ladydragon\",\"video\":false,\"vote_average\":7.9,\"vote_count\":305}," +
//                "{\"adult\":false,\"backdrop_path\":\"/7prYzufdIOy1KCTZKVWpjBFqqNr.jpg\",\"genre_ids\":[16,12,14,10751,28],\"id\":527774,\"original_language\":\"en\",\"original_title\":\"Raya and the Last Dragon\",\"overview\":\"Long ago, in the fantasy world of Kumandra, humans and dragons lived together in harmony. But when an evil force threatened the land, the dragons sacrificed themselves to save humanity. Now, 500 years later, that same evil has returned and it’s up to a lone warrior, Raya, to track down the legendary last dragon to restore the fractured land and its divided people.\",\"popularity\":968.182,\"poster_path\":\"/lPsD10PP4rgUGiGR4CCXA6iY0QQ.jpg\",\"release_date\":\"2021-03-03\",\"title\":\"Raya and the Last Dragon\",\"video\":false,\"vote_average\":8.2,\"vote_count\":2807}," +
//                "{\"adult\":false,\"backdrop_path\":\"/5Zv5KmgZzdIvXz2KC3n0MyecSNL.jpg\",\"genre_ids\":[28,53,80],\"id\":634528,\"original_language\":\"en\",\"original_title\":\"The Marksman\",\"overview\":\"Jim Hanson’s quiet life is suddenly disturbed by two people crossing the US/Mexico border – a woman and her young son – desperate to flee a Mexican cartel. After a shootout leaves the mother dead, Jim becomes the boy’s reluctant defender. He embraces his role as Miguel’s protector and will stop at nothing to get him to safety, as they go on the run from the relentless assassins.\",\"popularity\":779.143,\"poster_path\":\"/6vcDalR50RWa309vBH1NLmG2rjQ.jpg\",\"release_date\":\"2021-01-15\",\"title\":\"The Marksman\",\"video\":false,\"vote_average\":7.4,\"vote_count\":458}," +
//                "{\"adult\":false,\"backdrop_path\":\"/jFINtstDUh0vHOGImpMAmLrPcXy.jpg\",\"genre_ids\":[28,27,35],\"id\":643586,\"original_language\":\"en\",\"original_title\":\"Willy's Wonderland\",\"overview\":\"When his car breaks down, a quiet loner agrees to clean an abandoned family fun center in exchange for repairs. He soon finds himself waging war against possessed animatronic mascots while trapped inside Willy's Wonderland.\",\"popularity\":871.168,\"poster_path\":\"/keEnkeAvifw8NSEC4f6WsqeLJgF.jpg\",\"release_date\":\"2021-02-12\",\"title\":\"Willy's Wonderland\",\"video\":false,\"vote_average\":6.8,\"vote_count\":210}," +
//                "{\"adult\":false,\"backdrop_path\":\"/c7dFSqZQYqNNJVpacpIGZe3gkLW.jpg\",\"genre_ids\":[16,35,14],\"id\":813258,\"original_language\":\"en\",\"original_title\":\"Monster Pets: A Hotel Transylvania Short\",\"overview\":\"Drac tries out some new monster pets to help occupy Tinkles for playtime.\",\"popularity\":927.399,\"poster_path\":\"/dkokENeY5Ka30BFgWAqk14mbnGs.jpg\",\"release_date\":\"2021-04-02\",\"title\":\"Monster Pets: A Hotel Transylvania Short\",\"video\":false,\"vote_average\":7.7,\"vote_count\":108}," +
//                "{\"adult\":false,\"backdrop_path\":\"/z7HLq35df6ZpRxdMAE0qE3Ge4SJ.jpg\",\"genre_ids\":[28,12,35,14],\"id\":615678,\"original_language\":\"en\",\"original_title\":\"Thunder Force\",\"overview\":\"In a world where supervillains are commonplace, two estranged childhood best friends reunite after one devises a treatment that gives them powers to protect their city.\",\"popularity\":710.121,\"poster_path\":\"/3mKMWP5OokB7QpcOMA1yl8BXFAF.jpg\",\"release_date\":\"2021-04-09\",\"title\":\"Thunder Force\",\"video\":false,\"vote_average\":5.8,\"vote_count\":569}," +
//                "{\"adult\":false,\"backdrop_path\":\"/mYM8x2Atv4MaLulaV0KVJWI1Djv.jpg\",\"genre_ids\":[28,80,53],\"id\":804435,\"original_language\":\"en\",\"original_title\":\"Vanquish\",\"overview\":\"Victoria is a young mother trying to put her dark past as a Russian drug courier behind her, but retired cop Damon forces Victoria to do his bidding by holding her daughter hostage. Now, Victoria must use guns, guts and a motorcycle to take out a series of violent gangsters—or she may never see her child again.\",\"popularity\":885.067,\"poster_path\":\"/AoWY1gkcNzabh229Icboa1Ff0BM.jpg\",\"release_date\":\"2021-04-16\",\"title\":\"Vanquish\",\"video\":false,\"vote_average\":6.4,\"vote_count\":86}," +
//                "{\"adult\":false,\"backdrop_path\":\"/ovggmAOu1IbPGTQE8lg4lBasNC7.jpg\",\"genre_ids\":[878,28,12,53],\"id\":412656,\"original_language\":\"en\",\"original_title\":\"Chaos Walking\",\"overview\":\"Two unlikely companions embark on a perilous adventure through the badlands of an unexplored planet as they try to escape a dangerous and disorienting reality, where all inner thoughts are seen and heard by everyone.\",\"popularity\":656.066,\"poster_path\":\"/9kg73Mg8WJKlB9Y2SAJzeDKAnuB.jpg\",\"release_date\":\"2021-02-24\",\"title\":\"Chaos Walking\",\"video\":false,\"vote_average\":7.2,\"vote_count\":578}," +
//                "{\"adult\":false,\"backdrop_path\":\"/z8TvnEVRenMSTemxYZwLGqFofgF.jpg\",\"genre_ids\":[14,28,12],\"id\":458576,\"original_language\":\"en\",\"original_title\":\"Monster Hunter\",\"overview\":\"A portal transports Cpt. Artemis and an elite unit of soldiers to a strange world where powerful monsters rule with deadly ferocity. Faced with relentless danger, the team encounters a mysterious hunter who may be their only hope to find a way home.\",\"popularity\":578.984,\"poster_path\":\"/1UCOF11QCw8kcqvce8LKOO6pimh.jpg\",\"release_date\":\"2020-12-03\",\"title\":\"Monster Hunter\",\"video\":false,\"vote_average\":7.1,\"vote_count\":1640}," +
//                "{\"adult\":false,\"backdrop_path\":\"/eTgQlyIQH0nA5BsmYpvCzSPAorg.jpg\",\"genre_ids\":[53,28,18],\"id\":793723,\"original_language\":\"fr\",\"original_title\":\"Sentinelle\",\"overview\":\"Transferred home after a traumatizing combat mission, a highly trained French soldier uses her lethal skills to hunt down the man who hurt her sister.\",\"popularity\":439.55,\"poster_path\":\"/AmUGn1rJ9XDDP6DYn9OA2uV8MIg.jpg\",\"release_date\":\"2021-03-05\",\"title\":\"Sentinelle\",\"video\":false,\"vote_average\":5.9,\"vote_count\":384}," +
//                "{\"adult\":false,\"backdrop_path\":\"/h9DIlghaiTxbQbt1FIwKNbQvEL.jpg\",\"genre_ids\":[28,12,53],\"id\":581387,\"original_language\":\"ko\",\"original_title\":\"백두산\",\"overview\":\"A group of unlikely heroes from across the Korean peninsula try to save the day after a volcano erupts on the mythical and majestic Baekdu Mountain.\",\"popularity\":486.039,\"poster_path\":\"/zoeKREZ2IdAUnXISYCS0E6H5BVh.jpg\",\"release_date\":\"2019-12-19\",\"title\":\"Ashfall\",\"video\":false,\"vote_average\":6.4,\"vote_count\":256}," +
//                "{\"adult\":false,\"backdrop_path\":\"/czHYg6LQ5926OL8wj5kC09pNR12.jpg\",\"genre_ids\":[27,35],\"id\":647302,\"original_language\":\"en\",\"original_title\":\"Benny Loves You\",\"overview\":\"Jack, a man desperate to improve his life throws away his beloved childhood plush, Benny. It’s a move that has disastrous consequences when Benny springs to life with deadly intentions!\",\"popularity\":488.11,\"poster_path\":\"/3RE9DNBCvuso5OPZPg71ryntNjx.jpg\",\"release_date\":\"2021-05-07\",\"title\":\"Benny Loves You\",\"video\":false,\"vote_average\":6.3,\"vote_count\":12}],\"total_pages\":500,\"total_results\":10000}"
//    )
//    @GET("3/discover/movie")
//    fun getDiscoverMovies(): DiscoverMovieResponse
//
//    companion object {
//        const val base_url = "https://api.themoviedb.org/"
//        operator fun invoke(): MockApiService {
//
//            val logging = HttpLoggingInterceptor()
//            logging.setLevel(HttpLoggingInterceptor.Level.BODY)
//
//            val okHttpClient = OkHttpClient.Builder()
//                .addInterceptor(AssumeInterceptor(base_url))
//                .addInterceptor(logging)
//                .build()
//
//            return Retrofit.Builder()
//                .baseUrl("https://newsapi.org/")
//                .client(okHttpClient)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build()
//                .create(MockApiService::class.java)
//        }
//    }
//
}