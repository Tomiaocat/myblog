package cn.tomiaocat.controller.base;

import cn.tomiaocat.common.BaseConstants;
import cn.tomiaocat.util.Const;
import com.eq.tool.ToolWeb;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;
import java.util.Random;


public class BaseController {
	private static Random random = new Random();
	/**
	 * 获取当前用户id
	 * huangzq
	 * @return
	 */
	public String getCurrentUserId() {
		String userId = (String) this.getRequest().getAttribute(BaseConstants.SESSION_CURRENT_ID);
		return userId;
//		return "4839d1eaf979457dbac459580fe8ac8a";
	}
	/**
	 * 创建重复提交token
	 * @author: huangzq
	 * @date: 2017/12/26 13:21
	 */
	public String createToken(){

		String tokenId = String.valueOf(random.nextLong());
		this.getSession().setAttribute(Const.DEFAULT_TOKEN_NAME,tokenId);
		this.getRequest().setAttribute(Const.DEFAULT_TOKEN_NAME,tokenId);
		return tokenId;
	}

	/**
	 * 获取当前用户
	 * huangzq
	 * @return
	 */
	/*public User getCurrentUser() {
		String userId = this.getCurrentUserId();
		return User.dao.findById(userId);
	}*/

	/**
	 * 获取当前request
	 * @return
	 */
	public HttpServletRequest getRequest(){
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		return  attributes.getRequest();
	}

	/**
	 * 获取当前response
	 * @return
	 */
	public HttpServletResponse getResponse(){
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		return  attributes.getResponse();
	}
	/**
	 * 获取当前session
	 * @author: huangzq
	 * @date: 2017/12/26 10:26
	 */
	public HttpSession getSession(){
		return this.getRequest().getSession();
	}

/*
	*//**
	 * 获取共享session 的数据
	 * @author: huangzq
	 * @date: 2018/1/2 10:01
	 *//*
	public Object getRedisSessionAttr(String name){
		String sessionId = (String)this.getRequest().getAttribute("sessionId");
		if(StringUtil.isNull(sessionId)){
		    return null;
        }
		Cache cache = Redis.use(RedisDb.SESSION.name());
		return cache.hget(sessionId,"sessionAttr:"+name);
	}*/

	/**
	 * 设置共享session 的数据
	 * @author: huangzq
	 * @date: 2018/1/2 10:01
	 */
/*	public void setRedisSessionAttr(String name,Object value){
		System.out.println("setRedisSessionAttr name："+name);
		System.out.println("setRedisSessionAttr value："+value);
		String sessionId = (String)this.getRequest().getAttribute("sessionId");
		if(StringUtil.isNull(sessionId)){
			return ;
		}
		Cache cache = Redis.use(RedisDb.SESSION.name());
		cache.hset(sessionId,"sessionAttr:"+name,value);
	}*/


	public String getPara(String name) {
		return this.getRequest().getParameter(name);
	}


	public String getPara(String name, String defaultValue) {
		String result = this.getRequest().getParameter(name);
		return result != null && !"".equals(result) ? result : defaultValue;
	}


	public Map<String, String[]> getParaMap() {
		return this.getRequest().getParameterMap();
	}
	/**
	 * 判断是否微信浏览器
	 * @return
	 * @author huangzq
	 * 2017年1月5日 下午3:26:21
	 *
	 */
	public boolean isWeiXin(HttpServletRequest request){
		// 获取浏览器
		String ua = request.getHeader("user-agent").toLowerCase();
		return ua.indexOf("micromessenger") > 0;
	}

	/**
	 * 判断是否手机浏览器
	 * @return
	 * @author huanggl
	 * 2017年4月12日 下午16:56:21
	 *
	 */
	public boolean isMobile(HttpServletRequest request){
		// 获取浏览器
		String ua = request.getHeader("user-agent").toLowerCase();
		//.*任意字符出现多次，(?i)忽略大小写
		return ua.matches(".*(?i)(iPhone|iPod|Android|ios|iPad).*");
	}
	/**
	 * 获取登录用户平台
	 */
	/*public String getAppFrom() {
		String result = (String)this.getRedisSessionAttr(BaseConstants.TOKEN_CURRENT_APP_FROM);
		if(StringUtil.isNull(result))
			return "";
		return result;
	}*/
	/**
	 * 获取新的JsonMessage
	 * @author: huangzq
	 * @date: 2017/12/25 15:08
	 */
	public JsonMessage newJM(){
		return new JsonMessage();
	}
	/**
	 * 获取新的ModelAndView
	 * @author: huangzq
	 * @date: 2017/12/25 15:09
	 */
	public ModelAndView newMV(){
		return new ModelAndView();
	}

	/**
	 * 获取ctx
	 * @author: huangzq
	 * @date: 2017/12/18 10:14
	 */
	public String getCtx(){

		return ToolWeb.getContextPath(this.getRequest());
	}

}