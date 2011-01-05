package com.bbs.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
/**
 * 中文过滤器
 * @author 刘波
 *
 */
public class EncodingFilter implements Filter {
	private String charset=null;
	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		req.setCharacterEncoding(this.charset);
		resp.setCharacterEncoding(this.charset);
		chain.doFilter(req, resp);

	}

	public void init(FilterConfig arg0) throws ServletException {
		//设置初始化参数
		this.charset=arg0.getInitParameter("charset");
	}

}
