package com.xworkz.entity.springconfi;


	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.ComponentScan;
	import org.springframework.context.annotation.Configuration;

import com.xworkz.entity.primary.Door;
import com.xworkz.entity.primary.Fan;
import com.xworkz.entity.primary.Human;
import com.xworkz.entity.primary.Light;
import com.xworkz.entity.primary.Wire;



	@Configuration
	@ComponentScan("com.xworkz")
	public class SpringConfiguration {
		
		private static final int entity = 78000;
		private static final int value = 48000;
		public SpringConfiguration() {
			System.out.println("running spring configuration");

		}

		
		public Light light() {
			Light entity = new Light();
			System.out.println("Light method is running");
			return entity;
		}

		
		public Human human() {
			Human entity = new Human();
			System.out.println("Human method is running");
			return entity;
		}
		
		
		public Fan fan() {
			Fan entity = new Fan();
			System.out.println("Fan method is running");
			return entity;
		}

		public Wire wire() {
			Wire entity = new Wire();
			System.out.println("Wire method is running");
			return entity;
		}
		
		@Bean
		public Door door() {
			Door entity = new Door ();
			System.out.println("Door method is running");
			return entity;
		}
		
		
		@Bean
		public String name() {
			String entity = new String ();
			System.out.println("prashantha");
			return entity;
		}

		@Bean
		public String name1() {
			String entity = new String ();
			System.out.println("navya");
			return entity;
		}

		@Bean
		public String name2() {
			return "harish";
		}

		@Bean
		public String name3() {
			return "basav";
		}

		@Bean
		public String name4() {
			return "Sharathkumar";
		}

		@Bean
		public String name5() {
			return "shan";
		}

		@Bean
		public String name6() {
			return "mali";
		}

		@Bean
		public String name7() {
		return "chandra";
		}

		@Bean
		public String name8() {
			return "sahil";
		}

		@Bean
		public String name9() {
			return "manju";
		}
		
		@Bean
		public String ca() {
		return "maruti 800";
		}

		@Bean
		public String ca1() {
		return "zen";
		}

		@Bean
		public String ca2() {
			return "thor";
		}

		@Bean
		public String ca3() {
		return "alto";
		}

		@Bean
		public String ca4() {
			return "kia";
		}

		@Bean
		public String ca5() {
			
			return "duster";
		}

		@Bean
		public String ca6() {
			String string = new String();
			return "enova";
		}

		@Bean
		public String ca7() {
			String string = new String();
			return "scorpio";
		}

		@Bean
		public String ca8() {
			String string = new String();
			return "tuv 300";
		}

		@Bean
		public String ca9() {
			String string = new String();
			return "waganor";
		}

		@Bean
		public String ca10() {
			String string = new String();
			return "Omini";
		}

		@Bean
		public String ca11() {
			String string = new String();
			return "ford endeavour";
		}

		@Bean
		public String ca12() {
			String string = new String();
			return "benz";
		}

		@Bean
		public String ca13() {
			String string = new String();
			return "skoda rapid";
		}

		@Bean
		public String ca14() {
			String string = new String();
			return "ertiga";
		}

		@Bean
		public String ca15() {
			String string = new String();
			return "etois";
		}

		@Bean
		public String ca16() {
			String string = new String();
			return "lamborgini";
		}

		@Bean
		public String ca17() {
			String string = new String();
			return "mustang";
		}

		@Bean
		public String ca18() {
			String string = new String();
			return "ferari";
		}

		@Bean
		public String ca19() {
			String string = new String();
			return "bugati";
		}

		@Bean
		public String ca20() {
			String string = new String();
			return "audi";
		}

		@Bean
		public String ca21() {
			String string = new String();
			return "nano";
		}

		@Bean
		public String ca22() {
			String string = new String();
			return "nano";
		}

		@Bean
		public String ca23() {
			String string = new String();
			return "i20 aasta";
		}

		@Bean
		public String ca24() {
			String string = new String();
			return "i20 sports";
		}

		@Bean
		public String ca25() {
			String string = new String();
			return "honda city";
		}

		@Bean
		public String ca26() {
			String string = new String();
			return "honda amaze";
		}

		@Bean
		public String ca27() {
			String string = new String();
			return "ambasador";
		}

		@Bean
		public String ca28() {
			String string = new String();
			return "feat";
		}

		@Bean
		public String ca29() {
			String string = new String();
			return "cruzer";
		}

		@Bean
		public String ca30() {
			String string = new String();
			return "thar";
		}

		@Bean
		public String ca31() {
			String string = new String();
			return "honda fit";
		}

		@Bean
		public String ca32() {
			String string = new String();
			return "volkswagon";
		}

		@Bean
		public String ca33() {
			String string = new String();
			return "toyota";
		}

		@Bean
		public String ca34() {
			String string = new String();
			return "ferari testarossa";
		}

		@Bean
		public String ca35() {
			String string = new String();
			return "tavera";
		}

		@Bean
		public String ca36() {
			String string = new String();
			return "indica";
		}

		@Bean
		public String ca37() {
			String string = new String();
			return "indica v2";
		}

		@Bean
		public String ca38() {
			String string = new String();
			return "Breeza";
		}

		@Bean
		public String ca39() {
			String string = new String();
			return "porche";
		}

		@Bean
		public String ca40() {
			String string = new String();
			return "polo";
		}

		@Bean
		public String ca41() {
			String string = new String();
			return "fortuner";
		}

		@Bean
		public String ca42() {
			String string = new String();
			return "indigo";
		}

		@Bean
		public String ca43() {
			String string = new String();
			return "lexus";
		}

		@Bean
		public String ca44() {
			String string = new String();
			return "swift";
		}

		@Bean
		public String ca45() {
			String string = new String();
			return "swift";
		}

		@Bean
		public String ca46() {
			String string = new String();
			return "echo";
		}

		@Bean
		public String ca47() {
			String string = new String();
			return "r8";
		}

		@Bean
		public String ca48() {
			String string = new String();
			return "MG ";
		}

		@Bean
		public String ca49() {
			String string = new String();
			return "canival";
		}

		@Bean
		public String ca50() {
			String string = new String();
			return "caen";
		}


		@Bean
		public int bike1() {
			return 56000;
		}

		@Bean
		public int bike2() {
			return 57000;
		}

		@Bean
		public int bike3() {
			return 58000;
		}
		
		@Bean
		public int bike4() {
			return 56000;
		}
		
		@Bean
		public int bike5() {
			return 59000;
		}
		
		@Bean
		public int bike6() {
			return 60000;
		}
		
		@Bean
		public int bike7() {
			return 61000;
		}
		
		@Bean
		public int bike8() {
			return 61000;
		}
		@Bean
		public int bike9() {
			return 56000;
		}
		@Bean
		public int bike10() {
			return entity;
		}

		@Bean
		public int bike11() {
			return entity;
		}
		@Bean
		public int bike12() {
			return entity;
		}
		@Bean
		public int bike13() {
			return 62000;
		}
		@Bean
		public int bike14() {
			return 59000;
		}
		@Bean
		public int bike15() {
			return 67000;
		}
		@Bean
		public int bike16() {
			return 89000;
		}
		@Bean
		public int bike17() {
			return 200000;
		}
		@Bean
		public int bike18() {
			return 56000;
		}
		@Bean
		public int bike19() {
			return 89000;
		}
		@Bean
		public int bike20() {
			return value;
		}
		@Bean
		public int bike21() {
			return 88000;
		}
		@Bean
		public int bike22() {
			return 90000;
		}
		@Bean
		public int bike23() {
			return 88000;
		}
		@Bean
		public int bike24() {
			return 97000;
		}
		@Bean
		public int bike25() {
			return 78000;
		}
		@Bean
		public int bike26() {
			return 84000;
		}
		@Bean
		public int bike27() {
			return 86000;
		}
		@Bean
		public int bike28() {
			return 888000;
		}
		@Bean
		public int bike29() {
			return 56000;
		}
		@Bean
		public int bike30() {
			return 890000;
		}
		@Bean
		public boolean food1() {
			return true;
		}
		@Bean
		public boolean food2() {
			return true;
		}
		@Bean
		public boolean food3() {
			return false;
		}
		@Bean
		public boolean food4() {
			return true;
		}
		@Bean
		public boolean food5() {
			return true;
		}
		@Bean
		public boolean food6() {
			return true;
		}
		@Bean
		public boolean food7() {
			return false;
		}
		@Bean
		public boolean food8() {
			return false;
		}
		@Bean
		public boolean food9() {
			return true;
		}
		@Bean
		public boolean food10() {
			return false;
		}
		@Bean
		public boolean food11() {
			return false;
		}
		@Bean
		public boolean food12() {
			return true;
		}
		@Bean
		public boolean food13() {
			return false;
		}
		@Bean
		public boolean food14() {
			return false;
		}
		@Bean
		public boolean food15() {
			return true;
		}
		@Bean
		public boolean food16() {
			return false;
		}
		@Bean
		public boolean food17() {
			return true;
		}
		@Bean
		public boolean food18() {
			return false;
		}
		@Bean
		public boolean food19() {
			return false;
		}
		@Bean
		public boolean food20() {
			return true;
		}
		@Bean
		public boolean food21() {
			return false;
		}
		@Bean
		public boolean food22() {
			return true;
		}
		@Bean
		public boolean food23() {
			return false;
		}
		@Bean
		public boolean food24() {
			return false;
		}
		@Bean
		public boolean food25() {
			return true;
		}
		@Bean
		public float distance1() {
			return 123.1f;
		}
		@Bean
		public float distance2() {
			return 124.1f;
		}
		@Bean
		public float distance3() {
			return 125.1f;
		}
		@Bean
		public float distance5() {
			return 126.1f;
		}
		@Bean
		public float distance6() {
			return 126.1f;
		}
		@Bean
		public float distance7() {
			return 126.1f;
		}
		@Bean
		public float distance8() {
			return 126.1f;
		}
		@Bean
		public float distance9() {
			return 126.1f;
		}
		@Bean
		public float distance10() {
			return 126.1f;
		}
		@Bean
		public float distance11() {
			return 126.1f;
		}
		@Bean
		public float distance12() {
			return 126.1f;
		}
		@Bean
		public float distance13() {
			return 126.1f;
		}
		@Bean
		public float distance14() {
			return 126.1f;
		}
		@Bean
		public float distance15() {
			return 1796.1f;
		}
		@Bean
		public float distance16() {
			return 17926.1f;
		}
		@Bean
		public float distance17() {
			return 12706.1f;
		}
		@Bean
		public float distance18() {
			return 1279076.1f;
		}
		@Bean
		public float distance19() {
			return 1206.1f;
		}
		@Bean
		public float distance20() {
			return 12586.1f;
		}
		@Bean
		public float distance4() {
			return 126789.1f;
		}
		@Bean
		public float distance21() {
			return 1224536.1f;
		}
		@Bean
		public float distance22() {
			return 12706.1f;
		}
		@Bean
		public float distance23() {
			return 1806.1f;
		}
		@Bean
		public float distance24() {
			return 70926.1f;
		}
		@Bean
		public float distance25() {
			return 7926.1f;
		}
		@Bean
		public float distance26() {
			return 13686.1f;
		}
		@Bean
		public float distance27() {
			return 2526.1f;
		}
		@Bean
		public float distance28() {
			return 1586.1f;
		}
		@Bean
		public float distance29() {
			return 12478.1f;
		}
		@Bean
		public float distance30() {
			return 2305.1f;
		}
		@Bean
		public float distance31() {
			return 13686.1f;
		}
		@Bean
		public float distance32() {
			return 2524526.1f;
		}
		@Bean
		public float distance33() {
			return 15386.1f;
		}
		@Bean
		public float distance34() {
			return 12098.1f;
		}
		@Bean
		public float distance35() {
			return 26095.1f;
		}
		@Bean
		public float distance36() {
			return 13686.1f;
		}
		@Bean
		public float distance37() {
			return 2526.1f;
		}
		@Bean
		public float distance38() {
			return 1586.1f;
		}
		@Bean
		public float distance39() {
			return 1278.1f;
		}
		@Bean
		public float distance40() {
			return 239.1f;
		}
		@Bean
		public float distance41() {
			return 13686.1f;
		}
		@Bean
		public float distance42() {
			return 2526.1f;
		}
		@Bean
		public float distance43() {
			return 1586.1f;
		}
		@Bean
		public float distance44() {
			return 12780.1f;
		}
		@Bean
		public float distance45() {
			return 23607.1f;
		}
		@Bean
		public float distance46() {
			return 13686.1f;
		}
		@Bean
		public float distance47() {
			return 2526.1f;
		}
		@Bean
		public float distance48() {
			return 15836.1f;
		}
		@Bean
		public float distance49() {
			return 127338.1f;
		}
		@Bean
		public float distance50() {
			return 2395775.1f;
		}
		@Bean
		public double price1() {
			return 2577.6969;
		}
		@Bean
		public double price2() {
			return 25577.6969;
		}
		@Bean
		public double price3() {
			return 32577.6969;
		}
		@Bean
		public double price4() {
			return 25477.6969;
		}
		@Bean
		public double price5() {
			return 25797.6969;
		}
		@Bean
		public double price6() {
			return 25757.6969;
		}
		@Bean
		public double price7() {
			return 253477.6969;
		}
		@Bean
		public double price8() {
			return 257357.6969;
		}
		@Bean
		public double price9() {
			return 2577334.6969;
		}
		@Bean
		public double price10() {
			return 25477.6969;
		}
		@Bean
		public double price11() {
			return 25777.6969;
		}
		@Bean
		public double price12() {
			return 25377.6969;
		}
		@Bean
		public double price13() {
			return 25797.6969;
		}
		@Bean
		public double price14() {
			return 25767.6969;
		}
		@Bean
		public double price15() {
			return 27577.6969;
		}
		@Bean
		public double price16() {
			return 12577.6969;
		}
		@Bean
		public double price17() {
			return 22577.6969;
		}
		@Bean
		public double price18() {
			return 25367.6969;
		}
		@Bean
		public double price19() {
			return 2577660.6969;
		}
		@Bean
		public double price20() {
			return 25770.6969;
		}
		@Bean
		public double price21() {
			return 12577.6969;
		}
		@Bean
		public double price22() {
			return 22577.6969;
		}
		@Bean
		public double price23() {
			return 25367.6969;
		}
		@Bean
		public double price24() {
			return 2577660.6969;
		}
		@Bean
		public double price25() {
			return 25770.6969;
		}
		
		@Bean
		public double price26() {
			return 12577.6969;
		}
		@Bean
		public double price27() {
			return 22577.6969;
		}
		@Bean
		public double price28() {
			return 25367.6969;
		}
		@Bean
		public double price29() {
			return 2577660.6969;
		}
		@Bean
		public double price30() {
			return 25770.6969;
		}
		
		@Bean
		public double price31() {
			return 12577.6969;
		}
		@Bean
		public double price32() {
			return 22577.6969;
		}
		@Bean
		public double price33() {
			return 25367.6969;
		}
		@Bean
		public double price34() {
			return 2577660.6969;
		}
		@Bean
		public double price35() {
			return 25770.6969;
		}
		
		@Bean
		public double price36() {
			return 12577.6969;
		}
		@Bean
		public double price37() {
			return 22577.6969;
		}
		@Bean
		public double price38() {
			return 25367.6969;
		}
		@Bean
		public double price39() {
			return 2577660.6969;
		}
		@Bean
		public double price40() {
			return 25770.6969;
		}
		
		@Bean
		public boolean kilometers1() {
		return true;
		}
		@Bean
		public boolean kilometers2() {
		return true;
		}
		@Bean
		public boolean kilometers3() {
		return true;
		}
		@Bean
		public boolean kilometers4() {
		return false;
		}
		@Bean
		public boolean kilometers5() {
		return false;
		}
		@Bean
		public boolean kilometers6() {
		return true;
		}
		@Bean
		public boolean kilometers7() {
		return true;
		}
		@Bean
		public boolean kilometers8() {
		return true;
		}
		@Bean
		public boolean kilometers9() {
		return false;
		}
		@Bean
		public boolean kilometers10() {
		return true;
		}
		@Bean
		public boolean kilometers11() {
		return true;
		}
		@Bean
		public boolean kilometers12() {
		return false;
		}
		@Bean
		public boolean kilometers13() {
		return true;
		}
		@Bean
		public boolean kilometers14() {
		return true;
		}
		@Bean
		public boolean kilometers15() {
		return false;
		}
		@Bean
		public boolean kilometers16() {
		return true;
		}
		@Bean
		public boolean kilometers17() {
		return false;
		}
		@Bean
		public boolean kilometers18() {
		return true;
		}
		@Bean
		public boolean kilometers19() {
		return true;
		}
		@Bean
		public boolean kilometers20() {
		return true;
		}
		@Bean
		public boolean kilometers21() {
		return false;
		}
		@Bean
		public boolean kilometers22() {
		return true;
		}
		@Bean
		public boolean kilometers23() {
		return false;
		}
		@Bean
		public boolean kilometers24() {
		return true;
		}
		@Bean
		public boolean kilometers25() {
		return true;
		}
		@Bean
		public boolean kilometers26() {
		return true;
		}
		@Bean
		public boolean kilometers27() {
		return false;
		}
		@Bean
		public boolean kilometers28() {
		return true;
		}
		@Bean
		public boolean kilometers29() {
		return false;
		}
		@Bean
		public boolean kilometers30() {
		return true;
		}
		@Bean
		public boolean kilometers31() {
		return true;
		}
		@Bean
		public boolean kilometers32() {
		return true;
		}
		@Bean
		public boolean kilometers33() {
		return false;
		}
		@Bean
		public boolean kilometers34() {
		return true;
		}
		@Bean
		public boolean kilometers35() {
		return false;
		}
		@Bean
		public boolean kilometers36() {
		return true;
		}
		@Bean
		public boolean kilometers37() {
		return true;
		}
		@Bean
		public boolean kilometers38() {
		return true;
		}
		@Bean
		public boolean kilometers39() {
		return false;
		}
		@Bean
		public boolean kilometers40() {
		return true;
		}
		@Bean
		public boolean kilometers41() {
		return false;
		}
		@Bean
		public boolean kilometers42() {
		return true;
		}
		@Bean
		public boolean kilometers43() {
		return true;
		}
		@Bean
		public boolean kilometers44() {
		return false;
		}
		@Bean
		public boolean kilometers45() {
		return false;
		}
		@Bean
		public boolean kilometers46() {
		return true;
		}
		@Bean
		public boolean kilometers47() {
		return false;
		}
		@Bean
		public boolean kilometers48() {
		return true;
		}
		@Bean
		public boolean kilometers49() {
		return false;
		}
		@Bean
		public boolean kilometers50() {
		return true;
		}
		@Bean
		public float distance51() {
			return 123.1f;
		}
		@Bean
		public float distance52() {
			return 124.1f;
		}
		@Bean
		public float distance53() {
			return 125.1f;
		}
		@Bean
		public float distance54() {
			return 126.1f;
		}
		@Bean
		public float distance55() {
			return 126.1f;
		}
		@Bean
		public float distance56() {
			return 126.1f;
		}
		@Bean
		public float distance57() {
			return 126.1f;
		}
		@Bean
		public float distance58() {
			return 126.1f;
		}
		@Bean
		public float distance59() {
			return 126.1f;
		}
		@Bean
		public float distance60() {
			return 126.1f;
		}
		@Bean
		public float distance61() {
			return 126.1f;
		}
		@Bean
		public float distance62() {
			return 126.1f;
		}
		@Bean
		public float distance63() {
			return 126.1f;
		}
		@Bean
		public float distance64() {
			return 1796.1f;
		}
		@Bean
		public float distance65() {
			return 17926.1f;
		}
		@Bean
		public float distance66() {
			return 12706.1f;
		}
		@Bean
		public float distance67() {
			return 1279076.1f;
		}
		@Bean
		public float distance68() {
			return 1206.1f;
		}
		@Bean
		public float distance69() {
			return 12586.1f;
		}
		@Bean
		public float distance70() {
			return 126789.1f;
		}
		@Bean
		public float distance71() {
			return 1224536.1f;
		}
		@Bean
		public float distance72() {
			return 12706.1f;
		}
		@Bean
		public float distance73() {
			return 1806.1f;
		}
		@Bean
		public float distance74() {
			return 70926.1f;
		}
		@Bean
		public float distance75() {
			return 7926.1f;
		}
		@Bean
		public float distance76() {
			return 13686.1f;
		}
		@Bean
		public float distance77() {
			return 2526.1f;
		}
		@Bean
		public float distance78() {
			return 1586.1f;
		}
		@Bean
		public float distance79() {
			return 12478.1f;
		}
		@Bean
		public float distance80() {
			return 2305.1f;
		}
		@Bean
		public float distance81() {
			return 13686.1f;
		}
		@Bean
		public float distance82() {
			return 2524526.1f;
		}
		@Bean
		public float distance83() {
			return 15386.1f;
		}
		@Bean
		public float distance84() {
			return 12098.1f;
		}
		@Bean
		public float distance85() {
			return 26095.1f;
		}
		@Bean
		public float distance86() {
			return 13686.1f;
		}
		@Bean
		public float distance87() {
			return 2526.1f;
		}
		@Bean
		public float distance88() {
			return 1586.1f;
		}
		@Bean
		public float distance89() {
			return 1278.1f;
		}
		@Bean
		public float distance90() {
			return 239.1f;
		}
		@Bean
		public float distance91() {
			return 13686.1f;
		}
		@Bean
		public float distance92() {
			return 2526.1f;
		}
		@Bean
		public float distance93() {
			return 1586.1f;
		}
		@Bean
		public float distance94() {
			return 12780.1f;
		}
		@Bean
		public float distance95() {
			return 23607.1f;
		}
		@Bean
		public float distance96() {
			return 13686.1f;
		}
		@Bean
		public float distance97() {
			return 2526.1f;
		}
		@Bean
		public float distance98() {
			return 15836.1f;
		}
		@Bean
		public float distance99() {
			return 127338.1f;
		}
		@Bean
		public float distance100() {
			return 2395775.1f;
		}
		@Bean
		public String carOwnerName1() {
			return "nayan";
		}

		@Bean
		public String carOwnerName2() {
			return "kobra";
		}
		@Bean
		public String carOwnerName3() {
			return "basu";
		}
		@Bean
		public String carOwnerName4() {
			return "praveen";
		}
		@Bean
		public String carOwnerName5() {
			return "prakrithi";
		}
		@Bean
		public String carOwnerName6() {
			return "na";
		}

		@Bean
		public String carOwnerName7() {
			return "kob";
		}
		@Bean
		public String carOwnerName8() {
			return "baskar";
		}
		@Bean
		public String carOwnerName9() {
			return "pr";
		}
		@Bean
		public String carOwnerName10() {
			return "sundar";
		}
		
		@Bean
		public String carOwnerName11() {
			return "nayanakumar";
		}

		@Bean
		public String carOwnerName12() {
			return "komal";
		}
		@Bean
		public String carOwnerName13() {
			return "guuru";
		}
		@Bean
		public String carOwnerName14() {
			return "manik";
		}
		@Bean
		public String carOwnerName15() {
			return "savan";
		}
		@Bean
		public String carOwnerName16() {
			return "esha";
		}

		@Bean
		public String carOwnerName17() {
			return "ish";
		}
		@Bean
		public String carOwnerName18() {
			return "siva";
		}
		@Bean
		public String carOwnerName19() {
			return "nani";
		}
		@Bean
		public String carOwnerName20() {
			return "prakrith";
		}
		@Bean
		public String carOwnerName21() {
			return"akumar";
		}

		@Bean
		public String carOwnerName22() {
			return "swathi";
		}
		@Bean
		public String carOwnerName23() {
			return "laksmi";
		}
		@Bean
		public String carOwnerName24() {
			return "manikarnika";
		}
		@Bean
		public String carOwnerName25() {
			return "sravana";
		}
		@Bean
		public String carOwnerName26() {
			return "ankita";
		}

		@Bean
		public String carOwnerName27() {
			return "akshatha";
		}
		@Bean
		public String carOwnerName28() {
			return "abhi";
		}
		@Bean
		public String carOwnerName29() {
			return "prabhu";
		}
		@Bean
		public String carOwnerName30() {
			return "naveen";
		}
		@Bean
		public String carOwnerName31() {
			return"pramil";
		}

		@Bean
		public String carOwnerName32() {
			return "swathinaidu";
		}
		@Bean
		public String carOwnerName33() {
			return "laksmi t";
		}
		@Bean
		public String carOwnerName34() {
			return "D manikarnika";
		}
		@Bean
		public String carOwnerName35() {
			return "AB sravana";
		}
		@Bean
		public String carOwnerName36() {
			return "A ankita";
		}

		@Bean
		public String carOwnerName37() {
			return "B akshatha";
		}
		@Bean
		public String carOwnerName38() {
			return "Abhi B";
		}
		@Bean
		public String carOwnerName39() {
			return "P prabhu";
		}
		@Bean
		public String carOwnerName40() {
			return "N naveen";
		}
		@Bean
		public char grade1() {
			return 'A' ;
		}
		@Bean
		public char grade2() {
			return 'B' ;
		}
		@Bean
		public char grade3() {
			return 'C' ;
		}
		@Bean
		public char grade4() {
			return 'D' ;
		}
		@Bean
		public char grade5() {
			return 'A' ;
		}
		@Bean
		public char grade6() {
			return 'E' ;
		}
		@Bean
		public char grade7() {
			return 'A' ;
		}
		@Bean
		public char grade8() {
			return 'F' ;
		}
		@Bean
		public char grade9() {
			return 'G' ;
		}
		@Bean
		public char grade10() {
			return 'A' ;
		}
		@Bean
		public char grade11() {
			return 'D' ;
		}
		@Bean
		public char grade12() {
			return 'I' ;
		}
		@Bean
		public char grade13() {
			return 'G' ;
		}
		@Bean
		public char grade14() {
			return '6' ;
		}
		@Bean
		public char grade15() {
			return '8' ;
		}
		@Bean
		public char grade16() {
			return '7' ;
		}
		@Bean
		public char grade17() {
			return 'A' ;
		}
		@Bean
		public char grade18() {
			return 'X' ;
		}
		@Bean
		public char grade19() {
			return 'Y' ;
		}
		@Bean
		public char grade20() {
			return 'Z' ;
		}
		
		
		
		}



