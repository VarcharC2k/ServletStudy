package hello.servlet.basic;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter //get,set을 자동으로 만들어 줌
public class HelloData {

    private String username;
    private int age;
//
//    롬복 라이브러리 사용시 사용할 필요 없음
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
}
