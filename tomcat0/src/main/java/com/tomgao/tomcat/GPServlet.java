package com.tomgao.tomcat;

import java.io.IOException;

/**
 * @author 高立赟
 * @Description
 * @Date 创建于 2021/11/17 11:07
 */
public abstract class GPServlet {

    public void service(GPRequest request, GPResponse response) throws IOException {

        if ("GET".equalsIgnoreCase(request.getMethod())) {
            doGet(request, response);
        } else {
            doPost(request, response);
        }
    }

    protected abstract void doPost(GPRequest request, GPResponse response) throws IOException;

    protected abstract void doGet(GPRequest request, GPResponse response) throws IOException;
}
