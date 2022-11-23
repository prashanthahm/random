package Beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import Classes.Door;
import Classes.Fan;
import Classes.Human;
import Classes.Light;
import Classes.Wire;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfiguration {
	
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
	
	public Door door() {
		Door entity = new Door ();
		System.out.println("Door method is running");
		return entity;
	}
	
	
	@Bean
	public String name() {
		String string = new String();
		return "suhana";
	}

	@Bean
	public String name1() {
		String string = new String();
		return "manoharan";
	}

	@Bean
	public String name2() {
		String string = new String();
		return "harish";
	}

	@Bean
	public String name3() {
		String string = new String();
		return "basav";
	}

	@Bean
	public String name4() {
		String string = new String();
		return "Sharathkumar";
	}

	@Bean
	public String name5() {
		String string = new String();
		return "shan";
	}

	@Bean
	public String name6() {
		String string = new String();
		return "mali";
	}

	@Bean
	public String name7() {
		String string = new String();
		return "chandra";
	}

	@Bean
	public String name8() {
		String string = new String();
		return "sahil";
	}

	@Bean
	public String name9() {
		String string = new String();
		return "manju";
	}
	
	@Bean
	public String car() {
		String string = new String();
		return "maruti 800";
	}

	@Bean
	public String car1() {
		String string = new String();
		return "zen";
	}

	@Bean
	public String car2() {
		String string = new String();
		return "thor";
	}

	@Bean
	public String car3() {
		String string = new String();
		return "alto";
	}

	@Bean
	public String car4() {
		String string = new String();
		return "kia";
	}

	@Bean
	public String car5() {
		String string = new String();
		return "duster";
	}

	@Bean
	public String car6() {
		String string = new String();
		return "enova";
	}

	@Bean
	public String car7() {
		String string = new String();
		return "scorpio";
	}

	@Bean
	public String car8() {
		String string = new String();
		return "tuv 300";
	}

	@Bean
	public String car9() {
		String string = new String();
		return "waganor";
	}

	@Bean
	public String car10() {
		String string = new String();
		return "Omini";
	}

	@Bean
	public String car11() {
		String string = new String();
		return "ford endeavour";
	}

	@Bean
	public String car12() {
		String string = new String();
		return "benz";
	}

	@Bean
	public String car13() {
		String string = new String();
		return "skoda rapid";
	}

	@Bean
	public String car14() {
		String string = new String();
		return "ertiga";
	}

	@Bean
	public String car15() {
		String string = new String();
		return "etois";
	}

	@Bean
	public String car16() {
		String string = new String();
		return "lamborgini";
	}

	@Bean
	public String car17() {
		String string = new String();
		return "mustang";
	}

	@Bean
	public String car18() {
		String string = new String();
		return "ferari";
	}

	@Bean
	public String car19() {
		String string = new String();
		return "bugati";
	}

	@Bean
	public String car20() {
		String string = new String();
		return "audi";
	}

	@Bean
	public String car21() {
		String string = new String();
		return "nano";
	}

	@Bean
	public String car22() {
		String string = new String();
		return "nano";
	}

	@Bean
	public String car23() {
		String string = new String();
		return "i20 aasta";
	}

	@Bean
	public String car24() {
		String string = new String();
		return "i20 sports";
	}

	@Bean
	public String car25() {
		String string = new String();
		return "honda city";
	}

	@Bean
	public String car26() {
		String string = new String();
		return "honda amaze";
	}

	@Bean
	public String car27() {
		String string = new String();
		return "ambasador";
	}

	@Bean
	public String car28() {
		String string = new String();
		return "feat";
	}

	@Bean
	public String car29() {
		String string = new String();
		return "cruzer";
	}

	@Bean
	public String car30() {
		String string = new String();
		return "thar";
	}

	@Bean
	public String car31() {
		String string = new String();
		return "honda fit";
	}

	@Bean
	public String car32() {
		String string = new String();
		return "volkswagon";
	}

	@Bean
	public String car33() {
		String string = new String();
		return "toyota";
	}

	@Bean
	public String car34() {
		String string = new String();
		return "ferari testarossa";
	}

	@Bean
	public String car35() {
		String string = new String();
		return "tavera";
	}

	@Bean
	public String car36() {
		String string = new String();
		return "indica";
	}

	@Bean
	public String car37() {
		String string = new String();
		return "indica v2";
	}

	@Bean
	public String car38() {
		String string = new String();
		return "Breeza";
	}

	@Bean
	public String car39() {
		String string = new String();
		return "porche";
	}

	@Bean
	public String car40() {
		String string = new String();
		return "polo";
	}

	@Bean
	public String car41() {
		String string = new String();
		return "fortuner";
	}

	@Bean
	public String car42() {
		String string = new String();
		return "indigo";
	}

	@Bean
	public String car43() {
		String string = new String();
		return "lexus";
	}

	@Bean
	public String car44() {
		String string = new String();
		return "swift";
	}

	@Bean
	public String car45() {
		String string = new String();
		return "swift";
	}

	@Bean
	public String car46() {
		String string = new String();
		return "echo";
	}

	@Bean
	public String car47() {
		String string = new String();
		return "r8";
	}

	@Bean
	public String car48() {
		String string = new String();
		return "MG ";
	}

	@Bean
	public String car49() {
		String string = new String();
		return "Carnival";
	}

	@Bean
	public String car50() {
		String string = new String();
		return "caren";
	}

	@Bean
	public String car51() {
		String string = new String();
		return "volkswagen vento";
	}

	
}
