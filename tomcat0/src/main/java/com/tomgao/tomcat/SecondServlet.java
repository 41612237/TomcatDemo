package com.tomgao.tomcat;

import java.io.IOException;

/**
 * @author 高立赟
 * @Description
 * @Date 创建于 2021/11/17 11:21
 */
public class SecondServlet extends GPServlet{
    protected void doPost(GPRequest request, GPResponse response) throws IOException {
        response.write("this is second response");
    }

    protected void doGet(GPRequest request, GPResponse response) throws IOException {
        this.doPost(request, response);
    }
}
