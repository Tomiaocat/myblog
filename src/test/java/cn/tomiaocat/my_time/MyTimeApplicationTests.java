package cn.tomiaocat.my_time;


public class MyTimeApplicationTests {
	
	
	public void contextLoads() {
//		UserRepository userRepository = SpringUtil.getBean("userRepository");
//		User user = new User();
//		user.setName("double");
//		user.setQq_id("782454854");
//		user.setWx_id("h1162280973");
//		userRepository.save(user);
		String url = "https://app.eq28.cn/wapUser/signIn?token=b6bce4a1-5b2d-4344-b404-49d2350d8535";
		String replace = url.replace("wapUser/signIn", "wapActivity/snatchMoney");
		System.out.println(url);
		System.out.println(replace);
		
	}
}