package bitcamp.bootapp.config;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
public class WebConfig implements WebMvcConfigurer {

  public WebConfig() {
    System.out.println("WebConfig 객체 생성됨!");
  }

  // Cross-Origin 관련해서 기본 값 외에 추가로 설정할 게 있다면 이 메서드를 정의한다.
  // 스프링부트가 시작되면 이 메서드를 호출하여 CrossOrigin을 설정할 것이다.
  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**")
    .allowedOrigins("http://localhost:5500", "http://127.0.0.1:5500")
    .allowedMethods("*");
  }

}





