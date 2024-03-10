package hello.servlet.web.frontcontroller.v1;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface ControllerV1 {
    //회원 저장. 불러오기 controller를 모두 불러와야힘
    void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

}
