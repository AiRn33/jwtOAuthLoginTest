package social.test.kakao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/* RestTemplate 를 사용하기 위한 Bean 컴포넌트 등록*/
/*

RestTemplate란?

SpringBoot 3.0 부터 지원되는 템플릿읓로 json, xml 응답을 받을 수 있음
또한 Rest Api 서비스를 요청후 받을 수 있계 설계되 있어서 HTTP 프로토콜 (GET, POST, DELETE, PUT) 에 적합한 메소드 제공

자세한 정보는
https://blog.naver.com/hj_kim97/222295259904
블로그에서 확인 가능

*/
@Configuration
public class ClientConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
